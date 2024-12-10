package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.View;
import com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.conversation.CapturePictureOrVideoDialogFragment;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5tO  reason: invalid class name and case insensitive filesystem */
public final class C115095tO extends C75443hV implements C107045Ye {
    public int A00;
    public AnonymousClass3RS A01;
    public C74863d2 A02;
    public List A03;
    public final int A04;
    public final BroadcastReceiver A05;
    public final AnonymousClass01E A06;
    public final AnonymousClass190 A07;
    public final AnonymousClass1FR A08;
    public final AnonymousClass1KB A09;
    public final AnonymousClass5YX A0A;
    public final AnonymousClass11S A0B;
    public final C34531kd A0C;
    public final C33251iW A0D;
    public final C85424Ni A0E;
    public final C37551pj A0F;
    public final ConversationCommunityViewModel A0G;
    public final C30191dX A0H;
    public final AnonymousClass8A7 A0I;
    public final C88184Yq A0J;
    public final C31131f4 A0K;
    public final C23501Gn A0L;
    public final AnonymousClass1NM A0M;
    public final AnonymousClass11C A0N;
    public final C219217x A0O;
    public final C19830z4 A0P;
    public final C18030ve A0Q;
    public final AnonymousClass18K A0R;
    public final AnonymousClass1BI A0S;
    public final MentionableEntry A0T;
    public final A0Q A0U;
    public final C133846pb A0V;
    public final C18010vc A0W;
    public final AnonymousClass1L4 A0X;
    public final C136736uJ A0Y;
    public final C26521Sl A0Z;
    public final AnonymousClass1DC A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;
    public final Integer A0f;
    public final boolean A0g;
    public final C218617r A0h;
    public final C196149uX A0i;
    public final C26911Ty A0j;
    public final A1M A0k;
    public final BDO A0l;
    public final C127116dp A0m;
    public final AnonymousClass11Z A0n;
    public final C125946bw A0o;
    public final AnonymousClass689 A0p;
    public final C58432kg A0q;
    public final C85754Op A0r;
    public final AnonymousClass1L1 A0s;
    public final C1602487s A0t;
    public final AnonymousClass1LD A0u;
    public final C22525BBi A0v = new AnonymousClass7M0(this);
    public final AnonymousClass10I A0w;

    private void A00() {
        int i;
        String str;
        if (this.A0O.A04(AnonymousClass73I.A03()) != 0) {
            AnonymousClass01E r4 = this.A06;
            C18070vi.A0d(r4, 0);
            if (!r4.isFinishing()) {
                if (!AnonymousClass112.A07()) {
                    i = 2131894422;
                } else {
                    i = 2131894388;
                    if (!AnonymousClass112.A09()) {
                        i = 2131894424;
                    }
                }
                r4.startActivityForResult(AnonymousClass74O.A01(r4, 2131894387, i), 807);
            }
        } else if (this.A0M.A04(this.A0L)) {
            C31131f4 r2 = this.A0K;
            AnonymousClass1L1 r1 = this.A0s;
            AnonymousClass1BI r9 = this.A0S;
            AnonymousClass4aV.A07(r2, r9, r1, this.A0w);
            C18030ve r12 = this.A0Q;
            AnonymousClass1KB r7 = this.A09;
            C136736uJ r8 = this.A0Y;
            AnonymousClass01E r6 = this.A06;
            r12.A0G(2614);
            boolean z = true;
            if (r9 != null) {
                if (r8 == null || !C87544Vz.A00(r8.A00)) {
                    z = false;
                }
                Intent A072 = AnonymousClass3MZ.A07(r6, 0);
                String packageName = r6.getPackageName();
                if (z) {
                    str = "com.whatsapp.documentpicker.AudioPickerBottomSheetActivity";
                } else {
                    str = "com.whatsapp.audiopicker.AudioPickerActivity";
                }
                A072.setClassName(packageName, str);
                AnonymousClass3MY.A12(A072, r9, "jid");
                try {
                    r6.startActivityForResult(A072, 5);
                    if (r8 != null) {
                        r8.A00(r6);
                    }
                } catch (ActivityNotFoundException e) {
                    Log.e("MediaFileUtils/start-activity ", e);
                    r7.A08(2131886448, 0);
                }
            }
        }
    }

    private void A03() {
        AnonymousClass1EC A072;
        boolean z;
        Intent A0A2;
        String packageName;
        String str;
        AnonymousClass206 quotedMessage = this.A0I.getQuotedMessage();
        boolean A0N2 = this.A0B.A0N();
        Bundle bundle = null;
        AnonymousClass01E r3 = this.A06;
        AnonymousClass1BI r7 = this.A0S;
        if (!A0N2) {
            if (quotedMessage != null) {
                bundle = AnonymousClass25A.A04(quotedMessage.A0v);
            }
            A072 = AnonymousClass25A.A07(quotedMessage);
            z = this.A0g;
            boolean A002 = C87544Vz.A00(this.A0Q);
            A0A2 = C17880vN.A0A();
            packageName = r3.getPackageName();
            if (A002) {
                str = "com.whatsapp.contact.picker.PhoneContactsSelectorBottomSheet";
            } else {
                str = "com.whatsapp.contact.picker.PhoneContactsSelector";
            }
        } else {
            if (quotedMessage != null) {
                bundle = AnonymousClass25A.A04(quotedMessage.A0v);
            }
            A072 = AnonymousClass25A.A07(quotedMessage);
            z = this.A0g;
            boolean A003 = C87544Vz.A00(this.A0Q);
            A0A2 = C17880vN.A0A();
            packageName = r3.getPackageName();
            if (A003) {
                str = "com.whatsapp.contact.picker.ContactsAttachmentSelectorBottomSheet";
            } else {
                str = "com.whatsapp.contact.picker.ContactsAttachmentSelector";
            }
        }
        A0A2.setClassName(packageName, str);
        AnonymousClass3MY.A13(A0A2, r7, "jid");
        A0A2.putExtra("quoted_message", bundle);
        AnonymousClass3MY.A13(A0A2, A072, "quoted_group_jid");
        A0A2.putExtra("has_number_from_url", z);
        r3.startActivityForResult(A0A2, 9);
        this.A0Y.A00(r3);
    }

