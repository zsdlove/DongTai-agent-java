package com.secnium.iast.core.handler.models;


import com.secnium.iast.core.handler.vulscan.VulnType;

/**
 * 危险方法策略模型
 *
 * @author dongzhiyong@huoxian.cn
 */
public class IASTSinkModel {
    /**
     * sink点的漏洞类型
     */
    private String type;

    public VulnType getVulnType() {
        return vulnType;
    }

    private VulnType vulnType;

    /**
     * sink点污点所在的参数位置
     */
    private int[] position;

    /**
     * sink点对应的标识
     */
    private String signature;

    /**
     * 标记是否需要 track
     *
     * @param signature
     * @param type
     * @param position
     */
    private boolean track;

    IASTSinkModel(String signature, String type, int[] position, String track) {
        this.signature = signature;
        this.type = type;
        this.vulnType = VulnType.getTypeByName(type);
        this.position = position;
        this.track = "true".equals(track);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int[] getPos() {
        return position;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return this.signature;
    }

    public boolean isTrack() {
        return track;
    }
}
