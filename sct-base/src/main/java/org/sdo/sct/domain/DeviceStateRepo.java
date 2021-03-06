// Copyright 2019 Intel Corporation
// SPDX-License-Identifier: Apache 2.0

package org.sdo.sct.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Spring Data JPA repository for DeviceState entities.
 */
public interface DeviceStateRepo extends JpaRepository<DeviceState, String> {

}
