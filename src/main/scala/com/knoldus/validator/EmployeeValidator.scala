package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee
import com.questions.emailValidator.EmailValidator

class EmployeeValidator (companyName: CompanyReadDto, validateEmail: EmailValidator) {

  def employeeIsValid(employee: Employee): Boolean = {

    if(companyName.getCompanyByName(employee.companyName).isDefined && validateEmail.emailIsValid(employee.emailId))
      true
    else
      false
  }
}