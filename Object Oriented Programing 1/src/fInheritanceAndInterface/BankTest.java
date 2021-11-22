package fInheritanceAndInterface;

import java.util.*;

public class BankTest {
    public static void main(String[] args) {
            Checking c = new Checking();
            Saving s = new Saving();
            Retirement r = new Retirement();
            System.out.println(printName.myString("Bond"));
            List<ParentBank> ParentBankObjects = new ArrayList<ParentBank>();
            ParentBankObjects.add(c);
            ParentBankObjects.add(s);
            ParentBankObjects.add(r);

            List<thebonusInterface> bonusInterfaceObjects = new ArrayList<thebonusInterface>();
            bonusInterfaceObjects.add(s);
            bonusInterfaceObjects.add(r);

            for(ParentBank d : ParentBankObjects) {
                System.out.println(d.name());
                System.out.println(d.myName());
                d.makeDeposit(300);
                System.out.println(d.getAccountBalance());
                d.makeWithdrawl(150);
                System.out.println(d.getAccountBalance());
            }

            for(thebonusInterface b : bonusInterfaceObjects) {
                System.out.println("**************************\n"
                        + b.isBonus());
            }
        }
    }


