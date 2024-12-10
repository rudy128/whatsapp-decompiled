package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1UQ  reason: invalid class name */
public class AnonymousClass1UQ implements AnonymousClass1UP {
    public final /* synthetic */ AnonymousClass1UO A00;

    public void BcQ(AnonymousClass2R1 r6, String str, int i, long j) {
        AnonymousClass1UO r3 = this.A00;
        r3.A01 = Long.valueOf((long) i);
        StringBuilder sb = new StringBuilder();
        sb.append("contactsyncmanager/handleSyncContactError/error sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(0);
        sb.append(" code=");
        sb.append(i);
        sb.append(" backoff=");
        sb.append(j);
        Log.e(sb.toString());
        if (j > 0) {
            long A01 = AnonymousClass11P.A01(r3.A0F) + j;
            C26861Tt r4 = r3.A09;
            r4.A02(A01);
            if (i == 503) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("contactsyncmanager/handleSyncContactError need global backoff=");
                sb2.append(j);
                Log.e(sb2.toString());
                r4.A03(A01);
            } else if (r6.A00() && i == 429) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("contactsyncmanager/handleSyncContactError/deltaSync need backoff=");
                sb3.append(j);
                Log.e(sb3.toString());
                C26861Tt.A00(r4).edit().putLong("delta_sync_backoff", A01).apply();
            }
        }
    }

    public void BcR(C53372cQ r22, String str) {
        ObjectOutputStream objectOutputStream;
        AnonymousClass1UO r5 = this.A00;
        C53372cQ r14 = r22;
        r5.A00 = r14;
        C59902n4 r4 = r14.A00;
        A00 a00 = r4.A02;
        A00 a002 = r4.A09;
        A00 a003 = r4.A0A;
        A00 a004 = r4.A07;
        A00 a005 = r4.A01;
        A00 a006 = r4.A03;
        A00 a007 = r4.A06;
        A00 a008 = r4.A04;
        A00 a009 = r4.A05;
        A00 a0010 = r4.A00;
        A00 a0011 = r4.A0B;
        StringBuilder sb = new StringBuilder();
        sb.append("sync/result sid=");
        String str2 = str;
        sb.append(str2);
        sb.append(" index=");
        sb.append(0);
        sb.append(" users_count=");
        C188829i3[] r0 = r14.A01;
        C188829i3[] r16 = r0;
        int length = r0.length;
        int i = length;
        sb.append(length);
        sb.append(" version=");
        sb.append(r4.A0D);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        if (a00 != null) {
            sb2.append(" contact=");
            sb2.append(a00);
            Long l = a00.A03;
            if (l != null) {
                C26861Tt r142 = r5.A09;
                C26861Tt.A00(r142).edit().putLong("contact_full_sync_wait", l.longValue()).apply();
            }
            Long l2 = a00.A02;
            if (l2 != null) {
                r5.A09.A02(AnonymousClass11P.A01(r5.A0F) + l2.longValue());
            }
            r5.A0a.add(str2);
        }
        if (a002 != null) {
            sb2.append(" sidelist=");
            sb2.append(a002);
            Long l3 = a002.A03;
            if (l3 != null) {
                C26861Tt r13 = r5.A09;
                C26861Tt.A00(r13).edit().putLong("sidelist_full_sync_wait", l3.longValue()).apply();
            }
            Long l4 = a002.A02;
            if (l4 != null) {
                r5.A09.A04(AnonymousClass11P.A01(r5.A0F) + l4.longValue());
            }
        }
        if (a003 != null) {
            sb2.append(" status=");
            sb2.append(a003);
            Long l5 = a003.A03;
            if (l5 != null) {
                C26861Tt r11 = r5.A09;
                C26861Tt.A00(r11).edit().putLong("status_full_sync_wait", l5.longValue()).apply();
            }
            Long l6 = a003.A02;
            if (l6 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("status_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l6.longValue()).apply();
            }
        }
        if (a0011 != null) {
            sb2.append(" textStatus=");
            sb2.append(a0011);
            Long l7 = a0011.A02;
            if (l7 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("text_status_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l7.longValue()).apply();
            }
        }
        if (a004 != null) {
            sb2.append(" picture=");
            sb2.append(a004);
            Long l8 = a004.A02;
            if (l8 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("picture_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l8.longValue()).apply();
            }
        }
        if (a005 != null) {
            sb2.append(" business=");
            sb2.append(a005);
            Long l9 = a005.A02;
            if (l9 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("business_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l9.longValue()).apply();
            }
        }
        if (a006 != null) {
            sb2.append(" devices=");
            sb2.append(a006);
            Long l10 = a006.A02;
            if (l10 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("devices_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l10.longValue()).apply();
            }
        }
        if (a007 != null) {
            sb2.append(" payment=");
            sb2.append(a007);
            Long l11 = a007.A02;
            if (l11 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("payment_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l11.longValue()).apply();
            }
        }
        if (a008 != null) {
            sb2.append(" disappearing_mode=");
            A00 a0012 = a008;
            sb2.append(a0012);
            Long l12 = a0012.A02;
            if (l12 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("disappearing_mode_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l12.longValue()).apply();
            }
        }
        if (a009 != null) {
            sb2.append(" lid=");
            A00 a0013 = a009;
            sb2.append(a0013);
            Long l13 = a0013.A02;
            if (l13 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("lid_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l13.longValue()).apply();
            }
        }
        if (a0010 != null) {
            sb2.append(" bot=");
            sb2.append(a0010);
            Long l14 = a0010.A02;
            if (l14 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("bot_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l14.longValue()).apply();
            }
        }
        A00 a0014 = r4.A0C;
        if (a0014 != null) {
            sb2.append(" username=");
            sb2.append(a0014);
            Long l15 = a0014.A02;
            if (l15 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("username_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l15.longValue()).apply();
            }
        }
        A00 a0015 = r4.A08;
        if (a0015 != null) {
            sb2.append(" reachability=");
            sb2.append(a0015);
            Long l16 = a0015.A02;
            if (l16 != null) {
                C26861Tt.A00(r5.A09).edit().putLong("reachability_sync_backoff", AnonymousClass11P.A01(r5.A0F) + l16.longValue()).apply();
            }
        }
        Log.i(sb2.toString());
        C26851Ts r42 = r5.A0B;
        HashSet A002 = r42.A00();
        for (int i2 = 0; i2 < i; i2++) {
            C188829i3 r7 = r16[i2];
            if (r7.A04 == 3) {
                List list = r7.A0K;
                C17960vV.A07(list);
                A002.addAll(list);
            } else {
                if ((r7.A04 == 1 || r7.A04 == 2) && r7.A0K != null) {
                    for (Object put : r7.A0K) {
                        r5.A0f.put(put, r7);
                    }
                }
                UserJid userJid = r7.A0D;
                if (userJid != null) {
                    r5.A0d.put(userJid, r7);
                } else {
                    Log.w("sync/result/no-jid-found");
                }
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(r42.A01.A00.getFilesDir(), "invalid_numbers"));
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                r42.A00 = A002;
                objectOutputStream.writeObject(A002);
                objectOutputStream.close();
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void BcS(int i, String str, long j) {
        AnonymousClass1UO r3 = this.A00;
        r3.A01 = 1L;
        StringBuilder sb = new StringBuilder();
        sb.append("contactsyncmanager/handleSyncSidelistError/error sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(0);
        sb.append(" code=");
        sb.append(i);
        sb.append(" backoff=");
        sb.append(j);
        Log.e(sb.toString());
        if (j > 0) {
            r3.A09.A04(AnonymousClass11P.A01(r3.A0F) + j);
        }
    }

    public AnonymousClass1UQ(AnonymousClass1UO r1) {
        this.A00 = r1;
    }
}
