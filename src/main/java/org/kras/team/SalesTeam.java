package org.kras.team;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee{

  private List<Payee> payees = new ArrayList<>();
  void add(Payee payee) {
    payees.add(payee);
  }

  public void payExpenses(int amount) {
    payees.forEach(p -> p.payExpenses(amount));
  }

}
