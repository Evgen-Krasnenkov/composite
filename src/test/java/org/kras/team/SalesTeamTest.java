package org.kras.team;

import org.junit.jupiter.api.Test;

class SalesTeamTest {
    @Test
    void givenTeam_whenTeamCompose_thenPatternApplies() {
        Manager jane = new Manager("Jane");
        Salesperson bob = new Salesperson("Bob", jane);
        Salesperson sue = new Salesperson("Sue", jane);

        SalesTeam team = new SalesTeam();
        team.add(jane);
        team.add(bob);
        team.add(sue);

        pay(jane, 100);
        pay(bob, 300);
        pay(team, 200);

    }

    private static void pay(Payee payee, int amount) {
        System.out.println("Expenses have been requested");
        payee.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }

}