package com.example.expensecalculator;

import org.springframework.data.repository.CrudRepository;

public interface ExpensesRepository extends CrudRepository<Expenses, Long> {
}