    private void A05() {
        Intent A0G2;
        String packageName;
        String str;
        AnonymousClass01E r6 = this.A06;
        View currentFocus = r6.getCurrentFocus();
        if (currentFocus != null) {
            this.A0X.A01(currentFocus);
        }
        AnonymousClass206 quotedMessage = this.A0I.getQuotedMessage();
        boolean A062 = this.A0p.A06(r6);
        long j = 0;
        Context applicationContext = r6.getApplicationContext();
        String A063 = C22971Dz.A06(this.A0S);
        if (A062) {
            if (quotedMessage != null) {
                j = quotedMessage.A0x;
            }
            String A064 = C22971Dz.A06(AnonymousClass25A.A07(quotedMessage));
            boolean z = this.A0g;
            boolean A002 = C87544Vz.A00(this.A0Q);
            A0G2 = C72463Mc.A0G(applicationContext);
            A0G2.putExtra("jid", A063);
            A0G2.putExtra("quoted_message_row_id", j);
            A0G2.putExtra("quoted_group_jid", A064);
            A0G2.putExtra("has_number_from_url", z);
            packageName = applicationContext.getPackageName();
            if (A002) {
                str = "com.whatsapp.location.LocationPicker2BottomSheet";
            } else {
                str = "com.whatsapp.location.LocationPicker2";
            }
        } else {
            if (quotedMessage != null) {
                j = quotedMessage.A0x;
            }
            String A065 = C22971Dz.A06(AnonymousClass25A.A07(quotedMessage));
            boolean z2 = this.A0g;
            boolean A003 = C87544Vz.A00(this.A0Q);
            A0G2 = C72463Mc.A0G(applicationContext);
            A0G2.putExtra("jid", A063);
            A0G2.putExtra("quoted_message_row_id", j);
            A0G2.putExtra("quoted_group_jid", A065);
            A0G2.putExtra("has_number_from_url", z2);
            packageName = applicationContext.getPackageName();
            if (A003) {
                str = "com.whatsapp.location.LocationPickerBottomSheet";
            } else {
                str = "com.whatsapp.location.LocationPicker";
            }
        }
        A0G2.setClassName(packageName, str);
        r6.startActivityForResult(A0G2, 802);
        this.A0Y.A00(r6);
    }

    private void A06() {
        if (A0A(810) && this.A0M.A04(this.A0L)) {
            C18030ve r1 = this.A0Q;
            AnonymousClass1KB r7 = this.A09;
            AnonymousClass01E r6 = this.A06;
            r1.A0G(2614);
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            try {
                r6.startActivityForResult(intent, 21);
            } catch (ActivityNotFoundException e) {
                Log.e("MediaFileUtils/start-activity ", e);
                r7.A08(2131886448, 0);
            }
        }
    }

