package com.redhat.service.smartevents.shard.operator.v2.providers;

import com.redhat.service.smartevents.shard.operator.core.providers.TemplateImportConfig;
import com.redhat.service.smartevents.shard.operator.core.providers.TemplateProvider;
import com.redhat.service.smartevents.shard.operator.v2.resources.camel.CamelIntegration;
import com.redhat.service.smartevents.shard.operator.v2.resources.knative.KafkaSource;

import io.fabric8.kubernetes.client.CustomResource;

public interface TemplateProviderV2 extends TemplateProvider {
    CamelIntegration loadCamelIntegrationTemplate(CustomResource owner, TemplateImportConfig config);

    KafkaSource loadKafkaSourceTemplate(CustomResource owner, TemplateImportConfig config);
}
