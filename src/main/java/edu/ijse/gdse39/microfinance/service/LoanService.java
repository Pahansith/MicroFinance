package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/10/2017
 * @project MicroFinance
 */

public interface LoanService {
    ArrayList<LoanDto> getCustomerPreviousLoanList(int customerId);

    ArrayList<LoanProductDto> getLoanProductList();

    String saveNewLoan(LoanAddInfoDto loanAddInfoDto, ArrayList<MemberDto> guarentorList,MemberDto selectedMember,ArrayList<LoanProductDto> loanProductList);

    CustomerFeedbackDataDto getCustomerFeedback(int memId);

    LoanDto getCustomerLoanDetailsForApproval(Integer memberId);

    boolean approveLoan(MemberDto selectedMember, LoanDto customerLoanDetail);

    List<LoanDto> getMemberLoanDetails(Integer id) throws Exception;
}
