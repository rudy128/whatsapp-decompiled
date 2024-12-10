package X;

import android.content.Context;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.events.EventCreateOrEditFragment;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.4ce  reason: invalid class name and case insensitive filesystem */
public class C89554ce implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public C89554ce(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new C89554ce(obj, i));
    }

    public void afterTextChanged(Editable editable) {
        String str;
        Editable text;
        Editable editable2 = editable;
        switch (this.A00) {
            case 2:
                C18070vi.A0d(editable2, 0);
                EventCreateOrEditFragment eventCreateOrEditFragment = (EventCreateOrEditFragment) this.A01;
                WaEditText waEditText = eventCreateOrEditFragment.A0C;
                if (waEditText != null) {
                    Context context = waEditText.getContext();
                    TextPaint paint = waEditText.getPaint();
                    AnonymousClass1KW r1 = eventCreateOrEditFragment.A0L;
                    if (r1 != null) {
                        C18030ve r0 = eventCreateOrEditFragment.A0N;
                        if (r0 != null) {
                            C43251zV.A07(context, paint, editable2, r1, r0);
                            return;
                        } else {
                            AnonymousClass3MW.A1A();
                            throw null;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 3:
                C18070vi.A0d(editable2, 0);
                EventCreateOrEditFragment eventCreateOrEditFragment2 = (EventCreateOrEditFragment) this.A01;
                WaEditText waEditText2 = eventCreateOrEditFragment2.A09;
                if (waEditText2 != null) {
                    Context context2 = waEditText2.getContext();
                    TextPaint paint2 = waEditText2.getPaint();
                    AnonymousClass1KW r12 = eventCreateOrEditFragment2.A0L;
                    if (r12 != null) {
                        C18030ve r02 = eventCreateOrEditFragment2.A0N;
                        if (r02 != null) {
                            C43251zV.A07(context2, paint2, editable2, r12, r02);
                        } else {
                            AnonymousClass3MW.A1A();
                            throw null;
                        }
                    }
                }
                C18030ve r2 = eventCreateOrEditFragment2.A0N;
                if (r2 == null) {
                    AnonymousClass3MW.A1A();
                    throw null;
                } else if (!C18020vd.A05(C18040vf.A02, r2, 8380)) {
                    WaEditText waEditText3 = eventCreateOrEditFragment2.A09;
                    if (waEditText3 == null || (text = waEditText3.getText()) == null) {
                        str = null;
                    } else {
                        str = text.toString();
                    }
                    String A0G = C26302CxJ.A0G(str, false);
                    C18070vi.A0X(A0G);
                    int length = A0G.length();
                    AnonymousClass3VY r03 = eventCreateOrEditFragment2.A0M;
                    if (length == 0) {
                        if (r03 == null) {
                            C18070vi.A11("eventCreateOrEditViewModel");
                            throw null;
                        } else {
                            r03.A0U((PlaceInfo) null);
                            return;
                        }
                    } else if (r03 == null) {
                        C18070vi.A11("eventCreateOrEditViewModel");
                        throw null;
                    } else {
                        r03.A0U(new PlaceInfo(A0G, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0d, 0.0d, 0.0d, 0));
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                ((C22821Di) this.A01).invoke(editable2);
                return;
            default:
                return;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r7.length() < 4) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        r0 = "nextButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (r0.A0E == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        if (r7.length() == 0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bb, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r7.length() < 4) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0044;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x005b;
                case 5: goto L_0x0018;
                case 6: goto L_0x00a8;
                case 7: goto L_0x0005;
                case 8: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r6.A01
            com.whatsapp.wds.components.search.WDSSearchView r2 = (com.whatsapp.wds.components.search.WDSSearchView) r2
            X.4M5 r1 = r2.A01
            X.4CB r0 = X.AnonymousClass4CB.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0005
            com.whatsapp.WaImageButton r2 = r2.A08
            goto L_0x00b2
        L_0x0018:
            java.lang.Object r4 = r6.A01
            com.whatsapp.registration.email.RegisterEmail r4 = (com.whatsapp.registration.email.RegisterEmail) r4
            com.whatsapp.wds.components.button.WDSButton r3 = r4.A07
            if (r3 == 0) goto L_0x009e
            if (r7 == 0) goto L_0x002a
            int r2 = r7.length()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r3.setEnabled(r0)
            X.0vl r0 = r4.A0Q
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0005
            X.0zA r0 = r4.A01
            if (r0 == 0) goto L_0x00a1
            r0.A03()
            java.lang.String r0 = "logOnboardingEnterEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0044:
            java.lang.Object r0 = r6.A01
            com.whatsapp.email.UpdateEmailActivity r0 = (com.whatsapp.email.UpdateEmailActivity) r0
            com.whatsapp.wds.components.button.WDSButton r3 = r0.A04
            if (r3 == 0) goto L_0x009e
            if (r7 == 0) goto L_0x0056
            int r2 = r7.length()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            r3.setEnabled(r0)
            return
        L_0x005b:
            java.lang.Object r0 = r6.A01
            X.42q r0 = (X.C821142q) r0
            X.1Di r1 = r0.A0H
            if (r7 == 0) goto L_0x0069
            java.lang.CharSequence r0 = X.AnonymousClass1YF.A0G(r7)
            if (r0 != 0) goto L_0x006b
        L_0x0069:
            java.lang.String r0 = ""
        L_0x006b:
            r1.invoke(r0)
            return
        L_0x006f:
            java.lang.Object r5 = r6.A01
            com.whatsapp.bot.creation.DescribeAiFragment r5 = (com.whatsapp.bot.creation.DescribeAiFragment) r5
            if (r7 == 0) goto L_0x0096
            android.widget.TextView r4 = r5.A00
            if (r4 == 0) goto L_0x0096
            r3 = 2131886610(0x7f120212, float:1.9407804E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            int r0 = r7.length()
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = 1000 - r0
            X.AnonymousClass000.A1L(r2, r0)
            r0 = 1
            X.C17880vN.A1T(r2, r1, r0)
            java.lang.String r0 = r5.A1I(r3, r2)
            r4.setText(r0)
        L_0x0096:
            X.1FL r0 = r5.A1D()
            r0.invalidateOptionsMenu()
            return
        L_0x009e:
            java.lang.String r0 = "nextButton"
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r0 = "smbOnboardingAnalyticsManager"
        L_0x00a3:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00a8:
            java.lang.Object r0 = r6.A01
            com.whatsapp.wds.components.search.WDSConversationSearchView r0 = (com.whatsapp.wds.components.search.WDSConversationSearchView) r0
            android.widget.ImageButton r2 = r0.A02
            boolean r0 = r0.A0E
            if (r0 != 0) goto L_0x00bb
        L_0x00b2:
            if (r7 == 0) goto L_0x00bb
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L_0x00bd
        L_0x00bb:
            r0 = 8
        L_0x00bd:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89554ce.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
