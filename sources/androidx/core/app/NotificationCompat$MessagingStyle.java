package androidx.core.app;

import X.AnonymousClass000;
import X.AnonymousClass1X3;
import X.AnonymousClass1X5;
import X.AnonymousClass72G;
import X.C136826uT;
import X.C139156yJ;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.List;
import java.util.Locale;

public class NotificationCompat$MessagingStyle extends AnonymousClass72G {
    public Boolean A00;
    public CharSequence A01;
    public C136826uT A02;
    public final List A03 = AnonymousClass000.A13();
    public final List A04 = AnonymousClass000.A13();

    private SpannableStringBuilder A00(C139156yJ r14) {
        AnonymousClass1X3 r5;
        CharSequence charSequence;
        AnonymousClass1X3 r0 = AnonymousClass1X3.A02;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            r5 = AnonymousClass1X3.A03;
        } else {
            r5 = AnonymousClass1X3.A02;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = -16777216;
        C136826uT r02 = r14.A04;
        CharSequence charSequence2 = "";
        if (r02 == null) {
            charSequence = charSequence2;
        } else {
            charSequence = r02.A01;
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.A02.A01;
            int i2 = this.A00.A00;
            if (i2 != 0) {
                i = i2;
            }
        }
        AnonymousClass1X5 r2 = r5.A00;
        SpannableStringBuilder A022 = r5.A02(r2, charSequence);
        spannableStringBuilder.append(A022);
        spannableStringBuilder.setSpan(new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null), spannableStringBuilder.length() - A022.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = r14.A05;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append("  ").append(r5.A02(r2, charSequence2));
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r3 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass84Y r9) {
        /*
            r8 = this;
            X.73t r0 = r8.A00
            r2 = 0
            if (r0 == 0) goto L_0x0055
            android.content.Context r0 = r0.A0C
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 28
            if (r1 >= r0) goto L_0x0055
            java.lang.Boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0055
            java.lang.CharSequence r0 = r8.A01
            if (r0 == 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.A00 = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r4 < r0) goto L_0x00a0
            r3 = 28
            X.6uT r0 = r8.A02
            if (r4 < r3) goto L_0x004e
            android.app.Person r0 = r0.A00()
            android.app.Notification$MessagingStyle r2 = X.C137006ul.A00(r0)
        L_0x0034:
            java.util.List r0 = r8.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            X.6yJ r0 = (X.C139156yJ) r0
            android.app.Notification$MessagingStyle$Message r0 = r0.A01()
            X.C1401370a.A01(r0, r2)
            goto L_0x003a
        L_0x004e:
            java.lang.CharSequence r0 = r0.A01
            android.app.Notification$MessagingStyle r2 = X.C1401370a.A00(r0)
            goto L_0x0034
        L_0x0055:
            java.lang.Boolean r0 = r8.A00
            if (r0 == 0) goto L_0x001a
            boolean r2 = r0.booleanValue()
            goto L_0x001a
        L_0x005e:
            r0 = 26
            if (r4 < r0) goto L_0x007c
            java.util.List r0 = r8.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0068:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r1.next()
            X.6yJ r0 = (X.C139156yJ) r0
            android.app.Notification$MessagingStyle$Message r0 = r0.A01()
            X.AnonymousClass6V3.A00(r0, r2)
            goto L_0x0068
        L_0x007c:
            java.lang.Boolean r0 = r8.A00
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0086
            if (r4 < r3) goto L_0x0096
        L_0x0086:
            java.lang.CharSequence r0 = r8.A01
            X.C1401370a.A02(r2, r0)
            if (r4 < r3) goto L_0x0096
            java.lang.Boolean r0 = r8.A00
            boolean r0 = r0.booleanValue()
            X.C137006ul.A01(r2, r0)
        L_0x0096:
            X.79t r9 = (X.C1425179t) r9
            android.app.Notification$Builder r0 = r9.A02
            android.app.Notification$Style r2 = (android.app.Notification.Style) r2
            r2.setBuilder(r0)
            return
        L_0x00a0:
            java.util.List r4 = r8.A03
            int r1 = r4.size()
        L_0x00a6:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0145
            java.lang.Object r3 = r4.get(r1)
            X.6yJ r3 = (X.C139156yJ) r3
            X.6uT r0 = r3.A04
            if (r0 == 0) goto L_0x00a6
            X.6uT r0 = r3.A04
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a6
        L_0x00be:
            java.lang.CharSequence r2 = r8.A01
            if (r2 == 0) goto L_0x012f
            java.lang.Boolean r0 = r8.A00
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x012f
            r0 = r9
            X.79t r0 = (X.C1425179t) r0
            android.app.Notification$Builder r1 = r0.A02
            r1.setContentTitle(r2)
            if (r3 == 0) goto L_0x00df
        L_0x00d4:
            java.lang.CharSequence r0 = r8.A01
            if (r0 == 0) goto L_0x012c
            android.text.SpannableStringBuilder r0 = r8.A00(r3)
        L_0x00dc:
            r1.setContentText(r0)
        L_0x00df:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            java.lang.CharSequence r0 = r8.A01
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0100
            int r2 = X.AnonymousClass3MX.A02(r4, r6)
        L_0x00ee:
            if (r2 < 0) goto L_0x012a
            java.lang.Object r1 = r4.get(r2)
            X.6yJ r1 = (X.C139156yJ) r1
            X.6uT r0 = r1.A04
            if (r0 == 0) goto L_0x0127
            X.6uT r0 = r1.A04
            java.lang.CharSequence r0 = r0.A01
            if (r0 != 0) goto L_0x0127
        L_0x0100:
            r3 = 1
        L_0x0101:
            int r2 = X.AnonymousClass3MX.A02(r4, r6)
        L_0x0105:
            if (r2 < 0) goto L_0x015a
            java.lang.Object r0 = r4.get(r2)
            X.6yJ r0 = (X.C139156yJ) r0
            if (r3 == 0) goto L_0x0124
            android.text.SpannableStringBuilder r1 = r8.A00(r0)
        L_0x0113:
            int r0 = X.AnonymousClass3MX.A02(r4, r6)
            if (r2 == r0) goto L_0x011e
            java.lang.String r0 = "\n"
            r5.insert(r7, r0)
        L_0x011e:
            r5.insert(r7, r1)
            int r2 = r2 + -1
            goto L_0x0105
        L_0x0124:
            java.lang.CharSequence r1 = r0.A05
            goto L_0x0113
        L_0x0127:
            int r2 = r2 + -1
            goto L_0x00ee
        L_0x012a:
            r3 = 0
            goto L_0x0101
        L_0x012c:
            java.lang.CharSequence r0 = r3.A05
            goto L_0x00dc
        L_0x012f:
            if (r3 == 0) goto L_0x00df
            r0 = r9
            X.79t r0 = (X.C1425179t) r0
            android.app.Notification$Builder r1 = r0.A02
            java.lang.String r0 = ""
            r1.setContentTitle(r0)
            X.6uT r0 = r3.A04
            if (r0 == 0) goto L_0x00d4
            java.lang.CharSequence r0 = r0.A01
            r1.setContentTitle(r0)
            goto L_0x00d4
        L_0x0145:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0157
            int r0 = X.AnonymousClass3MX.A01(r4)
            java.lang.Object r3 = r4.get(r0)
            X.6yJ r3 = (X.C139156yJ) r3
            goto L_0x00be
        L_0x0157:
            r3 = 0
            goto L_0x00be
        L_0x015a:
            X.79t r9 = (X.C1425179t) r9
            android.app.Notification$Builder r0 = r9.A02
            android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
            r1.<init>(r0)
            r0 = 0
            android.app.Notification$BigTextStyle r0 = r1.setBigContentTitle(r0)
            r0.bigText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$MessagingStyle.A06(X.84Y):void");
    }

    public void A07(C139156yJ r4) {
        List list = this.A03;
        list.add(r4);
        if (list.size() > 25) {
            list.remove(0);
        }
    }

    public NotificationCompat$MessagingStyle(C136826uT r2) {
        if (!TextUtils.isEmpty(r2.A01)) {
            this.A02 = r2;
            return;
        }
        throw AnonymousClass000.A0k("User's name must not be empty.");
    }

    public void A05(Bundle bundle) {
        super.A05(bundle);
        C136826uT r2 = this.A02;
        bundle.putCharSequence("android.selfDisplayName", r2.A01);
        bundle.putBundle("android.messagingStyleUser", r2.A01());
        bundle.putCharSequence("android.hiddenConversationTitle", this.A01);
        CharSequence charSequence = this.A01;
        if (charSequence != null && this.A00.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", charSequence);
        }
        List list = this.A03;
        if (!list.isEmpty()) {
            bundle.putParcelableArray("android.messages", C139156yJ.A00(list));
        }
        List list2 = this.A04;
        if (!list2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C139156yJ.A00(list2));
        }
        Boolean bool = this.A00;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public NotificationCompat$MessagingStyle() {
    }
}
