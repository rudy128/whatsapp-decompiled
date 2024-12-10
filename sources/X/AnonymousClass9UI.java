package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.9UI  reason: invalid class name */
public abstract class AnonymousClass9UI {
    public static C22344B3v A00;
    public static C22344B3v A01;
    public static C22344B3v A02;
    public static C22344B3v A03;
    public static C22344B3v A04;
    public static C22344B3v A05;
    public static C22344B3v A06;
    public static C22344B3v A07 = new C192589oe("content://com.instagram.liteprovider.FirstPartyUserValuesLiteProviderV2", "com.instagram.android", new C192509oW((String) null, (String) null, new String[0]), C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER);
    public static C22344B3v A08;
    public static C22344B3v A09;
    public static final List A0A;
    public static final List A0B;
    public static final List A0C;
    public static final List A0D = Arrays.asList(new C192589oe[0]);
    public static final List A0E = Arrays.asList(new C192589oe[0]);

    /* JADX WARNING: type inference failed for: r0v1, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.B3v, X.9oe] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.B3v, X.9oe] */
    static {
        C192509oW r6 = new C192509oW("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
        C24360Bzv bzv = C24360Bzv.FACEBOOK;
        A04 = new C192589oe("content://com.facebook.katana.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.katana", r6, bzv);
        A01 = new C192589oe("content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.wakizashi", new C192509oW("user_values", "name='active_session_info'", C17880vN.A1b(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", 2, 1)), bzv);
        A05 = new C192589oe("content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", new C192509oW("user_values", "name='active_session_info'", C17880vN.A1b(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", 2, 1)), bzv);
        A02 = new C192589oe("content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", new C192509oW("user_values", "name='active_session_info'", C17880vN.A1b(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", 2, 1)), bzv);
        C192509oW r14 = new C192509oW((String) null, (String) null, new String[0]);
        C24360Bzv bzv2 = C24360Bzv.INSTAGRAM;
        A09 = new C192589oe("content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", r14, bzv2);
        A06 = new C192589oe("content://com.instagram.liteprovider.FirstPartyUserValuesLiteProvider", "com.instagram.android", new C192509oW((String) null, (String) null, new String[0]), bzv2);
        A03 = new C192589oe("content://com.facebook.katana.provider.UserValuesProvider/user_values", "com.facebook.katana", new C192509oW("user_values", "name='all_session_info'", C17880vN.A1b(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", 2, 1)), bzv);
        A00 = new C192589oe("content://com.facebook.wakizashi.provider.UserValuesProvider/user_values", "com.facebook.wakizashi", new C192509oW("user_values", "name='all_session_info'", C17880vN.A1b(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", 2, 1)), bzv);
        A08 = new C192589oe("content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", new C192509oW((String) null, "all_session_info", new String[0]), bzv2);
        C192589oe[] r1 = new C192589oe[2];
        r1[0] = A04;
        A0C = AnonymousClass8BR.A15(A09, r1, 1);
        C192589oe[] r12 = new C192589oe[3];
        r12[0] = A05;
        r12[1] = A06;
        A0B = AnonymousClass8BR.A15(A07, r12, 2);
        C192589oe[] r13 = new C192589oe[2];
        r13[0] = A03;
        A0A = AnonymousClass8BR.A15(A08, r13, 1);
    }
}
