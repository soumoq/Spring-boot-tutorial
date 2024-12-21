package com.ecommerceApp.ecommerceApp.springWithoutBoot;

public class Build {
    int buildParam;
    Compile compile;

    public Build(int buildParam, Compile compile) {
        this.buildParam = buildParam;
        this.compile = compile;
    }

    protected void building() {
        compile.compiling(buildParam);
    }
}