    public static void A07(C115095tO r1) {
        AnonymousClass3RS r0 = r1.A01;
        if (r0 != null && r0.isShowing()) {
            AnonymousClass3RS r02 = r1.A01;
            AnonymousClass3RS.A03(r02);
            AnonymousClass3RS.A02(r02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r30 != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08(java.lang.Integer r28, java.lang.Integer r29, boolean r30) {
        /*
            r27 = this;
            r0 = r27
            X.8A7 r1 = r0.A0I
            X.206 r1 = r1.getQuotedMessage()
            if (r1 != 0) goto L_0x00da
            r7 = 0
        L_0x000c:
            X.1EC r13 = X.AnonymousClass25A.A07(r1)
            com.whatsapp.mentions.MentionableEntry r1 = r0.A0T
            java.lang.String r16 = r1.getStringText()
            java.util.List r17 = r1.getMentions()
            int r2 = r0.A00
            r1 = 5
            if (r2 != r1) goto L_0x00cd
            r19 = 20
            if (r30 == 0) goto L_0x00d5
        L_0x0023:
            r1 = 85
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r10 = 26
        L_0x002b:
            if (r29 == 0) goto L_0x00c1
            int r18 = r29.intValue()
        L_0x0031:
            X.6bw r1 = r0.A0o
            X.01E r11 = r0.A06
            X.1BI r12 = r0.A0S
            boolean r9 = r0.A0g
            int r6 = r0.A04
            java.util.List r4 = r0.A03
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            boolean r2 = X.C18070vi.A15(r11, r12)
            r0 = 14
            X.C18070vi.A0d(r4, r0)
            if (r16 != 0) goto L_0x004e
            java.lang.String r16 = ""
        L_0x004e:
            X.0ve r1 = r1.A00
            java.lang.Integer r14 = X.AnonymousClass6WK.A00(r12)
            r15 = 0
            r0 = 1
            r26 = r2
            r20 = r6
            r21 = r7
            r23 = r9
            r24 = r0
            r25 = r2
            android.content.Intent r7 = X.AnonymousClass1LU.A0d(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26)
            java.lang.String r9 = "default_tab"
            r8 = 41
            if (r6 != r8) goto L_0x0089
            r6 = 6672(0x1a10, float:9.35E-42)
            X.0vf r8 = X.C18040vf.A02
            boolean r6 = X.C18020vd.A05(r8, r1, r6)
            if (r6 == 0) goto L_0x0079
            r7.putExtra(r9, r2)
        L_0x0079:
            r6 = 9286(0x2446, float:1.3012E-41)
            boolean r6 = X.C18020vd.A05(r8, r1, r6)
            if (r6 == 0) goto L_0x0089
            java.lang.String r6 = "picker_redesign"
            r7.putExtra(r6, r0)
            r7.putExtra(r9, r2)
        L_0x0089:
            r0 = 11376(0x2c70, float:1.5941E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x009c
            java.util.ArrayList r2 = X.C17880vN.A10(r4)
            java.lang.String r0 = "result_extra_media_selection"
            r7.putParcelableArrayListExtra(r0, r2)
        L_0x009c:
            java.lang.String r0 = "include_media"
            r2 = r28
            if (r28 == 0) goto L_0x00a5
            r7.putExtra(r0, r2)
        L_0x00a5:
            if (r5 == 0) goto L_0x00b4
            r0 = 12312(0x3018, float:1.7253E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "media_sharing_user_journey_start_target"
            r7.putExtra(r0, r5)
        L_0x00b4:
            if (r3 == 0) goto L_0x00bb
            java.lang.String r0 = "camera_picker_origin"
            r7.putExtra(r0, r3)
        L_0x00bb:
            r0 = 22
            r11.startActivityForResult(r7, r0)
            return
        L_0x00c1:
            X.0ve r3 = r0.A0Q
            r2 = 2614(0xa36, float:3.663E-42)
            X.0vf r1 = X.C18040vf.A02
            int r18 = X.C18020vd.A00(r1, r3, r2)
            goto L_0x0031
        L_0x00cd:
            r19 = 1
            if (r30 == 0) goto L_0x00d5
            r19 = 14
            goto L_0x0023
        L_0x00d5:
            r5 = 0
            r10 = 25
            goto L_0x002b
        L_0x00da:
            long r7 = r1.A0x
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115095tO.A08(java.lang.Integer, java.lang.Integer, boolean):void");
    }

    private boolean A0A(int i) {
        int i2;
        if (this.A0O.A0G()) {
            return true;
        }
        AnonymousClass01E r3 = this.A06;
        if (!AnonymousClass112.A07()) {
            i2 = 2131894470;
        } else {
            i2 = 2131894473;
            if (!AnonymousClass112.A09()) {
                i2 = 2131894472;
            }
        }
        AnonymousClass74O.A09(r3, 2131894471, i2, i);
        return false;
    }

    public void A0B() {
        AnonymousClass01E r7 = this.A06;
        if (AnonymousClass74O.A0J(r7, this.A0O, 31) && this.A0M.A04(this.A0L)) {
            C18030ve r1 = this.A0Q;
            AnonymousClass1KB r5 = this.A09;
            C218617r r9 = this.A0h;
            C18010vc r8 = this.A0W;
            r1.A0G(2614);
            Intent putExtra = C108945cZ.A0G("android.media.action.IMAGE_CAPTURE").putExtra("output", C64062u9.A02(r7, C1403270y.A00(r9, r8, C26551So.A0E, ".jpg", 1)));
            putExtra.setFlags(2);
            try {
                r7.startActivityForResult(putExtra, 23);
            } catch (ActivityNotFoundException e) {
                Log.e("MediaFileUtils/start-activity ", e);
                r5.A08(2131886448, 0);
            }
        }
    }

    public void A0C() {
        AnonymousClass01E r4 = this.A06;
        if (AnonymousClass74O.A0J(r4, this.A0O, 32) && this.A0M.A04(this.A0L)) {
            C18030ve r1 = this.A0Q;
            AnonymousClass1KB r3 = this.A09;
            r1.A0G(2614);
            try {
                r4.startActivityForResult(C108945cZ.A0G("android.media.action.VIDEO_CAPTURE"), 4);
            } catch (ActivityNotFoundException e) {
                Log.e("MediaFileUtils/start-activity ", e);
                r3.A08(2131886448, 0);
            }
        }
    }

    public void A0D(Uri uri, Integer num, int i) {
        if (this.A0F.A0P(C22941Dw.A00(this.A0S))) {
            AnonymousClass4Yv.A01(this.A06, 106);
            return;
        }
        ArrayList A13 = AnonymousClass000.A13();
        if (uri != null) {
            A13.add(uri);
        }
        A09(num, A13, i, 38);
    }

    public void A0E(View view, int i) {
        AnonymousClass01E r8 = this.A06;
        if (AnonymousClass4Yv.A02(r8)) {
            Log.i("conversation/attachment-popup - activity is ending, bailing...");
            return;
        }
        C18030ve r15 = this.A0Q;
        View view2 = view;
        int i2 = i;
        if (C87544Vz.A01(r15)) {
            AnonymousClass1L4 r1 = this.A0X;
            AnonymousClass190 r10 = this.A07;
            AnonymousClass1DC r0 = this.A0a;
            C74863d2 r7 = new C74863d2(r8, view2, r10, this.A0A, this.A0T, this.A0N, this.A0P, r15, r1, r0);
            r7.A0F(this.A0G, this, this.A0S, false);
            this.A02 = r7;
            this.A00 = i2;
            return;
        }
        AnonymousClass1KB r72 = this.A09;
        AnonymousClass1L4 r6 = this.A0X;
        AnonymousClass1BI r3 = this.A0S;
        AnonymousClass11C r2 = this.A0N;
        AnonymousClass3RS r73 = new AnonymousClass3RS(r8, view2, r72, this.A0G, this, r2, r15, r3, r6, AnonymousClass000.A1T(i2, 5));
        this.A01 = r73;
        this.A00 = i2;
        r73.A06(r8);
    }

    public void A0F(Integer num, Integer num2, Integer num3, int i, int i2, int i3) {
        long j;
        long A012 = this.A0n.A01();
        C133846pb r8 = this.A0V;
        int i4 = 2;
        int i5 = i;
        if (i5 != 1) {
            int i6 = 3;
            if (i5 != 2) {
                i4 = 4;
                if (i5 != 3) {
                    i6 = 5;
                    if (i5 != 4) {
                        i4 = 6;
                        if (i5 != 5) {
                            i4 = 1;
                        }
                    }
                }
            }
            i4 = i6;
        }
        if (r8.A01 != 0) {
            AnonymousClass1Be BDn = r8.A04.BDn(new C1180662a(), new C18180vt(1, 5, 650, false));
            r8.A03 = BDn;
            if (BDn.A00()) {
                r8.A01 = 1;
                r8.A02 = SystemClock.elapsedRealtime();
                r8.A00 = i4;
            }
        }
        AnonymousClass01E r6 = this.A06;
        Intent A042 = AnonymousClass74O.A04(r6, this.A0O, 30);
        if (A042 != null) {
            int i7 = 804;
            if (i5 != 2) {
                i7 = 803;
                if (i5 != 3) {
                    i7 = 805;
                    if (i5 != 5) {
                        i7 = 30;
                    }
                }
            }
            r6.startActivityForResult(A042, i7);
        } else if (this.A0M.A04(this.A0L)) {
            if (A012 < C108995ce.A08(this.A0Q, 3658)) {
                C31141f5.A05(r6, this.A08, this.A0R, 5);
            } else {
                C37551pj r1 = this.A0F;
                AnonymousClass1BI r7 = this.A0S;
                if (r1.A0P(C22941Dw.A00(r7))) {
                    AnonymousClass4Yv.A01(r6, 106);
                } else {
                    AnonymousClass206 quotedMessage = this.A0I.getQuotedMessage();
                    if (quotedMessage == null) {
                        j = 0;
                    } else {
                        j = quotedMessage.A0x;
                    }
                    String A062 = C22971Dz.A06(AnonymousClass25A.A07(quotedMessage));
                    boolean z = this.A0g;
                    MentionableEntry mentionableEntry = this.A0T;
                    r6.startActivityForResult(AnonymousClass1LU.A0g(r6, r7, Integer.valueOf(i2), Integer.valueOf(i3), num, num2, num3, A062, mentionableEntry.getStringText(), mentionableEntry.getMentions(), i5, j, z), 806);
                    this.A0K.A04();
                    return;
                }
            }
        }
        r8.A00();
    }

    public void A0G(Integer num, Integer num2, boolean z) {
        int i;
        C127116dp r0 = this.A0m;
        if (z) {
            i = r0.A00;
        } else {
            i = 809;
        }
        if (this.A0O.A05() == AnonymousClass00R.A01) {
            AnonymousClass74O.A07(this.A06, i);
        } else if (this.A0M.A04(this.A0L)) {
            View currentFocus = this.A06.getCurrentFocus();
            if (currentFocus != null) {
                this.A0X.A01(currentFocus);
            }
            A08(num, num2, z);
        }
    }

    public void A0H(String str, String str2, int i) {
        AnonymousClass3RS r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
        }
        String str3 = str2;
        if (str.equals("pix")) {
            A0Q a0q = this.A0U;
            AnonymousClass1BI r3 = this.A0S;
            A5D BUf = a0q.A03.A06().BUf();
            if (BUf != null) {
                a0q.A05.CGF(new C21438Ak5(r3, BUf, a0q, str2));
            }
        } else {
            this.A0U.A01(this.A0S, this.A0I.getQuotedMessage(), this.A0T.getStringText(), str3, i, this.A0m.A01, false);
        }
        this.A0Y.A00(this.A06);
    }

    public void A0I(String str, boolean z) {
        String str2;
        long j;
        String str3;
        AnonymousClass3RS r0;
        C18030ve r6 = this.A0Q;
        if (!C87544Vz.A01(r6) && (r0 = this.A01) != null) {
            r0.dismiss();
        }
        String str4 = str;
        switch (str4.hashCode()) {
            case -1367751899:
                if (str4.equals("camera")) {
                    if (z) {
                        this.A08.CMl(new CapturePictureOrVideoDialogFragment());
                        return;
                    }
                    A0F(this.A0f, (Integer) null, (Integer) null, this.A00, this.A04, 8);
                    return;
                }
                break;
            case -1275762953:
                str2 = "quick reply";
                break;
            case -309474065:
                str2 = "product";
                break;
            case -196315310:
                if (str4.equals("gallery")) {
                    if (z) {
                        A06();
                        return;
                    } else {
                        A0G((Integer) null, (Integer) null, false);
                        return;
                    }
                }
                break;
            case 3446719:
                if (str4.equals("poll")) {
                    Editable text = this.A0T.getText();
                    String str5 = "";
                    if (text != null) {
                        int A002 = C137186v3.A00(text);
                        int A003 = C18020vd.A00(C18040vf.A02, r6, 1406);
                        if (A002 > A003) {
                            CharSequence A012 = C63462t7.A01(text, 0, text.length(), A003);
                            if (A012 != null) {
                                str5 = A012.toString();
                            }
                        } else {
                            str5 = text.toString();
                        }
                    }
                    C136736uJ r7 = this.A0Y;
                    AnonymousClass01E r62 = this.A06;
                    AnonymousClass1L4 r2 = this.A0X;
                    AnonymousClass1BI r8 = this.A0S;
                    AnonymousClass206 quotedMessage = this.A0I.getQuotedMessage();
                    View currentFocus = r62.getCurrentFocus();
                    if (currentFocus != null) {
                        r2.A01(currentFocus);
                    }
                    if (quotedMessage == null) {
                        j = 0;
                    } else {
                        j = quotedMessage.A0x;
                    }
                    boolean A004 = C87544Vz.A00(r7.A00);
                    Intent A0A2 = C17880vN.A0A();
                    String packageName = r62.getPackageName();
                    if (A004) {
                        str3 = "com.whatsapp.polls.creator.PollCreatorBottomSheetActivity";
                    } else {
                        str3 = "com.whatsapp.polls.creator.PollCreatorActivity";
                    }
                    A0A2.setClassName(packageName, str3);
                    AnonymousClass3MY.A13(A0A2, r8, "jid");
                    A0A2.putExtra("quoted_message_row_id", j);
                    if (str5 != null) {
                        A0A2.putExtra("entry_string_text", str5);
                    }
                    r62.startActivityForResult(A0A2, 858);
                    r7.A00(r62);
                    return;
                }
                break;
            case 3529462:
                if (str4.equals("shop")) {
                    C85424Ni r1 = this.A0E;
                    AnonymousClass62B r3 = new AnonymousClass62B();
                    r3.A00 = 11;
                    r1.A01.CC0(r3, new C18180vt(1, 1), false);
                    return;
                }
                break;
            case 93166550:
                if (str4.equals("audio")) {
                    A00();
                    return;
                }
                break;
            case 96891546:
                if (str4.equals("event")) {
                    if (C87544Vz.A01(r6)) {
                        A0K();
                    }
                    AnonymousClass01E r5 = this.A06;
                    AnonymousClass1BI r22 = this.A0S;
                    AnonymousClass206 quotedMessage2 = this.A0I.getQuotedMessage();
                    Intent A0A3 = C17880vN.A0A();
                    A0A3.setClassName(r5.getPackageName(), "com.whatsapp.events.EventCreationActivity");
                    AnonymousClass3MY.A12(A0A3, r22, "jid");
                    if (quotedMessage2 != null) {
                        A0A3.putExtra("extra_quoted_message_row_id", quotedMessage2.A0x);
                    }
                    r5.startActivity(A0A3);
                    this.A0Y.A00(r5);
                    return;
                }
                break;
            case 106006350:
                str2 = "order";
                break;
            case 861720859:
                if (str4.equals("document")) {
                    A04();
                    return;
                }
                break;
            case 951526432:
                if (str4.equals("contact")) {
                    if (this.A0H.A00() || ((AnonymousClass1UN) this.A0d.get()).A05()) {
                        A03();
                        return;
                    }
                    AnonymousClass01E r32 = this.A06;
                    C18070vi.A0d(r32, 0);
                    AnonymousClass74O.A0A(r32, 2131894323, 2131894322, 150, false);
                    return;
                }
                break;
            case 1566438421:
                if (str4.equals("imagine sheet")) {
                    AnonymousClass00H r12 = this.A0c;
                    if (r12 == null) {
                        Log.e("ConversationAttachmentController/onImagineSheetClick bonsaiUiUtilLazy is null");
                        return;
                    }
                    AnonymousClass1FU A005 = AnonymousClass1FU.A00(this.A06);
                    C125786bg r02 = new C125786bg(this);
                    AnonymousClass3MW.A0W(r12).A07(A005, (AnonymousClass86Z) null, new C143187Cj(this), new C143207Cm(r02, this));
                    return;
                }
                break;
            case 1901043637:
                if (str4.equals("location")) {
                    if (AnonymousClass74O.A0L(this.A06, this.A0O, this.A0P, 801)) {
                        A05();
                        return;
                    }
                    return;
                }
                break;
        }
        if (str4.equals(str2)) {
            return;
        }
        C51722Zj r03 = (C51722Zj) ((Map) this.A0b.get()).get(str4);
        if (r03 != null) {
            AnonymousClass1BI r63 = this.A0S;
            C18070vi.A0d(r63, 0);
            AnonymousClass1FR r52 = r03.A00.A00;
            if (r52 != null) {
                CreateCallLinkBottomSheet createCallLinkBottomSheet = new CreateCallLinkBottomSheet();
                AnonymousClass1D6[] r23 = new AnonymousClass1D6[2];
                AnonymousClass1D6.A03("chat_jid", r63, r23, 0);
                AnonymousClass1D6.A03("invoke_from_chat", true, r23, 1);
                AnonymousClass3MX.A1I(createCallLinkBottomSheet, r23);
                r52.CMk(createCallLinkBottomSheet, "CreateCallLinkBottomSheet");
                return;
            }
            return;
        }
        C17960vV.A0F(false, AnonymousClass001.A1H("Wrong attachment type ", str4, AnonymousClass000.A10()));
    }

    public void A0J(boolean z) {
        C74863d2 r2 = this.A02;
        if (r2 != null) {
            r2.A0F(this.A0G, this, this.A0S, z);
        }
    }

    public boolean A0K() {
        C74863d2 r0 = this.A02;
        if (r0 == null || !r0.isShowing()) {
            return false;
        }
        this.A02.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0212, code lost:
        if (r5 != null) goto L_0x0214;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bky(android.content.Intent r26, int r27, int r28) {
        /*
            r25 = this;
            r0 = r25
            X.6dp r4 = r0.A0m
            r1 = 801(0x321, float:1.122E-42)
            r14 = 1
            r5 = r27
            if (r5 != r1) goto L_0x000f
            r0.A05()
        L_0x000e:
            return r14
        L_0x000f:
            r6 = 23
            r7 = r28
            if (r5 != r6) goto L_0x001e
            if (r28 != 0) goto L_0x001e
            X.0vc r1 = r0.A0W
            java.lang.Class<X.1Sk> r3 = X.C26511Sk.class
            monitor-enter(r3)
            goto L_0x0274
        L_0x001e:
            boolean r1 = X.AnonymousClass112.A0A()
            r3 = 0
            r2 = 0
            if (r1 == 0) goto L_0x003a
            if (r28 != 0) goto L_0x003a
            r1 = 809(0x329, float:1.134E-42)
            if (r5 != r1) goto L_0x02c1
            X.17x r1 = r0.A0O
            java.lang.Integer r4 = r1.A05()
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r4 != r1) goto L_0x02c1
            r0.A08(r2, r2, r3)
            return r14
        L_0x003a:
            r1 = -1
            if (r7 != r1) goto L_0x02c1
            r1 = 30
            if (r5 == r1) goto L_0x005f
            r1 = 804(0x324, float:1.127E-42)
            if (r5 == r1) goto L_0x005f
            r1 = 803(0x323, float:1.125E-42)
            if (r5 != r1) goto L_0x0059
            r8 = 3
        L_0x004a:
            int r3 = r0.A04
            java.lang.Integer r1 = r0.A0f
            r10 = 8
            r7 = r2
            r4 = r0
            r5 = r1
            r6 = r2
            r9 = r3
            r4.A0F(r5, r6, r7, r8, r9, r10)
            return r14
        L_0x0059:
            r1 = 805(0x325, float:1.128E-42)
            if (r5 != r1) goto L_0x0061
            r8 = 5
            goto L_0x004a
        L_0x005f:
            r8 = 2
            goto L_0x004a
        L_0x0061:
            r1 = 31
            if (r5 != r1) goto L_0x0069
            r0.A0B()
            return r14
        L_0x0069:
            r1 = 32
            if (r5 != r1) goto L_0x0071
            r0.A0C()
            return r14
        L_0x0071:
            r1 = 150(0x96, float:2.1E-43)
            if (r5 != r1) goto L_0x0079
            r0.A03()
            return r14
        L_0x0079:
            r1 = 809(0x329, float:1.134E-42)
            if (r5 != r1) goto L_0x0081
            r0.A0G(r2, r2, r3)
            return r14
        L_0x0081:
            int r1 = r4.A00
            if (r5 != r1) goto L_0x0089
            r0.A0G(r2, r2, r14)
            return r14
        L_0x0089:
            r1 = 810(0x32a, float:1.135E-42)
            if (r5 != r1) goto L_0x0091
            r0.A06()
            return r14
        L_0x0091:
            r1 = 807(0x327, float:1.131E-42)
            if (r5 != r1) goto L_0x0099
            r0.A00()
            return r14
        L_0x0099:
            r1 = 808(0x328, float:1.132E-42)
            if (r5 != r1) goto L_0x00a1
            r0.A04()
            return r14
        L_0x00a1:
            int r4 = r4.A01
            r1 = r26
            if (r5 != r4) goto L_0x00c3
            if (r26 == 0) goto L_0x00af
            java.lang.String r2 = "referral_screen"
            java.lang.String r2 = r1.getStringExtra(r2)
        L_0x00af:
            X.A0Q r4 = r0.A0U
            X.1QS r0 = r4.A03
            X.BD1 r0 = r0.A06()
            X.BCo r3 = r0.BPe()
            if (r3 == 0) goto L_0x000e
            android.content.Context r0 = r4.A01
            r3.BcP(r0, r1, r2)
            return r14
        L_0x00c3:
            r4 = 44
            if (r5 == r4) goto L_0x000e
            r4 = 6
            if (r5 == r4) goto L_0x0129
            r4 = 36
            if (r5 == r4) goto L_0x0129
            r4 = 5
            if (r5 != r4) goto L_0x01f9
            X.C17960vV.A07(r1)
            java.lang.String r2 = "result_uris"
            java.util.ArrayList r4 = r1.getParcelableArrayListExtra(r2)
            if (r4 != 0) goto L_0x00ed
            android.net.Uri r2 = r1.getData()
            if (r2 == 0) goto L_0x011b
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            android.net.Uri r2 = r1.getData()
            r4.add(r2)
        L_0x00ed:
            java.util.ArrayList r2 = X.C17880vN.A10(r4)
            X.7P3 r4 = new X.7P3
            r4.<init>(r1, r0, r2, r3)
            X.1BI r2 = r0.A0S
            X.25J r1 = X.C29681ch.A03
            boolean r1 = r2 instanceof X.C29681ch
            if (r1 == 0) goto L_0x0117
            if (r2 == 0) goto L_0x0117
            X.00H r1 = r0.A0e
            java.lang.Object r1 = r1.get()
            X.4Qa r1 = (X.C86064Qa) r1
            r1.A00(r2, r4)
        L_0x010b:
            X.0ve r1 = r0.A0Q
            boolean r1 = X.C87544Vz.A01(r1)
            if (r1 == 0) goto L_0x000e
            r0.A0K()
            return r14
        L_0x0117:
            r4.Bq8()
            goto L_0x010b
        L_0x011b:
            java.lang.String r1 = "(conversation|messagereply)/audio/share/failed"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1KB r2 = r0.A09
            r1 = 2131896086(0x7f122716, float:1.9427023E38)
            r2.A08(r1, r3)
            goto L_0x010b
        L_0x0129:
            if (r26 == 0) goto L_0x010b
            X.C17960vV.A07(r1)
            java.lang.String r4 = "uri"
            android.os.Parcelable r7 = r1.getParcelableExtra(r4)
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r5 = "file_path"
            boolean r4 = r1.hasExtra(r5)
            if (r4 == 0) goto L_0x0184
            java.lang.String r4 = r1.getStringExtra(r5)
            java.io.File r10 = X.C108945cZ.A17(r4)
        L_0x0146:
            android.net.Uri r16 = r1.getData()
            java.lang.Class<X.1BI> r4 = X.AnonymousClass1BI.class
            java.util.ArrayList r4 = X.C72463Mc.A0r(r1, r4)
            if (r7 == 0) goto L_0x0186
            java.lang.String r2 = "caption"
            java.lang.String r11 = r1.getStringExtra(r2)
            java.lang.String r2 = "mentions"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.util.ArrayList r13 = X.AnonymousClass4aJ.A03(r2)
            java.util.Iterator r5 = r4.iterator()
        L_0x0166:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x01a9
            java.lang.Object r4 = r5.next()
            X.1kd r6 = r0.A0C
            X.8A7 r2 = r0.A0I
            X.206 r9 = r2.getQuotedMessage()
            X.1FR r8 = r0.A08
            boolean r15 = r0.A0g
            java.util.List r12 = java.util.Collections.singletonList(r4)
            r6.A06(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0166
        L_0x0184:
            r10 = 0
            goto L_0x0146
        L_0x0186:
            if (r16 == 0) goto L_0x01bf
            X.1kd r15 = r0.A0C
            X.1BI r6 = r0.A0S
            X.8A7 r4 = r0.A0I
            X.206 r18 = r4.getQuotedMessage()
            X.1FR r5 = r0.A08
            boolean r4 = r0.A0g
            java.util.List r21 = java.util.Collections.singletonList(r6)
            r20 = r2
            r22 = r2
            r19 = r2
            r23 = r14
            r24 = r4
            r17 = r5
            r15.A06(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x01a9:
            java.lang.String r2 = "clear_message_after_send"
            boolean r1 = r1.getBooleanExtra(r2, r3)
            if (r1 == 0) goto L_0x01b8
            com.whatsapp.mentions.MentionableEntry r2 = r0.A0T
            java.lang.String r1 = ""
            r2.setText(r1)
        L_0x01b8:
            X.8A7 r1 = r0.A0I
            r1.BCn()
            goto L_0x010b
        L_0x01bf:
            java.lang.String r4 = "android.intent.extra.STREAM"
            java.util.ArrayList r4 = r1.getParcelableArrayListExtra(r4)
            if (r4 == 0) goto L_0x01a9
            int r23 = r4.size()
            java.util.Iterator r7 = r4.iterator()
        L_0x01cf:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x01a9
            android.net.Uri r16 = X.C108945cZ.A0M(r7)
            X.1kd r15 = r0.A0C
            X.1BI r6 = r0.A0S
            X.8A7 r4 = r0.A0I
            X.206 r18 = r4.getQuotedMessage()
            X.1FR r5 = r0.A08
            boolean r4 = r0.A0g
            java.util.List r21 = java.util.Collections.singletonList(r6)
            r20 = r2
            r22 = r2
            r19 = r2
            r24 = r4
            r17 = r5
            r15.A06(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x01cf
        L_0x01f9:
            if (r5 != r6) goto L_0x021b
            X.0vc r1 = r0.A0W
            java.io.File r1 = X.C1403270y.A01(r1)
            android.net.Uri r5 = android.net.Uri.fromFile(r1)
            X.01E r1 = r0.A06
            X.C26511Sk.A0O(r1, r5)
            r4 = 8
            r3 = 39
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            if (r5 == 0) goto L_0x0217
        L_0x0214:
            r1.add(r5)
        L_0x0217:
            r0.A09(r2, r1, r4, r3)
            return r14
        L_0x021b:
            r4 = 4
            if (r5 != r4) goto L_0x024b
            if (r26 == 0) goto L_0x0235
            android.net.Uri r4 = r1.getData()
            if (r4 == 0) goto L_0x0235
            android.net.Uri r5 = r1.getData()
        L_0x022a:
            if (r5 == 0) goto L_0x029e
            r4 = 8
            r3 = 39
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            goto L_0x0214
        L_0x0235:
            X.0vc r1 = r0.A0W
            java.io.File r4 = X.C1403270y.A01(r1)
            boolean r1 = r4.exists()
            if (r1 == 0) goto L_0x0295
            android.net.Uri r5 = android.net.Uri.fromFile(r4)
            X.01E r1 = r0.A06
            X.C26511Sk.A0O(r1, r5)
            goto L_0x022a
        L_0x024b:
            r4 = 21
            if (r5 != r4) goto L_0x02c1
            if (r26 == 0) goto L_0x000e
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            android.content.ClipData r5 = r1.getClipData()
            if (r5 == 0) goto L_0x02ac
            r4 = 0
        L_0x025c:
            int r3 = r5.getItemCount()
            if (r4 >= r3) goto L_0x02ac
            android.content.ClipData$Item r3 = r5.getItemAt(r4)
            if (r3 == 0) goto L_0x0271
            android.net.Uri r3 = r3.getUri()
            if (r3 == 0) goto L_0x0271
            r6.add(r3)
        L_0x0271:
            int r4 = r4 + 1
            goto L_0x025c
        L_0x0274:
            int r0 = X.C26511Sk.A00     // Catch:{ all -> 0x0292 }
            if (r0 <= 0) goto L_0x0290
            java.lang.String r0 = X.C19620yd.A09     // Catch:{ all -> 0x0292 }
            android.content.SharedPreferences r0 = r1.A05(r0)     // Catch:{ all -> 0x0292 }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ all -> 0x0292 }
            int r0 = X.C26511Sk.A00     // Catch:{ all -> 0x0292 }
            int r1 = r0 + -1
            X.C26511Sk.A00 = r1     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = "file_index"
            r2.putInt(r0, r1)     // Catch:{ all -> 0x0292 }
            r2.apply()     // Catch:{ all -> 0x0292 }
        L_0x0290:
            monitor-exit(r3)
            return r14
        L_0x0292:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0295:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "conversation/video/share/nocapturefile "
            X.C17900vP.A0X(r4, r1, r2)
        L_0x029e:
            java.lang.String r1 = "conversation/video/share/failed"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1KB r1 = r0.A09
            r0 = 2131896086(0x7f122716, float:1.9427023E38)
            r1.A08(r0, r3)
            return r14
        L_0x02ac:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x02bb
            android.net.Uri r1 = r1.getData()
            if (r1 == 0) goto L_0x02bb
            r6.add(r1)
        L_0x02bb:
            r1 = 27
            r0.A09(r2, r6, r14, r1)
            return r14
        L_0x02c1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115095tO.Bky(android.content.Intent, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (X.C87544Vz.A00(r2.A00) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04() {
        /*
            r7 = this;
            boolean r0 = X.AnonymousClass112.A07()
            if (r0 != 0) goto L_0x000e
            r0 = 808(0x328, float:1.132E-42)
            boolean r0 = r7.A0A(r0)
            if (r0 == 0) goto L_0x0041
        L_0x000e:
            X.1NM r1 = r7.A0M
            X.1Gn r0 = r7.A0L
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0041
            X.01E r6 = r7.A06
            X.1BI r5 = r7.A0S
            com.whatsapp.mentions.MentionableEntry r0 = r7.A0T
            java.lang.String r4 = r0.getStringText()
            java.util.List r3 = r0.getMentions()
            X.6uJ r2 = r7.A0Y
            if (r2 == 0) goto L_0x0033
            X.0ve r0 = r2.A00
            boolean r1 = X.C87544Vz.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            android.content.Intent r1 = X.AnonymousClass1LU.A0i(r6, r5, r4, r3, r0)
            r0 = 6
            r6.startActivityForResult(r1, r0)
            if (r2 == 0) goto L_0x0041
            r2.A00(r6)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115095tO.A04():void");
    }

    private void A09(Integer num, ArrayList arrayList, int i, int i2) {
        if (!arrayList.isEmpty()) {
            AnonymousClass01E r3 = this.A06;
            C139416yo r4 = new C139416yo(r3);
            r4.A0I = arrayList;
            r4.A0D = C22971Dz.A06(this.A0S);
            r4.A01 = i;
            r4.A0P = true;
            AnonymousClass72S r6 = new AnonymousClass72S((Uri) arrayList.get(0));
            MentionableEntry mentionableEntry = this.A0T;
            r6.A0P(mentionableEntry.getStringText());
            this.A0q.A01(r6.A0H(), mentionableEntry.getMentions());
            r6.A0S(r6.A0H());
            r6.A0O(num);
            C139416yo.A00(new AnonymousClass73D(r6), r4);
            AnonymousClass206 quotedMessage = this.A0I.getQuotedMessage();
            if (quotedMessage != null) {
                r4.A05 = quotedMessage.A0x;
                r4.A0E = C22971Dz.A06(AnonymousClass25A.A07(quotedMessage));
            }
            r4.A02 = i2;
            r3.startActivityForResult(r4.A01(), 22);
            return;
        }
        Log.e("conversation/setuppreview/share-failed");
        this.A09.A08(2131896086, 0);
    }

    public String BO6() {
        return "ConversationAttachmentController";
    }

    public void onActivityDestroyed(Activity activity) {
        A07(this);
        this.A0u.unregisterObserver(this.A0t);
        A57.A00(activity).A01(this.A05);
    }

    public C115095tO(AnonymousClass01E r13, AnonymousClass190 r14, AnonymousClass1FR r15, C218617r r16, AnonymousClass1KB r17, AnonymousClass5YX r18, AnonymousClass11S r19, C34531kd r20, C33251iW r21, C196149uX r22, C26911Ty r23, A1M a1m, BDO bdo, C85424Ni r26, C37551pj r27, ConversationCommunityViewModel conversationCommunityViewModel, C30191dX r29, AnonymousClass8A7 r30, C127116dp r31, C88184Yq r32, C31131f4 r33, C23501Gn r34, AnonymousClass1NM r35, AnonymousClass11C r36, C219217x r37, C19830z4 r38, AnonymousClass11Z r39, C18030ve r40, AnonymousClass18K r41, C125946bw r42, AnonymousClass1BI r43, AnonymousClass689 r44, C58432kg r45, MentionableEntry mentionableEntry, C85754Op r47, AnonymousClass8FO r48, C191769n9 r49, C133846pb r50, AnonymousClass1L1 r51, C18010vc r52, AnonymousClass1LD r53, AnonymousClass1L4 r54, C136736uJ r55, C26521Sl r56, AnonymousClass1DC r57, AnonymousClass10I r58, AnonymousClass00H r59, AnonymousClass00H r60, AnonymousClass00H r61, AnonymousClass00H r62, boolean z) {
        int i;
        C109305dA r3 = new C109305dA(this, 1);
        this.A05 = r3;
        C21052Adi adi = new C21052Adi(this, 1);
        this.A0t = adi;
        this.A03 = AnonymousClass000.A13();
        AnonymousClass01E r6 = r13;
        this.A06 = r13;
        AnonymousClass1FR r7 = r15;
        this.A08 = r15;
        this.A0Q = r40;
        this.A0w = r58;
        this.A09 = r17;
        this.A0X = r54;
        this.A0B = r19;
        this.A0C = r20;
        this.A07 = r14;
        this.A0h = r16;
        this.A0R = r41;
        this.A0l = bdo;
        this.A0D = r21;
        this.A0k = a1m;
        this.A0q = r45;
        this.A0n = r39;
        this.A0p = r44;
        this.A0E = r26;
        this.A0Z = r56;
        this.A0a = r57;
        this.A0N = r36;
        this.A0F = r27;
        this.A0V = r50;
        this.A0M = r35;
        this.A0H = r29;
        this.A0O = r37;
        this.A0P = r38;
        this.A0s = r51;
        this.A0i = r22;
        this.A0j = r23;
        AnonymousClass1LD r2 = r53;
        this.A0u = r2;
        this.A0W = r52;
        this.A0e = r59;
        this.A0K = r33;
        this.A0Y = r55;
        this.A0I = r30;
        this.A0L = r34;
        AnonymousClass1BI r4 = r43;
        this.A0S = r4;
        this.A0g = z;
        this.A0T = mentionableEntry;
        this.A0m = r31;
        this.A0c = r60;
        this.A0J = r32;
        r2.registerObserver(adi);
        this.A0r = r47;
        this.A0o = r42;
        this.A0G = conversationCommunityViewModel;
        this.A0A = r18;
        this.A0f = AnonymousClass6WK.A00(r4);
        AnonymousClass01E r5 = this.A06;
        boolean booleanExtra = r5.getIntent().getBooleanExtra("isStatusReply", false);
        boolean booleanExtra2 = r5.getIntent().getBooleanExtra("isMediaViewReply", false);
        if (booleanExtra) {
            i = 6;
        } else if (booleanExtra2) {
            i = 7;
        } else {
            i = 41;
            if (C17890vO.A0U(r5).equals("com.whatsapp.status.playback.MessageReplyActivity")) {
                i = 5;
            }
        }
        this.A04 = i;
        this.A0d = r61;
        this.A0b = r62;
        this.A0U = r49.A00(r6, r7, r48, new C98774rh(this, 1), (Runnable) null, true);
        A57.A00(r13).A02(r3, new IntentFilter("CLOSE_ATTACHMENT_TRAY"));
    }
}
