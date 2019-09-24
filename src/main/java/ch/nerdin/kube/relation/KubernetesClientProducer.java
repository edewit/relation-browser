package ch.nerdin.kube.relation;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

@ApplicationScoped
public class KubernetesClientProducer {

    @Produces
    @ApplicationScoped
    KubernetesClient getClient() {
        return new DefaultKubernetesClient();
    }
}
