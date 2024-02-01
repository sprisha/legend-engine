// Copyright 2023 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.connection;

import org.finos.legend.engine.shared.core.extension.LegendConnectionExtension;
import org.finos.legend.engine.shared.core.extension.LegendExtension;

import java.util.List;
import java.util.Properties;

public interface RelationalDatabaseManager extends LegendConnectionExtension
{
    List<String> getIds();

    String getDriver();

    String buildURL(String host, int port, String databaseName, Properties properties);
}
