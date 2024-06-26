//  Copyright 2022 Goldman Sachs
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.

package org.finos.legend.engine.plan.execution.stores.service.test.contentPattern;

import org.finos.legend.engine.protocol.pure.v1.model.data.contentPattern.ContentPattern;
import org.finos.legend.engine.shared.core.extension.LegendExtension;
import org.finos.legend.engine.shared.core.extension.LegendModuleSpecificExtension;

public interface ContentPatternToWiremockPatternGenerator extends LegendModuleSpecificExtension
{
    boolean supports(ContentPattern contentPattern);

    com.github.tomakehurst.wiremock.matching.StringValuePattern generate(ContentPattern contentPattern);
}
