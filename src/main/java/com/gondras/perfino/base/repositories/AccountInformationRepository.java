package com.gondras.perfino.base.repositories;

import com.gondras.perfino.base.entities.AccountInformation;
import org.springframework.data.repository.CrudRepository;

public interface AccountInformationRepository extends CrudRepository<AccountInformation, Long> {
}
