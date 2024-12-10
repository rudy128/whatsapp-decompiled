package X;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1R2  reason: invalid class name */
public class AnonymousClass1R2 {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final C24921Me A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;
    public final C24751Ln A06;
    public final C18030ve A07;
    public final AnonymousClass1QD A08;
    public final AnonymousClass1QO A09;
    public final AnonymousClass1QS A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass1PM A0C;
    public final AnonymousClass1MZ A0D;
    public final AnonymousClass1KI A0E;
    public final AnonymousClass1QJ A0F;
    public final AnonymousClass1QE A0G = AnonymousClass1QE.A00("PaymentsUtils", "infra", "COMMON");

    public static String A07(int i, int i2) {
        if (i == 1) {
            return "main_camera";
        }
        if (i != 3) {
            if (i == 4) {
                return "payments_camera";
            }
            return "unknown";
        } else if (i2 == 1) {
            return "chat_attachment_gallery";
        } else {
            if (i2 == 10) {
                return "main_camera_gallery";
            }
            if (i2 == 13 || i2 == 21) {
                return "chat_camera_gallery";
            }
            if (i2 == 33) {
                return "photo_received";
            }
            if (i2 == 34) {
                return "photo_received_gallery";
            }
            return "unknown";
        }
    }

    public int A0H(AnonymousClass1BI r8) {
        C199410f A0C2;
        AnonymousClass1QO r3 = this.A09;
        if (!r3.A04(0)) {
            return 0;
        }
        AnonymousClass11S r4 = this.A00;
        if (r4.A0O(r8) || C22971Dz.A0N(r8)) {
            return 0;
        }
        if (C22971Dz.A0e(r8)) {
            r3.A04.A02();
            int i = 4;
            C63872tp A0C3 = this.A0D.A08.A0C((AnonymousClass1E9) r8);
            if (AnonymousClass000.A1T(2, A0C3.A00)) {
                A0C2 = C199410f.copyOf((Collection) A0C3.A08.keySet());
            } else {
                A0C2 = A0C3.A0C();
            }
            AnonymousClass1IZ it = A0C2.iterator();
            while (it.hasNext()) {
                UserJid userJid = (UserJid) it.next();
                if (!r4.A0O(userJid)) {
                    i = 3;
                    if (A00(this.A06, userJid, r3) == 2) {
                        return 4;
                    }
                }
            }
            return i;
        }
        C22941Dw r0 = UserJid.Companion;
        return A00(this.A06, C22941Dw.A01(r8), r3);
    }

