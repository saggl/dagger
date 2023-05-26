package org.chelonix.dagger.codegen.introspection;

import jakarta.json.bind.annotation.JsonbProperty;

public class EnumValue {

    private String name;
    private String Description;

    @JsonbProperty("isDeprecated")
    private boolean deprecated; // isDeprecated
    private String DeprecationReason;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public String getDeprecationReason() {
        return DeprecationReason;
    }

    public void setDeprecationReason(String deprecationReason) {
        DeprecationReason = deprecationReason;
    }

    @Override
    public String toString() {
        return "EnumValue{" +
                "name='" + name + '\'' +
                // ", Description='" + Description + '\'' +
                ", deprecated=" + deprecated +
                // ", DeprecationReason='" + DeprecationReason + '\'' +
                '}';
    }
}
