/**
 * Copyright © 2019 同程艺龙 (zhihui.li@ly.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ly.train.web.service.extorder;

import org.springframework.beans.factory.annotation.Autowired;
import com.ly.train.flower.common.annotation.FlowerService;
import com.ly.train.flower.common.service.Service;
import com.ly.train.flower.common.service.container.ServiceContext;
import com.ly.train.web.dao.ExtOrderDao;
import com.ly.train.web.model.ExtOrderDTO;

/**
 * @author leeyazhou
 *
 */
@FlowerService
public class CreateExtOrderService implements Service<ExtOrderDTO, Boolean> {

  @Autowired
  private ExtOrderDao extOrderDao;

  @Override
  public Boolean process(ExtOrderDTO message, ServiceContext context) throws Throwable {
    return null;
  }

}
