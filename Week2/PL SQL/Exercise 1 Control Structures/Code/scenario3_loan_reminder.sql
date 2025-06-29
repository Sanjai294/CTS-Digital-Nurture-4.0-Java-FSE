BEGIN
  FOR loan_rec IN (
    SELECT LoanID, CustomerID, DueDate
    FROM Loans
    WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ' || loan_rec.LoanID || 
      ' for Customer ' || loan_rec.CustomerID ||
      ' is due on ' || TO_CHAR(loan_rec.DueDate, 'YYYY-MM-DD')
    );
  END LOOP;
END;
/
