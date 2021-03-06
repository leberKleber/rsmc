package io.github.leberkleber.ljcm.parser;

import java.util.*;

public class ConfigurationParserDummyImpl implements ConfigurationParser {
    private List<Class> classes;

    public ConfigurationParserDummyImpl(Class... classes) {
        this.classes = Arrays.asList(classes);
    }

    @Override
    public Set<Class> getResponsibleClasses() {
        return new HashSet<>(classes);
    }

    @Override
    public Object parseValue(String value, Class targetClass) {
        return value;
    }
}
