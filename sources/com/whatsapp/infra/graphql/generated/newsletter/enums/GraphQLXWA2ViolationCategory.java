package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2ViolationCategory {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    UNKNOWN("UNKNOWN"),
    HATESPEECH("HATESPEECH"),
    SUICIDE_OR_SELFINJURY("SUICIDE_OR_SELFINJURY"),
    ADULT_SEXUAL_EXPLOITATION("ADULT_SEXUAL_EXPLOITATION"),
    ADULT_SEXUAL_SOLICITATION("ADULT_SEXUAL_SOLICITATION"),
    BULLYING_AND_HARASSMENT("BULLYING_AND_HARASSMENT"),
    CHILD_SEXUAL_EXPLOITATION("CHILD_SEXUAL_EXPLOITATION"),
    COORDINATING_HARM_AND_PROMOTING_CRIME("COORDINATING_HARM_AND_PROMOTING_CRIME"),
    CYBERSECURITY("CYBERSECURITY"),
    DANGEROUS_INDIVIDUALS_AND_ORGS("DANGEROUS_INDIVIDUALS_AND_ORGS"),
    FRAUD_AND_DECEPTION("FRAUD_AND_DECEPTION"),
    GRAPHIC_VIOLENCE("GRAPHIC_VIOLENCE"),
    HARMFUL_HEALTH("HARMFUL_HEALTH"),
    HATE("HATE"),
    HUMAN_EXPLOITATION("HUMAN_EXPLOITATION"),
    INTELLECTUALPROPERTY_RIGHTS("INTELLECTUALPROPERTY_RIGHTS"),
    PLATFORM_POLICY("PLATFORM_POLICY"),
    PORN("PORN"),
    PRIVACY_VIOLATION("PRIVACY_VIOLATION"),
    REGULATED_GOODS("REGULATED_GOODS"),
    SPAM("SPAM"),
    SSI("SSI"),
    VIOLENCE_AND_INCITEMENT("VIOLENCE_AND_INCITEMENT"),
    IP_TRADEMARK_REPORTED("IP_TRADEMARK_REPORTED"),
    IP_COUNTERFEIT_REPORTED("IP_COUNTERFEIT_REPORTED"),
    IP_COPYRIGHT_REPORTED("IP_COPYRIGHT_REPORTED");
    
    public final String serverValue;

    public String toString() {
        return this.serverValue;
    }

    /* access modifiers changed from: public */
    GraphQLXWA2ViolationCategory(String str) {
        this.serverValue = str;
    }
}
