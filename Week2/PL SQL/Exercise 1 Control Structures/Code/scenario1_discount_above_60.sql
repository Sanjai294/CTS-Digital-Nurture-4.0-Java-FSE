BEGIN
  FOR cust_rec IN (SELECT CustomerID, Age FROM Customers) LOOP
    IF cust_rec.Age > 60 THEN
      UPDATE Customers
      SET Balance = Balance * 0.99  -- assuming interest is in balance for simulation
      WHERE CustomerID = cust_rec.CustomerID;

      DBMS_OUTPUT.PUT_LINE('Applied 1% interest discount to Customer ID: ' || cust_rec.CustomerID);
    END IF;
  END LOOP;
END;
/
