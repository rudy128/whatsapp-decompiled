package X;

import android.net.TrafficStats;
import android.util.Pair;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: X.7IO  reason: invalid class name */
public class AnonymousClass7IO implements C1607189q {
    public final AnonymousClass181 A00;
    public final AnonymousClass7IU A01;
    public final C138206wh A02;
    public final AnonymousClass1D9 A03;
    public final C220418j A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: Removed duplicated region for block: B:93:0x014e A[ADDED_TO_REGION, Catch:{ all -> 0x0160, all -> 0x016d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BcK(java.io.InputStream r15, java.lang.Integer r16, long r17) {
        /*
            r14 = this;
            r3 = 0
            android.util.JsonReader r13 = X.C108985cd.A0E(r15)     // Catch:{ IOException -> 0x0177 }
            r13.beginObject()     // Catch:{ all -> 0x016d }
        L_0x0008:
            r12 = 1
        L_0x0009:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0166
            java.lang.String r2 = r13.nextName()     // Catch:{ all -> 0x016d }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x016d }
            r0 = -265173948(0xfffffffff031c444, float:-2.2006447E29)
            if (r1 == r0) goto L_0x00dc
            r0 = 1518327835(0x5a7fd81b, float:1.80034324E16)
            if (r1 != r0) goto L_0x0155
            java.lang.String r0 = "languages"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0155
            X.7IU r4 = r14.A01     // Catch:{ all -> 0x016d }
            monitor-enter(r4)     // Catch:{ all -> 0x016d }
            X.2Dg r0 = r4.A02     // Catch:{ IOException | IllegalStateException -> 0x00d0 }
            X.1au r11 = r0.A06()     // Catch:{ IOException | IllegalStateException -> 0x00d0 }
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x00c6 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00bc }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x00bc }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00bc }
            X.C17880vN.A1S(r2, r0, r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "EmojiDictionaryStore/clearAll/DELETE_EMOJI_SEARCH_TAG"
            java.lang.String r8 = "emoji_search_tag"
            java.lang.String r0 = "type=?"
            r9.A04(r8, r0, r1, r2)     // Catch:{ all -> 0x00bc }
            r13.beginObject()     // Catch:{ all -> 0x00bc }
        L_0x004d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00ae
            r13.nextName()     // Catch:{ all -> 0x00bc }
            r13.beginObject()     // Catch:{ all -> 0x00bc }
        L_0x0059:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r7 = r13.nextName()     // Catch:{ all -> 0x00bc }
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ all -> 0x00bc }
            r13.beginArray()     // Catch:{ all -> 0x00bc }
        L_0x006a:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = r13.nextString()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = X.AnonymousClass1EG.A06(r0)     // Catch:{ all -> 0x00bc }
            r1.add(r0)     // Catch:{ all -> 0x00bc }
            goto L_0x006a
        L_0x007c:
            r13.endArray()     // Catch:{ all -> 0x00bc }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x00bc }
        L_0x0083:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0059
            java.lang.String r5 = X.C17880vN.A0v(r6)     // Catch:{ all -> 0x00bc }
            android.content.ContentValues r2 = X.C17880vN.A08()     // Catch:{ all -> 0x00bc }
            java.lang.Integer r1 = X.C17880vN.A0h()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "type"
            r2.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "symbol"
            r2.put(r0, r7)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "tag"
            r2.put(r0, r5)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "insertEmojiTags/REPLACE_EMOJI_SEARCH_TAG"
            r9.A07(r8, r0, r2)     // Catch:{ all -> 0x00bc }
            goto L_0x0083
        L_0x00aa:
            r13.endObject()     // Catch:{ all -> 0x00bc }
            goto L_0x004d
        L_0x00ae:
            r13.endObject()     // Catch:{ all -> 0x00bc }
            r10.A00()     // Catch:{ all -> 0x00bc }
            r10.close()     // Catch:{ all -> 0x00c6 }
            r11.close()     // Catch:{ IOException | IllegalStateException -> 0x00d0 }
            monitor-exit(r4)     // Catch:{ all -> 0x016d }
            goto L_0x0133
        L_0x00bc:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c6 }
        L_0x00c5:
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | IllegalStateException -> 0x00d0 }
        L_0x00cf:
            throw r1     // Catch:{ IOException | IllegalStateException -> 0x00d0 }
        L_0x00d0:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "emojidictionarystore/populatedb/failed "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x0160 }
            monitor-exit(r4)     // Catch:{ all -> 0x016d }
            goto L_0x014b
        L_0x00dc:
            java.lang.String r0 = "fb-top-50"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0155
            X.6wh r5 = r14.A02     // Catch:{ all -> 0x016d }
            monitor-enter(r5)     // Catch:{ all -> 0x016d }
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            r13.beginArray()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
        L_0x00ee:
            boolean r0 = r13.hasNext()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = r13.nextString()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            r1.add(r0)     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            goto L_0x00ee
        L_0x00fc:
            r13.endArray()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            r2.<init>()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
        L_0x010c:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            r2.put(r0)     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            X.737 r0 = X.C137176v2.A00(r0)     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            r4.add(r0)     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            goto L_0x010c
        L_0x0121:
            X.0z4 r0 = r5.A02     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            java.lang.String r0 = "top_emojis"
            X.C17880vN.A1E(r1, r0, r2)     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            r5.A00 = r4     // Catch:{ IOException -> 0x0144, IllegalStateException -> 0x0135 }
            monitor-exit(r5)     // Catch:{ all -> 0x016d }
        L_0x0133:
            r0 = 1
            goto L_0x014c
        L_0x0135:
            r4 = move-exception
            X.190 r2 = r5.A01     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = "topemojis/populate error"
            r0 = 0
            r2.A0G(r1, r0, r3)     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "topemojisstore/populate-top-emojis/failed"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x0163 }
            goto L_0x014a
        L_0x0144:
            r1 = move-exception
            java.lang.String r0 = "topemojisstore/populate-top-emojis/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0163 }
        L_0x014a:
            monitor-exit(r5)     // Catch:{ all -> 0x016d }
        L_0x014b:
            r0 = 0
        L_0x014c:
            if (r12 == 0) goto L_0x0152
            if (r0 == 0) goto L_0x0152
            goto L_0x0008
        L_0x0152:
            r12 = 0
            goto L_0x0009
        L_0x0155:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "emojidictionarynetworkclient/handle-network-response/unhandled field: "
            X.C17900vP.A0e(r0, r2, r1)     // Catch:{ all -> 0x016d }
            goto L_0x0009
        L_0x0160:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x016d }
            goto L_0x0165
        L_0x0163:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016d }
        L_0x0165:
            throw r0     // Catch:{ all -> 0x016d }
        L_0x0166:
            r13.endObject()     // Catch:{ all -> 0x016d }
            r13.close()     // Catch:{ IOException -> 0x0177 }
            return r12
        L_0x016d:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0172 }
            goto L_0x0176
        L_0x0172:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0177 }
        L_0x0176:
            throw r1     // Catch:{ IOException -> 0x0177 }
        L_0x0177:
            r1 = move-exception
            java.lang.String r0 = "emojidictionarynetworkclient/handle-network-response/failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IO.BcK(java.io.InputStream, java.lang.Integer, long):boolean");
    }

    public InputStream BT5(AnonymousClass8BJ r4) {
        C179229Hb BMP = r4.BMP(this.A00, AnonymousClass3MY.A0f(), C108955ca.A0h());
        if ("gzip".equals(((AUZ) r4).A01.getHeaderField("Content-Encoding"))) {
            return new GZIPInputStream(BMP);
        }
        return BMP;
    }

    public AnonymousClass7IO(AnonymousClass181 r1, AnonymousClass7IU r2, C138206wh r3, AnonymousClass1D9 r4, C220418j r5, AnonymousClass00H r6) {
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
    }

    public AUZ BFc(String str, String str2) {
        C17900vP.A0f("emojidictionarynetworkclient/connect/language=", str2, AnonymousClass000.A10());
        this.A05.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("https://static.whatsapp.net/emoji?lgs=");
        A10.append(str2);
        String A0y = AnonymousClass000.A0y("&top=1", A10);
        try {
            TrafficStats.setThreadStatsTag(8);
            return this.A03.A05((Pair) null, this.A04, A0y, str);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