    public SpannableStringBuilder A0J(Context context, int i) {
        AnonymousClass1KJ r1;
        if (i == 1) {
            AnonymousClass11S r0 = this.A00;
            r0.A0I();
            PhoneUserJid phoneUserJid = r0.A0E;
            C17960vV.A07(phoneUserJid);
            AnonymousClass1KJ[] r02 = AnonymousClass1KI.A01;
            r1 = C63572tK.A00(C63572tK.A01(C20056A5f.A02(AnonymousClass17K.A00(C42771yi.A00(), phoneUserJid))).A03).A02;
        } else if (i != 3) {
            return null;
        } else {
            r1 = AnonymousClass1KL.A0B;
        }
        C18070vi.A0d(context, 0);
        return ((AnonymousClass1KL) r1).BPn(context, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0R(X.AnonymousClass8pG r3, X.AnonymousClass1BI r4, boolean r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto L_0x0019
            X.1M9 r0 = r2.A01     // Catch:{ all -> 0x0022 }
            X.1E7 r1 = r0.A0H(r4)     // Catch:{ all -> 0x0022 }
            if (r5 == 0) goto L_0x0012
            X.1Me r0 = r2.A02     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = r0.A0O(r1)     // Catch:{ all -> 0x0022 }
            goto L_0x0020
        L_0x0012:
            X.1Me r0 = r2.A02     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = r0.A0I(r1)     // Catch:{ all -> 0x0022 }
            goto L_0x0020
        L_0x0019:
            if (r3 == 0) goto L_0x0025
            r0 = 1
            java.lang.String r0 = r2.A0A(r3, r0)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r2)
            return r0
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0025:
            monitor-exit(r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0R(X.8pG, X.1BI, boolean):java.lang.String");
    }

    public synchronized String A0U(AW0 aw0) {
        return A0a(aw0, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (r3 != 1000) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0V(X.AW0 r8) {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x001d
            X.1M9 r0 = r7.A01     // Catch:{ all -> 0x0094 }
            X.1E7 r5 = r0.A0H(r1)     // Catch:{ all -> 0x0094 }
        L_0x000c:
            X.118 r0 = r7.A04     // Catch:{ all -> 0x0094 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x0094 }
            r0 = 2131897317(0x7f122be5, float:1.942952E38)
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x0094 }
            int r3 = r8.A03     // Catch:{ all -> 0x0094 }
            r1 = 1
            if (r3 == r1) goto L_0x001f
            goto L_0x0036
        L_0x001d:
            r5 = 0
            goto L_0x000c
        L_0x001f:
            if (r5 == 0) goto L_0x0028
            X.1Me r0 = r7.A02     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.A0O(r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x0028:
            X.8pG r0 = r8.A0A     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r7.A0A(r0, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0050
        L_0x0034:
            monitor-exit(r6)
            return r0
        L_0x0036:
            r0 = 2
            if (r3 == r0) goto L_0x008a
            r0 = 3
            if (r3 == r0) goto L_0x0052
            r0 = 10
            if (r3 == r0) goto L_0x008a
            r0 = 20
            if (r3 == r0) goto L_0x001f
            r0 = 100
            if (r3 == r0) goto L_0x001f
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x008a
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 == r0) goto L_0x005b
        L_0x0050:
            monitor-exit(r6)
            return r4
        L_0x0052:
            if (r5 == 0) goto L_0x005b
            X.1Me r0 = r7.A02     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.A0O(r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x005b:
            X.11S r1 = r7.A00     // Catch:{ all -> 0x0092 }
            com.whatsapp.jid.UserJid r0 = r8.A0D     // Catch:{ all -> 0x0092 }
            boolean r0 = r1.A0O(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x006d
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x006d:
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0078
            X.1M9 r0 = r7.A01     // Catch:{ all -> 0x0092 }
            X.1E7 r1 = r0.A0H(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r1 == 0) goto L_0x0082
            X.1Me r0 = r7.A02     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = r0.A0O(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x0082:
            r0 = 2131897317(0x7f122be5, float:1.942952E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x008a:
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x0092:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0V(X.AW0):java.lang.String");
    }

    public synchronized String A0W(AW0 aw0) {
        AnonymousClass1E7 r2;
        String str;
        C17960vV.A0D(aw0.A0K());
        UserJid userJid = aw0.A0E;
        if (userJid != null) {
            r2 = this.A01.A0H(userJid);
        } else {
            r2 = null;
        }
        if (r2 == null) {
            AnonymousClass8pG r0 = aw0.A0A;
            if (r0 != null) {
                str = A0A(r0, false);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A04.A00.getString(2131897311);
            }
        } else if (this.A00.A0O(r2.A0J)) {
            str = this.A04.A00.getString(2131898595);
        } else {
            str = this.A02.A0O(r2);
        }
        return str;
    }

    public synchronized String A0X(AW0 aw0) {
        AnonymousClass1E7 r2;
        String str;
        C17960vV.A0D(aw0.A0K());
        UserJid userJid = aw0.A0D;
        if (userJid != null) {
            r2 = this.A01.A0H(userJid);
        } else {
            r2 = null;
        }
        if (r2 == null) {
            AnonymousClass8pG r0 = aw0.A0A;
            if (r0 != null) {
                str = A0A(r0, true);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A04.A00.getString(2131897311);
            }
        } else if (this.A00.A0O(r2.A0J)) {
            str = this.A04.A00.getString(2131898595);
        } else {
            str = this.A02.A0O(r2);
        }
        return str;
    }

    public synchronized String A0Y(AW0 aw0) {
        AnonymousClass1E7 r1;
        String str;
        UserJid userJid = aw0.A0E;
        if (userJid != null) {
            r1 = this.A01.A0H(userJid);
        } else {
            r1 = null;
        }
        if (r1 != null) {
            str = this.A02.A0O(r1);
        } else {
            AnonymousClass8pG r0 = aw0.A0A;
            if (r0 != null) {
                str = A0A(r0, false);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A04.A00.getString(2131897311);
            }
        }
        return str;
    }

    public synchronized String A0Z(AW0 aw0, AnonymousClass206 r8) {
        String str;
        AnonymousClass1M9 r1 = this.A01;
        UserJid A0I = r8.A0I();
        C17960vV.A07(A0I);
        AnonymousClass1E7 A0H = r1.A0H(A0I);
        if (r8 instanceof AnonymousClass21G) {
            boolean z = r8.A0v.A02;
            int i = 2131893748;
            if (z) {
                i = 2131893754;
            }
            if (aw0.A09 == null) {
                i = 2131893749;
                if (z) {
                    i = 2131893755;
                }
            }
            str = this.A04.A00.getString(i, new Object[]{this.A02.A0I(A0H), A0T(aw0)});
        } else if (r8 instanceof AnonymousClass21I) {
            boolean z2 = r8.A0v.A02;
            int i2 = 2131893750;
            if (z2) {
                i2 = 2131893751;
            }
            if (aw0.A09 == null) {
                i2 = 2131893753;
                if (z2) {
                    i2 = 2131893752;
                }
            }
            str = this.A04.A00.getString(i2, new Object[]{this.A02.A0I(A0H), A0T(aw0)});
        } else {
            throw new IllegalStateException(AnonymousClass1QE.A01("PaymentsUtils", "Request message is not cancelled or rejected"));
        }
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        if (r0 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r0 = r3.A04.A00.getString(2131897311);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0a(X.AW0 r4, boolean r5) {
        /*
            r3 = this;
            r2 = r3
            monitor-enter(r2)
            int r1 = r4.A03     // Catch:{ all -> 0x00d0 }
            r0 = 20
            if (r1 == r0) goto L_0x00b6
            r0 = 30
            if (r1 == r0) goto L_0x007c
            r0 = 40
            if (r1 == r0) goto L_0x00b6
            r0 = 100
            if (r1 == r0) goto L_0x00b6
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0058
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L_0x007c
            switch(r1) {
                case 1: goto L_0x00b6;
                case 2: goto L_0x0058;
                case 3: goto L_0x007c;
                case 4: goto L_0x007c;
                case 5: goto L_0x007c;
                case 6: goto L_0x004c;
                case 7: goto L_0x0039;
                case 8: goto L_0x002c;
                case 9: goto L_0x0021;
                case 10: goto L_0x0058;
                default: goto L_0x001f;
            }     // Catch:{ all -> 0x00d0 }
        L_0x001f:
            goto L_0x00c4
        L_0x0021:
            r1 = 0
            X.8pG r0 = r4.A0A     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = r3.A0A(r0, r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c0
        L_0x002c:
            X.118 r0 = r3.A04     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d0 }
            r0 = 2131893762(0x7f121e02, float:1.942231E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x0039:
            X.118 r0 = r3.A04     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d0 }
            X.1QS r0 = r3.A0A     // Catch:{ all -> 0x00d0 }
            X.BD1 r0 = r0.A06()     // Catch:{ all -> 0x00d0 }
            int r0 = r0.BWa()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x004c:
            X.118 r0 = r3.A04     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d0 }
            r0 = 2131893761(0x7f121e01, float:1.9422308E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x0058:
            com.whatsapp.jid.UserJid r1 = r4.A0E     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0072
            X.1M9 r0 = r3.A01     // Catch:{ all -> 0x00d0 }
            X.1E7 r1 = r0.A0H(r1)     // Catch:{ all -> 0x00d0 }
            if (r5 == 0) goto L_0x006b
            X.1Me r0 = r3.A02     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r0.A0O(r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x006b:
            X.1Me r0 = r3.A02     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r0.A0I(r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x0072:
            r1 = 0
            X.8pG r0 = r4.A0A     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = r3.A0A(r0, r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c0
        L_0x007c:
            com.whatsapp.jid.UserJid r1 = r4.A0D     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x00a8
            com.whatsapp.jid.UserJid r0 = r4.A0E     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00a8
            X.11S r0 = r3.A00     // Catch:{ all -> 0x00b4 }
            boolean r0 = r0.A0O(r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0095
            com.whatsapp.jid.UserJid r1 = r4.A0E     // Catch:{ all -> 0x00b4 }
        L_0x008e:
            X.1M9 r0 = r3.A01     // Catch:{ all -> 0x00b4 }
            X.1E7 r1 = r0.A0H(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x0098
        L_0x0095:
            com.whatsapp.jid.UserJid r1 = r4.A0D     // Catch:{ all -> 0x00b4 }
            goto L_0x008e
        L_0x0098:
            if (r5 == 0) goto L_0x00a1
            X.1Me r0 = r3.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.A0O(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x00c2
        L_0x00a1:
            X.1Me r0 = r3.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.A0I(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x00c2
        L_0x00a8:
            X.118 r0 = r3.A04     // Catch:{ all -> 0x00b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00b4 }
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00c2
        L_0x00b4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00b6:
            com.whatsapp.jid.UserJid r1 = r4.A0D     // Catch:{ all -> 0x00d0 }
            X.8pG r0 = r4.A0A     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r3.A0R(r0, r1, r5)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            if (r0 == 0) goto L_0x00c4
        L_0x00c2:
            monitor-exit(r2)
            return r0
        L_0x00c4:
            X.118 r0 = r3.A04     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d0 }
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0a(X.AW0, boolean):java.lang.String");
    }

    public boolean A0n(AnonymousClass1BI r6) {
        if (r6 != null) {
            String str = r6.user;
            try {
                JSONArray jSONArray = new JSONArray(C18020vd.A01(C18040vf.A02, this.A07, 2462));
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentsUtils/isMessageBusinessSupported: Unable to parse allowed_message_merchants");
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r6.A07;
        r2 = X.C18040vf.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0o(X.AnonymousClass1BI r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x0030
            X.0ve r3 = r6.A07
            r0 = 2435(0x983, float:3.412E-42)
            X.0vf r2 = X.C18040vf.A02
            java.lang.String r1 = X.C18020vd.A01(r2, r3, r0)
            if (r1 == 0) goto L_0x0030
            r0 = 2221(0x8ad, float:3.112E-42)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)
            java.lang.String r3 = r7.user
            int r2 = r4.length
            r1 = 0
        L_0x0021:
            if (r1 >= r2) goto L_0x0030
            r0 = r4[r1]
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002d
            r0 = 1
            return r0
        L_0x002d:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0030:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0o(X.1BI):boolean");
    }

    public static int A00(C24751Ln r6, UserJid userJid, AnonymousClass1QO r8) {
        C42741yf A012;
        boolean z;
        if (userJid instanceof AnonymousClass1E2) {
            userJid = r6.A0D((AnonymousClass1E1) userJid);
        }
        String A002 = AnonymousClass17K.A00(C42771yi.A00(), userJid);
        AnonymousClass1PM r1 = r8.A00;
        C42741yf A013 = r1.A01(userJid);
        if ((A013 == null || !A013.A03()) && ((A012 = r1.A01(userJid)) == null || !A012.A02())) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass1QD r3 = r8.A03;
        if (!r3.A03().getBoolean("pref_dogfooding_enabled", false) || r3.A03().getBoolean("pref_mocking_enabled", false)) {
            String A022 = C20056A5f.A02(A002);
            Set<C63572tK> set = (Set) C50842Vz.A00.get(C63572tK.A01(A022));
            AnonymousClass1QJ r4 = r8.A04;
            C63572tK A023 = r4.A02();
            if (set == null || A023 == null) {
                return 1;
            }
            for (C63572tK r0 : set) {
                if (r0.A03.equals(A023.A03)) {
                    r4.A02();
                    if (z && "91".equals(A022)) {
                        if (C18020vd.A05(C18040vf.A02, r8.A02, 5415)) {
                            return 2;
                        }
                        return 1;
                    }
                }
            }
            return 1;
        }
        return 2;
    }

    public static int A01(AW0 aw0) {
        int i = aw0.A02;
        if (i == 802 || i == 804 || i == 902 || i == 904 || i == 906 || i == 908) {
            return 2131102146;
        }
        switch (i) {
            case 11:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
                return 2131102145;
            case 13:
            case 14:
                return 2131102147;
            case 17:
                return 2131102146;
            default:
                switch (i) {
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 109:
                    case 112:
                        return 2131102145;
                    case 105:
                    case 107:
                    case AnonymousClass74N.A03 /*108*/:
                    case 110:
                    case 111:
                        return 2131102147;
                    case 106:
                        return 2131102146;
                    default:
                        switch (i) {
                            case 401:
                            case 402:
                            case 403:
                            case 410:
                            case 415:
                            case 417:
                            case 418:
                                return 2131102145;
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 416:
                                return 2131102147;
                            case 405:
                                return 2131102146;
                            default:
                                switch (i) {
                                    case 420:
                                    case 421:
                                        return 2131102145;
                                    case 422:
                                    case 423:
                                    case 424:
                                        return 2131102147;
                                    default:
                                        switch (i) {
                                            case 601:
                                            case 602:
                                            case 603:
                                            case 606:
                                            case 607:
                                            case 608:
                                                return 2131102145;
                                            case 604:
                                                return 2131102146;
                                            case 605:
                                                return 2131102147;
                                            default:
                                                switch (i) {
                                                    case 703:
                                                        return 2131102146;
                                                    case 704:
                                                        return 2131102147;
                                                    default:
                                                        return 2131102145;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static BDZ A02(AEY aey) {
        List<C20251ADj> list = aey.A03;
        if (list.size() <= 0) {
            return null;
        }
        for (C20251ADj aDj : list) {
            if ("pix_static_code".equals(aDj.A01)) {
                return aDj.A00;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return X.AnonymousClass00R.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return X.AnonymousClass00R.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return X.AnonymousClass00R.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A05(X.AW0 r0) {
        /*
            int r0 = r0.A02
            switch(r0) {
                case 11: goto L_0x0014;
                case 12: goto L_0x0014;
                case 13: goto L_0x001a;
                case 14: goto L_0x001a;
                case 15: goto L_0x0014;
                case 16: goto L_0x0014;
                case 17: goto L_0x0017;
                case 18: goto L_0x0014;
                case 19: goto L_0x0014;
                case 20: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            switch(r0) {
                case 101: goto L_0x0014;
                case 102: goto L_0x0014;
                case 103: goto L_0x0014;
                case 104: goto L_0x0014;
                case 105: goto L_0x001a;
                case 106: goto L_0x0017;
                case 107: goto L_0x001a;
                case 108: goto L_0x001a;
                case 109: goto L_0x0014;
                case 110: goto L_0x001a;
                case 111: goto L_0x001a;
                case 112: goto L_0x0014;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r0) {
                case 401: goto L_0x0014;
                case 402: goto L_0x0014;
                case 403: goto L_0x0014;
                case 404: goto L_0x001a;
                case 405: goto L_0x0017;
                case 406: goto L_0x001a;
                case 407: goto L_0x001a;
                case 408: goto L_0x001a;
                case 409: goto L_0x001a;
                case 410: goto L_0x0014;
                case 411: goto L_0x001a;
                case 412: goto L_0x001a;
                case 413: goto L_0x001a;
                case 414: goto L_0x001a;
                case 415: goto L_0x0014;
                case 416: goto L_0x001a;
                case 417: goto L_0x0014;
                case 418: goto L_0x0014;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r0) {
                case 420: goto L_0x0014;
                case 421: goto L_0x0014;
                case 422: goto L_0x001a;
                case 423: goto L_0x001a;
                case 424: goto L_0x001a;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r0) {
                case 601: goto L_0x0014;
                case 602: goto L_0x0014;
                case 603: goto L_0x0014;
                case 604: goto L_0x0017;
                case 605: goto L_0x001a;
                case 606: goto L_0x0014;
                case 607: goto L_0x0014;
                case 608: goto L_0x0014;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r0) {
                case 703: goto L_0x0017;
                case 704: goto L_0x001a;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        L_0x0017:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            return r0
        L_0x001a:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A05(X.AW0):java.lang.Integer");
    }

    public static String A06(int i) {
        if (i == 0) {
            return "native";
        }
        if (i == 2) {
            return "cpi";
        }
        if (i == 3) {
            return "confirm";
        }
        if (i == 5) {
            return "payment_link";
        }
        if (i == 6) {
            return "pix";
        }
        if (i == 7) {
            return "hpp";
        }
        if (i != 8) {
            return null;
        }
        return "boleto";
    }

    private String A08(long j, int i) {
        C18000vb r2;
        String str = "";
        if (j > 0) {
            long j2 = 86400000;
            int i2 = (int) (j / 86400000);
            if (i2 > 0) {
                r2 = this.A05;
                str = C64052u8.A02(r2, i2, 3);
            } else {
                j2 = 3600000;
                int i3 = (int) (j / 3600000);
                if (i3 > 0) {
                    r2 = this.A05;
                    str = C64052u8.A02(r2, i3, 2);
                } else {
                    int i4 = (int) (j / 60000);
                    if (i4 > 0) {
                        return C64052u8.A02(this.A05, i4, 1);
                    }
                }
            }
            long j3 = j % j2;
            if (!(i == 1 || j3 == 0)) {
                return r2.A0B(244, str, A08(j3, 1));
            }
        }
        return str;
    }

    public static String A09(AnonymousClass1KN r2, String str) {
        if (r2 == null) {
            return "";
        }
        return TextUtils.join(";", Arrays.asList(new String[]{str, Long.toString(r2.A00.scaleByPowerOfTen(3).longValue())}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A0A(X.AnonymousClass8pG r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x0017
            X.77e r0 = r5.A0D()
        L_0x0006:
            if (r0 == 0) goto L_0x0015
            java.lang.Object r3 = r0.A00
        L_0x000a:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x004b
            boolean r0 = X.AnonymousClass1EG.A0H(r3)
            if (r0 != 0) goto L_0x0047
            goto L_0x001c
        L_0x0015:
            r3 = 0
            goto L_0x000a
        L_0x0017:
            X.77e r0 = r5.A0E()
            goto L_0x0006
        L_0x001c:
            X.0ve r2 = r4.A07     // Catch:{ JSONException -> 0x0042 }
            r1 = 1940(0x794, float:2.719E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r0 = X.C18020vd.A01(r0, r2, r1)     // Catch:{ JSONException -> 0x0042 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0042 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0042 }
            r1 = 0
        L_0x002c:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x0042 }
            if (r1 >= r0) goto L_0x0047
            java.lang.String r0 = r2.getString(r1)     // Catch:{ JSONException -> 0x0042 }
            boolean r0 = r3.equalsIgnoreCase(r0)     // Catch:{ JSONException -> 0x0042 }
            if (r0 == 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0040:
            r0 = 0
            goto L_0x0048
        L_0x0042:
            java.lang.String r0 = "PaymentsUtils failed to parse json in abprop"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0047:
            r0 = 1
        L_0x0048:
            if (r0 == 0) goto L_0x004b
            return r3
        L_0x004b:
            if (r6 == 0) goto L_0x0052
            java.lang.String r0 = r5.A0G()
            return r0
        L_0x0052:
            java.lang.String r0 = r5.A0I()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0A(X.8pG, boolean):java.lang.String");
    }

    public static String A0B(AW0 aw0, AnonymousClass1R2 r6) {
        boolean A0O = r6.A00.A0O(aw0.A0D);
        AnonymousClass118 r0 = r6.A04;
        if (A0O) {
            return r0.A00.getString(2131893623);
        }
        return r0.A00.getString(2131893624, new Object[]{r6.A0V(aw0)});
    }

    public static String A0C(AnonymousClass1R2 r9, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j) {
        int i12 = i9;
        long j2 = j;
        if (j <= 0) {
            return r9.A04.A00.getString(i, new Object[]{str});
        }
        int A002 = A87.A00(7, AnonymousClass11P.A01(r9.A03), j2);
        if (A002 == 0) {
            return r9.A04.A00.getString(i2, new Object[]{str});
        } else if (A002 == 1) {
            return r9.A04.A00.getString(i3, new Object[]{str});
        } else if (A002 < 7) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            switch (instance.get(7)) {
                case 1:
                    i12 = i10;
                    break;
                case 2:
                    i12 = i4;
                    break;
                case 3:
                    i12 = i5;
                    break;
                case 4:
                    i12 = i6;
                    break;
                case 5:
                    i12 = i7;
                    break;
                case 6:
                    i12 = i8;
                    break;
                case 7:
                    break;
                default:
                    i12 = 0;
                    break;
            }
            return r9.A04.A00.getString(i12, new Object[]{str});
        } else {
            return r9.A04.A00.getString(i11, new Object[]{str, AnonymousClass11X.A02(r9.A05, j2)});
        }
    }

    public static boolean A0F(C18030ve r2, C20279AEn aEn) {
        if (!C18020vd.A05(C18040vf.A02, r2, 6710) || aEn == null || !"quick_pay".equals(aEn.A0D.A08)) {
            return false;
        }
        return true;
    }

    public int A0G(AW0 aw0) {
        int i = aw0.A02;
        if (i == 0) {
            return 0;
        }
        switch (i) {
            case 11:
                return 2131894119;
            case 12:
            case 20:
                return 2131894117;
            case 13:
            case 14:
                return 2131894110;
            case 15:
                return 2131893992;
            case 16:
                return 2131894109;
            case 17:
                return 2131894106;
            case 18:
                return 2131894122;
            case 19:
                if (aw0.A03 == 10) {
                    return 2131894001;
                }
                return 2131893994;
            default:
                switch (i) {
                    case 101:
                    case 103:
                    case 104:
                    case 109:
                    case 113:
                    case 114:
                        return 2131894119;
                    case 102:
                    case 110:
                    case 115:
                        return 2131894117;
                    case 105:
                    case AnonymousClass74N.A03 /*108*/:
                    case 111:
                        return 2131894110;
                    case 106:
                        return 2131894106;
                    case 107:
                        return 2131894109;
                    case 112:
                        return 2131894122;
                    default:
                        switch (i) {
                            case 401:
                            case 403:
                            case 410:
                            case 420:
                                return 2131894119;
                            case 402:
                            case 419:
                            case 425:
                                return 2131894117;
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 422:
                            case 423:
                            case 424:
                                return 2131894110;
                            case 405:
                                return 2131894106;
                            case 415:
                            case 421:
                                return 2131894122;
                            case 416:
                                return 2131894109;
                            case 417:
                                return this.A0A.A06().BYb(aw0);
                            case 418:
                                return 2131894104;
                            default:
                                switch (i) {
                                    case 601:
                                    case 602:
                                        return 2131894119;
                                    case 603:
                                        return 2131894123;
                                    case 604:
                                        return 2131894106;
                                    case 605:
                                        return 2131894110;
                                    case 606:
                                        return 2131894122;
                                    case 607:
                                        return 2131894109;
                                    case 608:
                                        return 2131894117;
                                    default:
                                        switch (i) {
                                            case 701:
                                                return 2131894119;
                                            case 702:
                                                return 2131894123;
                                            case 703:
                                                return 2131894106;
                                            case 704:
                                                return 2131894110;
                                            case 705:
                                                return 2131894122;
                                            default:
                                                switch (i) {
                                                    case 801:
                                                    case 803:
                                                        return 2131894119;
                                                    case 802:
                                                    case 804:
                                                        return 2131894106;
                                                    default:
                                                        switch (i) {
                                                            case 901:
                                                            case 905:
                                                                return 2131894118;
                                                            case 902:
                                                            case 904:
                                                            case 906:
                                                            case 908:
                                                                return 2131894106;
                                                            case 903:
                                                                return 2131894121;
                                                            case 907:
                                                                return 2131894117;
                                                            default:
                                                                return 2131894120;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public int A0I(AEU aeu) {
        if ("pending".equals(aeu.A01) && "PAYMENT_REQUEST".equals(aeu.A08)) {
            C18030ve r2 = this.A09.A02;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 5575) || C18020vd.A05(r1, r2, 5574)) {
                return 7;
            }
        }
        return C20089A6r.A01(aeu.A01);
    }

    public Pair A0K(long j) {
        Integer valueOf;
        C18000vb r1;
        int i;
        if (j <= 0) {
            return null;
        }
        int i2 = (int) (j / 86400000);
        if (i2 > 0) {
            valueOf = Integer.valueOf(i2);
            r1 = this.A05;
            i = 3;
        } else {
            i2 = (int) (j / 3600000);
            if (i2 > 0) {
                valueOf = Integer.valueOf(i2);
                r1 = this.A05;
                i = 2;
            } else {
                i2 = (int) (j / 60000);
                if (i2 <= 0) {
                    return null;
                }
                valueOf = Integer.valueOf(i2);
                r1 = this.A05;
                i = 1;
            }
        }
        return new Pair(valueOf, C64052u8.A02(r1, i2, i));
    }

    public AnonymousClass26n A0N(Context context, C63572tK r3, int i, int i2) {
        if (r3 == null || r3.A02() == null) {
            return null;
        }
        return A0M(context, r3.A02(), i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        if (r6.A09.A0N(r7.A0I, r7.A0Q) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A0O(X.C20279AEn r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x000f
            X.1QO r2 = r6.A09
            java.lang.String r1 = r7.A0I
            java.util.List r0 = r7.A0Q
            boolean r0 = r2.A0N(r1, r0)
            r5 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            X.1QS r1 = r6.A0A
            java.lang.String r0 = "p2p_context"
            X.1QK r0 = r1.A02(r0)
            X.1QM r1 = r0.A03()
            if (r1 == 0) goto L_0x003b
            java.lang.String r0 = "unset"
            java.lang.String r1 = r1.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "tos_with_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003e
        L_0x003b:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            return r0
        L_0x003e:
            X.1QD r4 = r6.A08
            android.content.SharedPreferences r1 = r4.A03()
            java.lang.String r0 = "pref_p2m_hybrid_tos_accepted"
            r3 = 0
            boolean r2 = r1.getBoolean(r0, r3)
            if (r5 == 0) goto L_0x005e
            android.content.SharedPreferences r1 = r4.A03()
            java.lang.String r0 = "pref_p2m_hybrid_v2_tos_accepted"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x003b
            if (r2 == 0) goto L_0x0063
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            return r0
        L_0x005e:
            if (r2 != 0) goto L_0x003b
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        L_0x0063:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0O(X.AEn):java.lang.Integer");
    }

    public Long A0P(AW0 aw0) {
        AnonymousClass8pG r0 = aw0.A0A;
        if (r0 == null) {
            return null;
        }
        return Long.valueOf(r0.A0A() - AnonymousClass11P.A01(this.A03));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r1 != 200) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0S(X.AW0 r22) {
        /*
            r21 = this;
            r9 = r21
            X.1QE r3 = r9.A0G
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "getStatusChangeNotifStringWithoutMessage status:"
            r1.append(r0)
            r2 = r22
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = " type:"
            r1.append(r0)
            int r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.A06(r0)
            X.1KN r0 = r2.A09
            r3 = 1
            if (r0 != 0) goto L_0x00b4
            r15 = 1
        L_0x002c:
            X.1KN r0 = r2.A09
            if (r0 != 0) goto L_0x00af
            X.118 r0 = r9.A04
            android.content.Context r1 = r0.A00
            r0 = 2131897312(0x7f122be0, float:1.942951E38)
            java.lang.String r5 = r1.getString(r0)
        L_0x003b:
            int r1 = r2.A03
            r8 = 0
            if (r1 == r3) goto L_0x00f7
            r7 = 2
            if (r1 == r7) goto L_0x00d6
            r0 = 9
            if (r1 == r0) goto L_0x00bc
            r0 = 10
            java.lang.String r4 = ""
            if (r1 == r0) goto L_0x0079
            r0 = 20
            if (r1 == r0) goto L_0x005a
            r0 = 100
            if (r1 == r0) goto L_0x00f7
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00d6
        L_0x0059:
            return r4
        L_0x005a:
            int r1 = r2.A02
            r0 = 12
            if (r1 != r0) goto L_0x0059
            X.1QS r1 = r9.A0A
            X.BD1 r0 = r1.A06()
            X.9lJ r0 = r0.BOu()
            if (r0 == 0) goto L_0x0059
            X.BD1 r0 = r1.A06()
            X.9lJ r0 = r0.BOu()
            java.lang.String r0 = r0.A00(r2, r5)
            return r0
        L_0x0079:
            int r1 = r2.A02
            r0 = 13
            if (r1 == r0) goto L_0x00a7
            r0 = 14
            if (r1 == r0) goto L_0x00a7
            r0 = 16
            if (r1 != r0) goto L_0x009b
            X.118 r0 = r9.A04
            android.content.Context r5 = r0.A00
            r4 = 2131893977(0x7f121ed9, float:1.9422746E38)
        L_0x008e:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r9.A0Y(r2)
            r1[r8] = r0
            java.lang.String r0 = r5.getString(r4, r1)
            return r0
        L_0x009b:
            r0 = 15
            if (r1 != r0) goto L_0x0059
            X.118 r0 = r9.A04
            android.content.Context r5 = r0.A00
            r4 = 2131893979(0x7f121edb, float:1.942275E38)
            goto L_0x008e
        L_0x00a7:
            X.118 r0 = r9.A04
            android.content.Context r5 = r0.A00
            r4 = 2131893978(0x7f121eda, float:1.9422748E38)
            goto L_0x008e
        L_0x00af:
            java.lang.String r5 = r9.A0T(r2)
            goto L_0x003b
        L_0x00b4:
            java.math.BigDecimal r0 = r0.A00
            int r15 = r0.intValue()
            goto L_0x002c
        L_0x00bc:
            X.118 r0 = r9.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r6 = r0.getResources()
            r4 = 2131755331(0x7f100143, float:1.9141538E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r9.A0Y(r2)
            r1[r8] = r0
            r1[r3] = r5
            java.lang.String r0 = r6.getQuantityString(r4, r15, r1)
            return r0
        L_0x00d6:
            X.118 r0 = r9.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r6 = r0.getResources()
            r4 = 2131755328(0x7f100140, float:1.9141532E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r9.A0Y(r2)
            r1[r8] = r0
            r1[r3] = r5
            java.lang.String r0 = r9.A0V(r2)
            r1[r7] = r0
            java.lang.String r0 = r6.getQuantityString(r4, r15, r1)
            return r0
        L_0x00f7:
            java.lang.String r10 = r9.A0V(r2)
            java.lang.String r11 = r9.A0Y(r2)
            int r13 = r2.A02
            X.8pG r0 = r2.A0A
            if (r0 != 0) goto L_0x0117
            r14 = 0
        L_0x0106:
            long r0 = r2.A06
            java.lang.String r12 = r9.A0T(r2)
            r16 = 0
            r18 = r0
            r20 = r3
            java.lang.String r0 = r9.A0f(r10, r11, r12, r13, r14, r15, r16, r18, r20)
            return r0
        L_0x0117:
            int r14 = r0.A09()
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0S(X.AW0):java.lang.String");
    }

    public synchronized String A0d(AnonymousClass206 r18) {
        String string;
        int i;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            AnonymousClass206 r12 = r18;
            AW0 A002 = AnonymousClass25B.A00(r12);
            boolean z = false;
            if (A002 != null) {
                z = true;
            }
            C17960vV.A0D(z);
            AnonymousClass1KN r0 = A002.A09;
            if (r0 != null) {
                i = r0.A00.intValue();
                string = A0T(A002);
            } else {
                string = this.A04.A00.getString(2131897312);
                i = 1;
            }
            AnonymousClass11S r1 = this.A00;
            boolean A0O = r1.A0O(A002.A0E);
            boolean A0O2 = r1.A0O(A002.A0D);
            if (A002.A0K()) {
                String A0X = A0X(A002);
                String A0W = A0W(A002);
                AnonymousClass1QE r2 = this.A0G;
                StringBuilder sb = new StringBuilder();
                sb.append("payment request: ");
                sb.append(r12.A0v);
                sb.append(" requester: ");
                sb.append(A0X);
                sb.append(" requestee: ");
                sb.append(A0W);
                r2.A06(sb.toString());
                if (A0O2) {
                    str = this.A04.A00.getResources().getQuantityString(2131755323, i, new Object[]{string, A0W});
                } else if (A0O) {
                    str = this.A04.A00.getResources().getQuantityString(2131755324, i, new Object[]{A0X, string});
                } else {
                    str = this.A04.A00.getResources().getQuantityString(2131755322, i, new Object[]{A0X, string, A0W});
                }
            } else {
                AnonymousClass205 r10 = r12.A0v;
                AnonymousClass1BI r22 = r10.A00;
                if (r22 != null) {
                    AnonymousClass1BI A0H = r12.A0H();
                    if (C22971Dz.A0e(r22) && A0H != null) {
                        r22 = A0H;
                    }
                    C24921Me r13 = this.A02;
                    AnonymousClass1M9 r02 = this.A01;
                    C17960vV.A07(r22);
                    str2 = r13.A0O(r02.A0H(r22));
                } else {
                    str2 = A0Y(AnonymousClass25B.A00(r12));
                }
                String A0V = A0V(A002);
                AnonymousClass1QE r23 = this.A0G;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("payment message: ");
                sb2.append(r10);
                sb2.append(" sender: ");
                sb2.append(str2);
                sb2.append(" receiver: ");
                sb2.append(A0V);
                r23.A06(sb2.toString());
                boolean z2 = true;
                if (!TextUtils.isEmpty(str2)) {
                    z2 = false;
                }
                int i2 = A002.A03;
                if ((i2 == 2 || i2 == 200) && A002.A02 == 102) {
                    Long A0P = A0P(A002);
                    if (A0P != null) {
                        str3 = A0Q(A0P.longValue());
                    } else {
                        str3 = null;
                    }
                    if (z2) {
                        if (TextUtils.isEmpty(str3)) {
                            str = this.A04.A00.getResources().getQuantityString(2131755332, i, new Object[]{string});
                        } else {
                            str = this.A04.A00.getResources().getString(2131894085, new Object[]{string, str3});
                        }
                    } else if (TextUtils.isEmpty(str3)) {
                        str = this.A04.A00.getResources().getQuantityString(2131755335, i, new Object[]{str2, string});
                    } else {
                        str = this.A04.A00.getResources().getString(2131894086, new Object[]{str2, string, str3});
                    }
                } else if (i2 == 1000) {
                    if (z2) {
                        str = A0B(A002, this);
                    } else if (A0O2) {
                        str = this.A04.A00.getString(2131893621, new Object[]{str2});
                    } else {
                        str = this.A04.A00.getString(2131893622, new Object[]{str2, A0V});
                    }
                } else if (z2) {
                    if (A0O2) {
                        str = this.A04.A00.getResources().getQuantityString(2131755334, i, new Object[]{string});
                    } else {
                        str = this.A04.A00.getResources().getQuantityString(2131755333, i, new Object[]{string, A0V});
                    }
                } else if (A0O) {
                    str = this.A04.A00.getResources().getQuantityString(2131755329, i, new Object[]{string, A0V});
                } else if (A0O2) {
                    str = this.A04.A00.getResources().getQuantityString(2131755330, i, new Object[]{str2, string});
                } else {
                    str = this.A04.A00.getResources().getQuantityString(2131755328, i, new Object[]{str2, string, A0V});
                }
            }
        }
        return str;
    }

    public String A0f(String str, String str2, String str3, int i, int i2, int i3, long j, long j2, boolean z) {
        int i4;
        Object[] objArr;
        int i5 = i;
        long j3 = j;
        if (z) {
            String str4 = str;
            if (i5 == 406 || i5 == 407 || i5 == 412) {
                return A0C(this, str4, 2131894125, 2131894133, 2131894134, 2131894127, 2131894131, 2131894132, 2131894130, 2131894126, 2131894128, 2131894129, 2131894124, j3);
            }
            if (i5 == 408 || i5 == 404 || i5 == 411) {
                return A0C(this, str4, 2131894138, 2131894146, 2131894147, 2131894140, 2131894144, 2131894145, 2131894143, 2131894139, 2131894141, 2131894142, 2131894135, j2);
            }
            if (i5 == 409) {
                int i6 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                Context context = this.A04.A00;
                if (i6 > 0) {
                    i4 = 2131894136;
                    objArr = new Object[]{str, context.getString(2131897064, new Object[]{AnonymousClass11X.A00.A07(this.A05, j3)})};
                } else {
                    i4 = 2131894137;
                    objArr = new Object[]{str};
                }
                return context.getString(i4, objArr);
            } else if (i5 == 421) {
                return this.A04.A00.getString(2131897045, new Object[]{str, str3});
            }
        } else {
            String str5 = str2;
            if (i5 == 102) {
                return this.A04.A00.getResources().getQuantityString(2131755335, i3, new Object[]{str2, str3});
            } else if (i5 == 106) {
                int i7 = i2;
                if (i7 == 104 || i7 == 103 || i7 == 102) {
                    return A0C(this, str5, 2131894150, 2131894158, 2131894159, 2131894152, 2131894156, 2131894157, 2131894155, 2131894151, 2131894153, 2131894154, 2131894149, j3);
                }
            } else if (i5 == 420) {
                return this.A04.A00.getString(2131897049);
            } else {
                if (i5 == 112) {
                    return this.A04.A00.getString(2131897044, new Object[]{str2, str3});
                }
            }
        }
        return "";
    }

    public HashSet A0g(C20279AEn aEn, AnonymousClass206 r12) {
        int i;
        HashSet hashSet = new HashSet();
        List<C20267ADz> list = aEn.A0O;
        if (list != null) {
            for (C20267ADz aDz : list) {
                if ("payment_instruction".equals(aDz.A01)) {
                    hashSet.add(2);
                }
            }
        }
        List<C20251ADj> list2 = aEn.A0Q;
        if (list2 != null && list2.size() > 0) {
            for (C20251ADj aDj : list2) {
                String str = aDj.A01;
                if ("pix_static_code".equals(str) || "pix_dynamic_code".equals(str)) {
                    i = 6;
                } else {
                    if ("cards".equals(str) && aEn.A08()) {
                        if (!C18020vd.A05(C18040vf.A02, this.A09.A02, 10895)) {
                            if (((C20926Abg) aDj.A00).A01) {
                                i = 0;
                            }
                        }
                    }
                    AnonymousClass1QO r5 = this.A09;
                    C18030ve r1 = r5.A02;
                    C18040vf r2 = C18040vf.A02;
                    if (C18020vd.A05(r2, r1, 9847) && r5.A0O(Collections.singletonList(aDj)) && r5.A0F()) {
                        i = 5;
                    } else if (C18020vd.A05(r2, this.A07, 11671) && "boleto".equals(str)) {
                        i = 8;
                    }
                }
                hashSet.add(i);
            }
        }
        if (!TextUtils.isEmpty(aEn.A04())) {
            AnonymousClass1BI r22 = r12.A0v.A00;
            if (C22971Dz.A0d(r22) && !hashSet.contains(0) && !hashSet.contains(5) && this.A0C.A04((UserJid) r22)) {
                hashSet.add(0);
            }
        }
        return hashSet;
    }

    public boolean A0h(Context context, UserJid userJid, int i) {
        C18030ve r1 = this.A09.A02;
        C18040vf r3 = C18040vf.A02;
        if (C18020vd.A05(r3, r1, 10897) || this.A00.A0N() || i == 0) {
            return false;
        }
        if (userJid != null) {
            AnonymousClass1PM r0 = this.A0C;
            C42741yf A012 = r0.A01(userJid);
            if (r0.A04(userJid)) {
                return false;
            }
            if (A012 != null && A012.A03() && C63572tK.A0F == this.A0F.A02()) {
                return C18020vd.A05(r3, this.A07, 5415);
            }
        }
        AnonymousClass1KJ A013 = this.A0F.A01();
        if (A013 == null) {
            return false;
        }
        C18070vi.A0d(context, 0);
        if (!TextUtils.isEmpty(((AnonymousClass1KL) A013).BPn(context, 0))) {
            return true;
        }
        return false;
    }

    public boolean A0i(C24751Ln r5, UserJid userJid, UserJid userJid2, String str) {
        this.A0B.get();
        PhoneUserJid A002 = C60432o1.A00(r5, userJid2);
        String A022 = C20056A5f.A02(AnonymousClass17K.A00(C42771yi.A00(), userJid));
        String A023 = C20056A5f.A02(AnonymousClass17K.A00(C42771yi.A00(), A002));
        if (A022 == null || A023 == null || !A022.equals(str) || !A022.equals(A023)) {
            return false;
        }
        return true;
    }

    public boolean A0j(AW0 aw0) {
        String A0H;
        AnonymousClass8pG r0 = aw0.A0A;
        if (r0 == null) {
            A0H = null;
        } else {
            A0H = r0.A0H();
        }
        if (TextUtils.isEmpty(A0H) || aw0.A0L == null || !this.A00.A0O(aw0.A0D)) {
            return false;
        }
        return true;
    }

    public boolean A0k(AW0 aw0) {
        if (aw0.A03 != 1 || aw0.A02 != 402 || !this.A00.A0O(aw0.A0E)) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A09.A02, 10897)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r1 != 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A09.A02, 10895) != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r11 == 1) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0l(X.AW0 r8, X.A5D r9, X.BDG r10, int r11) {
        /*
            r7 = this;
            int r0 = r8.A03
            r6 = 0
            r5 = 100
            if (r0 != r5) goto L_0x0016
            X.1QO r0 = r7.A09
            X.0ve r2 = r0.A02
            r1 = 10895(0x2a8f, float:1.5267E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            return r6
        L_0x0016:
            int r0 = r8.A03
            r4 = 1
            if (r0 != r4) goto L_0x002a
            X.1QO r0 = r7.A09
            X.0ve r2 = r0.A02
            r1 = 10897(0x2a91, float:1.527E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002a
            return r6
        L_0x002a:
            java.lang.String r1 = r8.A0J
            r0 = -1
            int r3 = X.C20099A7c.A01(r1, r0)
            int r0 = r8.A03
            if (r0 == r4) goto L_0x0037
            if (r0 != r5) goto L_0x0015
        L_0x0037:
            X.8pG r0 = r8.A0A
            if (r0 == 0) goto L_0x0049
            X.AEo r0 = r0.A02
            if (r0 == 0) goto L_0x0049
            X.1QO r0 = r7.A09
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0015
            if (r9 == 0) goto L_0x0015
        L_0x0049:
            X.11S r1 = r7.A00
            com.whatsapp.jid.UserJid r0 = r8.A0E
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0015
            boolean r0 = r8.A0F()
            if (r0 == 0) goto L_0x0015
            int r1 = r8.A02
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x0015
            r0 = 420(0x1a4, float:5.89E-43)
            if (r1 == r0) goto L_0x0015
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x0015
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x008c
            r0 = 407(0x197, float:5.7E-43)
            if (r1 == r0) goto L_0x0015
            if (r1 == 0) goto L_0x0015
        L_0x0071:
            r0 = 441(0x1b9, float:6.18E-43)
            if (r3 == r0) goto L_0x0015
            r0 = 410(0x19a, float:5.75E-43)
            if (r3 == r0) goto L_0x0015
            r0 = 11455(0x2cbf, float:1.6052E-41)
            if (r3 == r0) goto L_0x0015
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r3 == r0) goto L_0x0015
            if (r10 == 0) goto L_0x008a
            boolean r0 = r10.CMO(r3)
            if (r0 == 0) goto L_0x0015
        L_0x008a:
            r6 = 1
            return r6
        L_0x008c:
            int r0 = r8.A03
            if (r0 != r4) goto L_0x0015
            X.1QO r0 = r7.A09
            X.0ve r2 = r0.A02
            r1 = 2381(0x94d, float:3.336E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0015
            if (r11 != r4) goto L_0x0015
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0l(X.AW0, X.A5D, X.BDG, int):boolean");
    }

    public boolean A0m(AW0 aw0, C20279AEn aEn) {
        if (this.A09.A0M(aEn.A0I)) {
            if (aw0 == null || !aw0.A0F()) {
                return false;
            }
        } else if (!TextUtils.isEmpty(aEn.A08) || (!TextUtils.isEmpty(aEn.A06) && !"pending_buyer_confirmation".equals(aEn.A07))) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if ("payment_link".equals(r5.A06) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0p(X.C20279AEn r5) {
        /*
            r4 = this;
            java.lang.String r1 = "pending"
            java.lang.String r0 = r5.A07
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0016
            java.lang.String r1 = "payment_link"
            java.lang.String r0 = r5.A06
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            X.11S r0 = r4.A00
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0E
            X.1QO r0 = r4.A09
            java.lang.String r1 = r0.A06(r1)
            java.lang.String r0 = "BR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r5.A08
            if (r0 == 0) goto L_0x0036
            int r1 = r5.A00
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0042
        L_0x0036:
            java.lang.String r1 = "captured"
            java.lang.String r0 = r5.A07
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0042
            if (r2 == 0) goto L_0x0043
        L_0x0042:
            return r3
        L_0x0043:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0p(X.AEn):boolean");
    }

    public boolean A0q(C20279AEn aEn) {
        if (!C18020vd.A05(C18040vf.A02, this.A07, 8942)) {
            return false;
        }
        C20926Abg abg = (C20926Abg) aEn.A03(C20926Abg.class, "cards");
        C20936Abq abq = (C20936Abq) aEn.A03(C20936Abq.class, "payment_gateway");
        if ((abg == null || !abg.A01 || !abg.A02) && (abq == null || TextUtils.isEmpty(abq.A00))) {
            return false;
        }
        return true;
    }

    public boolean A0r(C20279AEn aEn) {
        AE1 ae1;
        if (!C18020vd.A05(C18040vf.A02, this.A07, 6012) || (ae1 = aEn.A0F) == null || aEn.A03 == null) {
            return false;
        }
        return !((ARR) aEn.A03).A02.A00.equals(aEn.A02(ae1).A02.A00);
    }

    public AnonymousClass1R2(AnonymousClass11S r4, AnonymousClass1M9 r5, AnonymousClass1PM r6, C24921Me r7, AnonymousClass11P r8, AnonymousClass118 r9, C18000vb r10, AnonymousClass1MZ r11, C24751Ln r12, AnonymousClass1KI r13, C18030ve r14, AnonymousClass1QD r15, AnonymousClass1QJ r16, AnonymousClass1QO r17, AnonymousClass1QS r18, AnonymousClass00H r19) {
        this.A04 = r9;
        this.A03 = r8;
        this.A07 = r14;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r7;
        this.A05 = r10;
        this.A0A = r18;
        this.A06 = r12;
        this.A08 = r15;
        this.A0C = r6;
        this.A09 = r17;
        this.A0B = r19;
        this.A0E = r13;
        this.A0F = r16;
        this.A0D = r11;
    }

    public static AnonymousClass205 A03(Intent intent) {
        AnonymousClass205 A022 = AnonymousClass4aU.A02(intent);
        if (A022 == null || !intent.hasExtra("extra_payment_carousel_card_index")) {
            return A022;
        }
        return new AnonymousClass2M2(A022, intent.getIntExtra("extra_payment_carousel_card_index", 0));
    }

    public static CharSequence A04(Context context, AW0 aw0) {
        AnonymousClass1KJ A012 = aw0.A01();
        if (A012 != AnonymousClass1KL.A0C) {
            return A012.BPn(context, aw0.A0K() ? 1 : 0);
        }
        return "";
    }

    public static void A0D(Context context, CharSequence charSequence, int i) {
        String string = context.getString(2131899286);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, i);
        builder.setMessage(charSequence);
        if (string != null) {
            builder.setPositiveButton(string, (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }

    public static void A0E(Intent intent, AnonymousClass205 r3) {
        Intent A002 = AnonymousClass4aU.A00(intent, r3);
        if (r3 instanceof AnonymousClass2M2) {
            A002.putExtra("extra_payment_carousel_card_index", ((AnonymousClass2M2) r3).A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (r2 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0L(X.AW0 r9) {
        /*
            r8 = this;
            java.lang.String r7 = r8.A0W(r9)
            java.lang.String r6 = r8.A0X(r9)
            X.0vb r0 = r8.A05
            java.lang.String r1 = r0.A05()
            java.lang.String r0 = "en"
            boolean r2 = r0.equals(r1)
            X.11S r1 = r8.A00
            com.whatsapp.jid.UserJid r0 = r9.A0D
            boolean r0 = r1.A0O(r0)
            r5 = 0
            r4 = 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0039
            if (r2 != 0) goto L_0x0039
            X.118 r0 = r8.A04
            android.content.Context r2 = r0.A00
            r1 = 2131893986(0x7f121ee2, float:1.9422764E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r7
        L_0x002f:
            java.lang.String r1 = r2.getString(r1, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            return r0
        L_0x0039:
            com.whatsapp.jid.UserJid r0 = r9.A0E
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x004f
            if (r2 != 0) goto L_0x0051
            X.118 r0 = r8.A04
            android.content.Context r2 = r0.A00
            r1 = 2131893985(0x7f121ee1, float:1.9422762E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r6
            goto L_0x002f
        L_0x004f:
            if (r2 == 0) goto L_0x0052
        L_0x0051:
            r3 = r6
        L_0x0052:
            X.118 r0 = r8.A04
            android.content.Context r2 = r0.A00
            r1 = 2131893984(0x7f121ee0, float:1.942276E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r6
            r0[r4] = r7
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R2.A0L(X.AW0):android.util.Pair");
    }

    public AnonymousClass26n A0M(Context context, AnonymousClass1KJ r7, int i, int i2) {
        int color = context.getResources().getColor(i);
        return new AnonymousClass26n(C50802Vv.A00(context), ((AnonymousClass1KL) r7).BPn(context, 0), color, context.getResources().getDimensionPixelSize(i2));
    }

    public String A0Q(long j) {
        int i = 2;
        if (j <= 86400000) {
            i = 1;
        }
        return A08(j, i);
    }

    public String A0T(AW0 aw0) {
        if (C20128A8n.A07(aw0) || TextUtils.isEmpty(aw0.A0I) || aw0.A09 == null) {
            return "";
        }
        return aw0.A01().BLc(this.A05, aw0.A09);
    }

    public String A0b(BDG bdg, AnonymousClass206 r9) {
        Context context;
        int i;
        long j;
        String str;
        Context context2;
        int i2;
        AW0 A002 = AnonymousClass25B.A00(r9);
        if (!C20128A8n.A07(A002)) {
            int i3 = A002.A02;
            if (i3 != 12) {
                if (i3 != 102) {
                    if (i3 != 105) {
                        if (i3 != 402) {
                            if (i3 == 406 || i3 == 407) {
                                String str2 = A002.A0J;
                                if (!(str2 == null || bdg == null)) {
                                    int A012 = C20099A7c.A01(str2, -1);
                                    if (bdg.Bgk(A012) || bdg.BfD(A012) || bdg.BfH(A012)) {
                                        context2 = this.A04.A00;
                                        i2 = 2131893914;
                                    } else if (bdg.BfC(A012)) {
                                        int BWp = this.A0A.A06().BWp();
                                        Context context3 = this.A04.A00;
                                        return context3.getString(2131894092, new Object[]{context3.getString(BWp)});
                                    } else if (bdg.Bf9(A012)) {
                                        context2 = this.A04.A00;
                                        i2 = 2131894093;
                                    } else if (bdg.BfU(A012)) {
                                        int BWp2 = this.A0A.A06().BWp();
                                        Context context4 = this.A04.A00;
                                        return context4.getString(2131894096, new Object[]{context4.getString(BWp2)});
                                    }
                                    return bdg.BRN(context2.getString(i2), A012);
                                }
                            } else {
                                if (i3 != 420) {
                                    if (i3 != 421) {
                                        switch (i3) {
                                            case AnonymousClass74N.A03 /*108*/:
                                                break;
                                            case 109:
                                                context = this.A04.A00;
                                                i = 2131899510;
                                                break;
                                            case 110:
                                                context = this.A04.A00;
                                                i = 2131899508;
                                                break;
                                            case 111:
                                                context = this.A04.A00;
                                                i = 2131899509;
                                                break;
                                            case 112:
                                                break;
                                        }
                                    }
                                    context = this.A04.A00;
                                    i = 2131893917;
                                } else {
                                    context = this.A04.A00;
                                    i = 2131897049;
                                }
                                return context.getString(i);
                            }
                        }
                    }
                    String str3 = A002.A0J;
                    if (!(str3 == null || bdg == null || !bdg.Bg3(C20099A7c.A01(str3, -1)))) {
                        context = this.A04.A00;
                        i = 2131897041;
                        return context.getString(i);
                    }
                }
                Long A0P = A0P(A002);
                if (A0P == null) {
                    return "";
                }
                j = A0P.longValue();
                str = A0Q(j);
            } else {
                int i4 = A002.A03;
                if (i4 == 10 || i4 == 20) {
                    Long A0P2 = A0P(A002);
                    if (A0P2 == null) {
                        return "";
                    }
                    j = A0P2.longValue();
                    Pair A0K = A0K(j);
                    if (A0K == null) {
                        str = null;
                    } else {
                        str = (String) A0K.second;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return this.A04.A00.getResources().getQuantityString(2131755320, 1, new Object[]{str});
            }
            int i5 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            context = this.A04.A00;
            i = 2131893916;
            if (i5 > 0) {
                i = 2131893915;
            }
            return context.getString(i);
        }
        return null;
    }

    public String A0c(C20279AEn aEn) {
        String str;
        String str2;
        if (aEn.A04() != null) {
            str = aEn.A04();
        } else {
            str = "";
        }
        AnonymousClass1QO r2 = this.A09;
        String str3 = aEn.A0I;
        List list = aEn.A0Q;
        if (r2.A0N(str3, list) && list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C20251ADj aDj = (C20251ADj) it.next();
                if (aDj != null) {
                    str2 = aDj.A01;
                } else {
                    str2 = null;
                }
                if ("payment_gateway".equals(str2)) {
                    C20936Abq abq = (C20936Abq) aDj.A00;
                    if (abq != null) {
                        String str4 = abq.A00;
                        if (!TextUtils.isEmpty(str4)) {
                            return str4;
                        }
                    }
                }
            }
        }
        return str;
    }

    public String A0e(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            if (split.length == 2) {
                AnonymousClass1KJ A012 = this.A0E.A01(split[0]);
                try {
                    return A012.BLc(this.A05, new AnonymousClass1KN(new BigDecimal(split[1]).movePointLeft(3), ((AnonymousClass1KK) A012).A01));
                } catch (NumberFormatException unused) {
                    return "";
                }
            }
        }
        return "";
    }
}
