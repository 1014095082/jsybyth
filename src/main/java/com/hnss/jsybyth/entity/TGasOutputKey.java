package com.hnss.jsybyth.entity;

import java.io.Serializable;

public class TGasOutputKey implements Serializable {
    private String enterid;

    private String outfallCode;

    private static final long serialVersionUID = 1L;

    public String getEnterid() {
        return enterid;
    }

    public void setEnterid(String enterid) {
        this.enterid = enterid;
    }

    public String getOutfallCode() {
        return outfallCode;
    }

    public void setOutfallCode(String outfallCode) {
        this.outfallCode = outfallCode;
    }
}