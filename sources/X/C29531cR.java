package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.whatsapp.perf.profilo.ProfiloUploadService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1cR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C29531cR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1Bd A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;

    public final void run() {
        int i;
        String str;
        int A002;
        int A003;
        Long l;
        Long l2;
        C26238Cvb cvb;
        C26238Cvb cvb2;
        AnonymousClass1Bd r0 = this.A01;
        String str2 = this.A03;
        int i2 = this.A00;
        Runnable runnable = this.A02;
        if (r0.A01 == 1) {
            Boolean bool = C17960vV.A01;
        }
        if (r0.A00 != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C17910vQ r7 = r0.A0G;
            long j = elapsedRealtime - r7.A01;
            long uptimeMillis = SystemClock.uptimeMillis() - r7.A02;
            if (r0.A0A) {
                if (r0.A07 != null) {
                    HashMap hashMap = new HashMap(4);
                    hashMap.put("from", r0.A08);
                    hashMap.put("to", str2);
                    C53702cx r72 = r0.A06;
                    Long l3 = r0.A07;
                    int i3 = r0.A00;
                    if (!(C25443Cfs.A00 != 2 || (cvb2 = C26238Cvb.A0A) == null || cvb2.A04.get() == 0)) {
                        long longValue = l3.longValue() | 2;
                        if (!hashMap.isEmpty()) {
                            Iterator A15 = AnonymousClass000.A15(hashMap);
                            int i4 = 0;
                            while (A15.hasNext()) {
                                Map.Entry A16 = AnonymousClass000.A16(A15);
                                if (A16.getKey() != null && !C17880vN.A0x(A16).isEmpty() && A16.getValue() != null && !((String) A16.getValue()).isEmpty()) {
                                    i4 += C17880vN.A0x(A16).length() + C17880vN.A0x(A16).length();
                                    if (((long) i4) > 2048) {
                                        Locale locale = Locale.US;
                                        Object[] objArr = new Object[2];
                                        objArr[0] = 2048L;
                                        C17880vN.A1T(objArr, i4, 1);
                                        throw AnonymousClass000.A0k(String.format(locale, "Maximum Length(%d) of Profilo annotations exceeded %d", objArr));
                                    } else if ((C22912BUx.A00 & TraceEvents.sProviders) != 0) {
                                        String A0x = C17880vN.A0x(A16);
                                        MultiBufferLogger multiBufferLogger = r72.A00;
                                        int writeStandardEntry = multiBufferLogger.writeStandardEntry(7, 59, 0, 0, i3, 0, longValue);
                                        if (A0x != null) {
                                            writeStandardEntry = multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, A0x);
                                        }
                                        multiBufferLogger.writeBytesEntry(1, 57, writeStandardEntry, (String) A16.getValue());
                                    }
                                }
                            }
                        }
                        r72.A00.writeStandardEntry(7, 47, 0, 0, i3, 0, longValue);
                    }
                    r0.A05.A01();
                }
                int i5 = r0.A00;
                if (C25443Cfs.A00 == 2 && (cvb = C26238Cvb.A0A) != null) {
                    C26238Cvb.A03(cvb, C25546Chj.A02, 1, 0, (long) i5);
                }
                Context context = r0.A0C.A00;
                Class<ProfiloUploadService> cls = ProfiloUploadService.class;
                C161078Bi.A00(context, new Intent(context, cls), cls, 8);
            }
            if (r0.A02.A00 != null) {
                AnonymousClass1CR A012 = ((AnonymousClass1CP) r0.A0M.get()).A01("app-startup");
                if (r0.A02.A00 != null) {
                    AnonymousClass1Bg r8 = new AnonymousClass1Bg();
                    r8.A01 = Integer.valueOf(r0.A01);
                    r8.A03 = Long.valueOf(j);
                    r8.A02 = Long.valueOf(uptimeMillis);
                    r8.A00 = Integer.valueOf(i2);
                    r8.A05 = (Long) A012.A02.get("msgstore.db");
                    r8.A06 = (Long) A012.A03.get("msgstore.db");
                    r8.A04 = (Long) A012.A00.get("msgstore.db");
                    if (A012.A04) {
                        Map map = A012.A01;
                        C18030ve r9 = r0.A0E;
                        C18040vf r6 = C18040vf.A02;
                        int A004 = C18020vd.A00(r6, r9, 4216);
                        if (A004 >= 0 && (l2 = r8.A06) != null && l2.longValue() > ((long) A004)) {
                            StringBuilder sb = new StringBuilder();
                            for (Map.Entry entry : map.entrySet()) {
                                if (((String) entry.getKey()).startsWith("w-") || ((String) entry.getKey()).startsWith("m-")) {
                                    sb.append((String) entry.getKey());
                                    sb.append(":");
                                    sb.append(entry.getValue());
                                    sb.append(";");
                                }
                            }
                            r0.A0B.A0G("startup-db-writes", sb.toString(), false);
                        }
                        if (C18020vd.A05(r6, r9, 11159) && (A003 = C18020vd.A00(r6, r9, 11152)) >= 0 && (l = r8.A05) != null && l.longValue() > ((long) A003)) {
                            List<Map.Entry> sortedCopy = DUS.natural().onResultOf(new C65482wZ(6)).reverse().sortedCopy(map.entrySet());
                            StringBuilder sb2 = new StringBuilder();
                            for (Map.Entry entry2 : sortedCopy) {
                                String str3 = (String) entry2.getKey();
                                if (str3.startsWith("r-")) {
                                    sb2.append(str3.substring(2));
                                    sb2.append(":");
                                    sb2.append(entry2.getValue());
                                    sb2.append("\n");
                                }
                            }
                            r0.A0B.A0G("startup-db-reads", sb2.toString(), false);
                        }
                    }
                    r0.A0F.CC8(r8, r0.A02);
                }
            }
            if (r0.A01 == 1 && (A002 = C18020vd.A00(C18040vf.A02, r0.A0E, 1626)) > 0) {
                long j2 = (long) A002;
                if (j >= j2) {
                    AnonymousClass2FR r4 = new AnonymousClass2FR();
                    r4.A02 = "app_launch";
                    r4.A00 = Long.valueOf(j);
                    r4.A01 = Long.valueOf(j2);
                    r0.A0F.CC4(r4);
                }
            }
            C46762Fu r92 = new C46762Fu();
            int i6 = r0.A01;
            int i7 = 1;
            if (i6 != 2) {
                i = 3;
                if (i6 != 3) {
                    i = 1;
                }
            } else {
                i = 2;
            }
            if (i2 == 2) {
                i7 = 2;
            } else if (i2 == 3) {
                i7 = 3;
            }
            r92.A01 = Integer.valueOf(i);
            r92.A03 = Long.valueOf(j);
            r92.A02 = Long.valueOf(uptimeMillis);
            r92.A00 = Integer.valueOf(i7);
            r0.A0F.CC6(r92, r0.A03);
            r0.A0L.CGF(new C21448AkF(r0, 14));
            C222119a r62 = r0.A04;
            if (r62 != null) {
                if (i2 == 1) {
                    str = "chat_list";
                } else if (i2 == 2) {
                    str = "chat";
                } else if (i2 != 4) {
                    str = "";
                } else {
                    str = "call";
                }
                r62.A0A("destination", str, true);
                r0.A04.A07("render");
            }
            r0.A00 = -1;
            r0.A08 = null;
            r0.A0A = false;
            r0.A07 = null;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ C29531cR(AnonymousClass1Bd r1, Runnable runnable, String str, int i) {
        this.A01 = r1;
        this.A03 = str;
        this.A00 = i;
        this.A02 = runnable;
    }
}
