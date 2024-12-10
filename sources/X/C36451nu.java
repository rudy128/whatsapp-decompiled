package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.contact.contactform.ContactFormBottomSheetFragment;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;

/* renamed from: X.1nu  reason: invalid class name and case insensitive filesystem */
public final class C36451nu {
    public final C18030ve A00;
    public final AnonymousClass11S A01;
    public final C36441nt A02 = ((C36441nt) AnonymousClass12Q.A03(C36441nt.class));
    public final AnonymousClass1CJ A03;
    public final C24751Ln A04;

    public static Intent A00(C36451nu r4, String str, String str2, boolean z, boolean z2) {
        Intent intent;
        C17960vV.A0D(!r4.A01.A0N());
        if (z) {
            intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        } else {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/name");
                contentValues.put("data2", str2);
                arrayList.add(contentValues);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("mimetype", "vnd.android.cursor.item/organization");
                contentValues2.put("data1", str2);
                arrayList.add(contentValues2);
                intent.putParcelableArrayListExtra("data", arrayList);
            } else {
                intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
            }
        }
        intent.putExtra("phone", str);
        intent.putExtra("phone_type", 2);
        intent.setFlags(524288);
        return intent;
    }

    private String A01(AnonymousClass1E7 r4, AnonymousClass1BI r5) {
        if (r4 != null && r4.A0C()) {
            return r4.A0L();
        }
        if (!C18020vd.A05(C18040vf.A02, this.A00, 945) || r4 == null) {
            return this.A03.A0F(r5);
        }
        return r4.A0c;
    }

    public Bundle A03(AnonymousClass1E7 r7) {
        Bundle bundle = new Bundle();
        AnonymousClass1BI r5 = r7.A0J;
        if (r5 != null) {
            bundle.putString("contact_data_phone", AnonymousClass17K.A00(C42771yi.A00(), r5));
            bundle.putString("contact_chat_jid", r5.getRawString());
            String A0K = r7.A0K();
            String str = r7.A0T;
            if (!(A0K == null || str == null || !A0K.contains(str))) {
                bundle.putString("contact_data_first_name", r7.A0T);
            }
            String A0K2 = r7.A0K();
            String str2 = r7.A0S;
            if (!(A0K2 == null || str2 == null || !A0K2.contains(str2))) {
                bundle.putString("contact_data_last_name", r7.A0S);
            }
            bundle.putString("contact_data_business_name", r7.A0Q);
            bundle.putLong("native_contact_sync_to_device", (long) r7.A09);
            bundle.putInt("contact_sync_policy", r7.A09);
            C59042lf r0 = r7.A0H;
            if (r0 != null) {
                bundle.putString("extra_contact_phone_number", r0.A01);
                bundle.putLong("raw_contact_id", r7.A0H.A00);
            }
            bundle.putString("contact_chat_jid", r5.getRawString());
            boolean z = true;
            if (r7.A09 != 1) {
                z = false;
            }
            bundle.putBoolean("wa_only_contact", z);
            bundle.putLong("wa_contact_table_column_id", r7.A0J());
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r1 == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle A04(X.AnonymousClass1E7 r6, boolean r7) {
        /*
            r5 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            X.1BI r4 = r6.A0J
            if (r4 == 0) goto L_0x0085
            java.lang.String r1 = "contact_data_phone"
            X.1yi r0 = X.C42771yi.A00()
            java.lang.String r0 = X.AnonymousClass17K.A00(r0, r4)
            r3.putString(r1, r0)
            java.lang.String r1 = r6.A0K()
            java.lang.String r0 = r6.A0T
            if (r1 == 0) goto L_0x0027
            if (r0 == 0) goto L_0x0027
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            java.lang.String r1 = "contact_data_first_name"
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r6.A0T
            r3.putString(r1, r0)
        L_0x0031:
            if (r7 == 0) goto L_0x0038
            java.lang.String r0 = r6.A0c
            r3.putString(r1, r0)
        L_0x0038:
            java.lang.String r0 = "entry_point_qr_code"
            r3.putBoolean(r0, r7)
            java.lang.String r1 = r6.A0K()
            java.lang.String r0 = r6.A0S
            if (r1 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = "contact_data_last_name"
            java.lang.String r0 = r6.A0S
            r3.putString(r1, r0)
        L_0x0054:
            java.lang.String r1 = "contact_data_business_name"
            java.lang.String r0 = r6.A0Q
            r3.putString(r1, r0)
            X.2lf r0 = r6.A0H
            if (r0 == 0) goto L_0x0066
            long r1 = r0.A00
            java.lang.String r0 = "raw_contact_id"
            r3.putLong(r0, r1)
        L_0x0066:
            java.lang.String r1 = "contact_chat_jid"
            java.lang.String r0 = r4.getRawString()
            r3.putString(r1, r0)
            int r0 = r6.A09
            r1 = 1
            if (r0 == r1) goto L_0x0075
            r1 = 0
        L_0x0075:
            java.lang.String r0 = "wa_only_contact"
            r3.putBoolean(r0, r1)
            java.lang.String r2 = "wa_contact_table_column_id"
            long r0 = r6.A0J()
            r3.putLong(r2, r0)
        L_0x0085:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36451nu.A04(X.1E7, boolean):android.os.Bundle");
    }

    public void A05(Activity activity, AnonymousClass1GP r15, C30191dX r16, C219217x r17, C19830z4 r18, AnonymousClass1E7 r19, AnonymousClass1BI r20) {
        PhoneUserJid A0D;
        String A002;
        AnonymousClass1BI r3 = r20;
        Bundle bundle = new Bundle();
        AnonymousClass1E7 r6 = r19;
        String A012 = A01(r6, r3);
        C18030ve r12 = this.A00;
        String[] A013 = AnonymousClass70u.A01(r12, A012);
        if (A013 == null || A013.length != 2) {
            bundle.putString("contact_data_first_name", A012);
        } else {
            bundle.putString("contact_data_first_name", A013[0]);
            bundle.putString("contact_data_last_name", A013[1]);
        }
        if (r19 != null && r6.A0C()) {
            bundle.putString("contact_data_business_name", A012);
        }
        if (C22971Dz.A0X(r3)) {
            A002 = AnonymousClass17K.A00(C42771yi.A00(), r3);
        } else {
            if (C22971Dz.A0T(r3) && (A0D = this.A04.A0D((AnonymousClass1E1) r3)) != null) {
                A002 = AnonymousClass17K.A00(C42771yi.A00(), A0D);
            }
            this.A02.A00(activity, bundle, r15, r16, r17, r18, r12);
        }
        bundle.putString("contact_data_phone", A002);
        this.A02.A00(activity, bundle, r15, r16, r17, r18, r12);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0031: MOVE  (r1v0 int) = (r19v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public void A06(android.app.Activity r13, X.AnonymousClass1GP r14, X.C30191dX r15, X.C219217x r16, X.C19830z4 r17, X.AnonymousClass73C r18, int r19) {
        /*
            r12 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r5 = r18
            if (r18 == 0) goto L_0x0044
            X.6oE r0 = r5.A0A
            java.lang.String r4 = r0.A01
            X.0ve r0 = r12.A00
            java.lang.String[] r3 = X.AnonymousClass70u.A01(r0, r4)
            java.lang.String r2 = "contact_data_first_name"
            if (r3 == 0) goto L_0x0053
            int r1 = r3.length
            r0 = 2
            if (r1 != r0) goto L_0x0053
            r0 = 0
            r0 = r3[r0]
            r6.putString(r2, r0)
            r0 = 1
            r1 = r3[r0]
            java.lang.String r0 = "contact_data_last_name"
            r6.putString(r0, r1)
        L_0x0029:
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L_0x0044
            int r0 = r0.size()
            r1 = r19
            if (r0 <= r1) goto L_0x0044
            java.util.List r0 = r5.A06
            java.lang.Object r0 = r0.get(r1)
            X.6ib r0 = (X.C129926ib) r0
            java.lang.String r1 = "contact_data_phone"
            java.lang.String r0 = r0.A02
            r6.putString(r1, r0)
        L_0x0044:
            X.1nt r4 = r12.A02
            X.0ve r11 = r12.A00
            r5 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r4.A00(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0053:
            r6.putString(r2, r4)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36451nu.A06(android.app.Activity, X.1GP, X.1dX, X.17x, X.0z4, X.73C, int):void");
    }

    public void A07(AnonymousClass1GP r4, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("contact_data_phone", str);
        bundle.putBoolean("entry_point_dialer", true);
        C18070vi.A0d(r4, 0);
        ContactFormBottomSheetFragment contactFormBottomSheetFragment = new ContactFormBottomSheetFragment();
        contactFormBottomSheetFragment.A1R(bundle);
        C20098A7b.A02(contactFormBottomSheetFragment, r4);
    }

    public C36451nu(AnonymousClass11S r2, AnonymousClass1CJ r3, C24751Ln r4, C18030ve r5) {
        this.A00 = r5;
        this.A01 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r5.A0C() == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent A02(X.AnonymousClass1E7 r5, X.AnonymousClass1BI r6, boolean r7) {
        /*
            r4 = this;
            X.1yi r0 = X.C42771yi.A00()
            java.lang.String r3 = X.AnonymousClass17K.A00(r0, r6)
            java.lang.String r2 = r4.A01(r5, r6)
            if (r5 == 0) goto L_0x0015
            boolean r1 = r5.A0C()
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            android.content.Intent r0 = A00(r4, r3, r2, r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36451nu.A02(X.1E7, X.1BI, boolean):android.content.Intent");
    }
}
