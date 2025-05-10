package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.OnlinePaymentService;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double baseValue = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(baseValue, i);
			double paymentFee = onlinePaymentService.paymentFee(baseValue + interest);
			double value = baseValue + interest + paymentFee;
			contract.getInstallments().add(new Installment(dueDate, value));
		}
	}
}
