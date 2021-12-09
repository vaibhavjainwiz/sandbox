package com.redhat.service.bridge.shard.operator.resources;

/**
 * Since this will be a representation of a Deployment resource, ideally we should implement the Podspecable interface.
 * Supposed to be a Duck Type of Pod. SREs would need all the fine-tuning attributes possible in the target pod.
 * The Controller then can reconcile only the main fields that the core engine would care.
 */
public class BridgeIngressSpec {

    private String image;

    private String customerId;

    private String bridgeName;

    private String id;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}