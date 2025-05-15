package com.app.budgetmanager.respository;

import com.app.budgetmanager.Enitiy.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BudgetRepository  extends JpaRepository<Budget, Integer> {
}
