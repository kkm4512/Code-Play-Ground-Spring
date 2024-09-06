package org.terror.codeplaygroundspring.applicationProfile;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileChecker {
    private final Environment env;

    public ProfileChecker(Environment env) {
        this.env = env;
    }

    public String checkActiveProfile() {
        String[] activeProfiles = env.getActiveProfiles();
        return activeProfiles[0];
    }
}
