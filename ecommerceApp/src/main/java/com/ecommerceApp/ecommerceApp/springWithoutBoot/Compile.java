package com.ecommerceApp.ecommerceApp.springWithoutBoot;

public class Compile {
    private int compileId;

    public int getCompileId() {
        return compileId;
    }

    public void setCompileId(int compileId) {
        this.compileId = compileId;
    }

    protected void compiling(int buildParam){
        System.out.println("Compiling code : " + buildParam);
        System.out.println("Compile id : " + getCompileId());
    }
}
