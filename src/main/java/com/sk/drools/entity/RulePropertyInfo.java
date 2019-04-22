package com.sk.drools.entity;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "rule_property_info")
public class RulePropertyInfo {
    @Id
    @Column(name = "RULE_PROPERTY_ID")
    private String rulePropertyId;

    @Column(name = "RULE_PROPERTY_IDENTIFY")
    private String rulePropertyIdentify;

    @Column(name = "RULE_PROPERTY_NAME")
    private String rulePropertyName;

    @Column(name = "RULE_PROPERTY_DESC")
    private String rulePropertyDesc;

    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;

    @Column(name = "IS_EFFECT")
    private String isEffect;

    @Column(name = "REMARK")
    private String remark;

    public String getRulePropertyId() {
        return rulePropertyId;
    }

    public void setRulePropertyId(String rulePropertyId) {
        this.rulePropertyId = rulePropertyId;
    }

    public String getRulePropertyIdentify() {
        return rulePropertyIdentify;
    }

    public void setRulePropertyIdentify(String rulePropertyIdentify) {
        this.rulePropertyIdentify = rulePropertyIdentify;
    }

    public String getRulePropertyName() {
        return rulePropertyName;
    }

    public void setRulePropertyName(String rulePropertyName) {
        this.rulePropertyName = rulePropertyName;
    }

    public String getRulePropertyDesc() {
        return rulePropertyDesc;
    }

    public void setRulePropertyDesc(String rulePropertyDesc) {
        this.rulePropertyDesc = rulePropertyDesc;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(String isEffect) {
        this.isEffect = isEffect;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
