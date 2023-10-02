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


package org.finos.legend.engine.language.snowflakeApp.deployment;

import org.finos.legend.engine.language.pure.compiler.toPureGraph.PureModel;
import org.finos.legend.engine.language.pure.dsl.generation.extension.Artifact;
import org.finos.legend.engine.language.pure.dsl.generation.extension.ArtifactGenerationExtension;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextData;
import org.finos.legend.pure.generated.Root_meta_external_function_activator_snowflakeApp_SnowflakeApp;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement;
import org.slf4j.Logger;
import java.util.Collections;
import java.util.List;

public class SnowflakeAppArtifactGenerationExtension implements ArtifactGenerationExtension
{
    private static final String ROOT_PATH = "snowflakeApp";
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(SnowflakeAppArtifactGenerationExtension.class);

    @Override
    public String getKey()
    {
        return ROOT_PATH;
    }

    @Override
    public boolean canGenerate(PackageableElement element)
    {
        return false;
    }


    @Override
    public List<Artifact> generate(PackageableElement element, PureModel pureModel, PureModelContextData data, String clientVersion)
    {
       try
        {
            /* add content logic here */
            Artifact output = new Artifact(null, element.getName() + "_snowflakeAppArtifact.json", "json");
            return Collections.singletonList(output);
        }
        catch (Exception ex)
        {
            LOGGER.warn("Error generating openapi specification", ex);
        }

        return Collections.emptyList();
        
    }

}
