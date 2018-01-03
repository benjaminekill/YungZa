package com.buckwa.service.intf.pbp;

import com.buckwa.domain.common.BuckWaRequest;
import com.buckwa.domain.common.BuckWaResponse;


public interface InstituteService {
	 
	public BuckWaResponse recalAllByYear(BuckWaRequest request);
	public BuckWaResponse recalculate(BuckWaRequest request);
}

