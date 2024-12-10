package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9Ko  reason: invalid class name and case insensitive filesystem */
public enum C179959Ko implements B9I {
    CREDENTIAL_ID("credential_id"),
    COUNTRY("country"),
    READABLE_NAME("readable_name"),
    ISSUER_NAME("issuer_name"),
    TYPE(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE),
    CARD_NETWORK("card_network"),
    CREATION_TIME_MILLIS("creation_time_millis"),
    UPDATED_TIME_MILLIS("updated_time_millis"),
    IS_DEFAULT_P2P_DEBIT("is_default_p2p_debit"),
    IS_DEFAULT_P2P_CREDIT("is_default_p2p_credit"),
    IS_DEFAULT_P2M_DEBIT("is_default_p2m_debit"),
    IS_DEFAULT_P2M_CREDIT("is_default_p2m_credit"),
    BALANCE("balance"),
    BALANCE_TIME_MILLIS("balance_time_millis"),
    ICON_BLOB("icon_blob"),
    WAS_PIN_EDUCATION_SHOWN("was_pin_education_shown");
    
    public final String fieldName;

    /* access modifiers changed from: public */
    static {
        C179959Ko[] r14;
        A00 = C19780yz.A00(r14);
    }

    /* access modifiers changed from: public */
    C179959Ko(String str) {
        this.fieldName = str;
    }

    public String BRa() {
        return this.fieldName;
    }
}
