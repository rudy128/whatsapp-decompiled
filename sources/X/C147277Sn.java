package X;

import com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType;
import org.json.JSONObject;

/* renamed from: X.7Sn  reason: invalid class name and case insensitive filesystem */
public class C147277Sn implements AnonymousClass1G2 {
    public final int A00;
    public final Object A01;

    public C147277Sn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static final AnonymousClass6RQ A00(GraphQLXFBGenAIPersonaSectionDisplayType graphQLXFBGenAIPersonaSectionDisplayType) {
        if (graphQLXFBGenAIPersonaSectionDisplayType != null) {
            int ordinal = graphQLXFBGenAIPersonaSectionDisplayType.ordinal();
            if (ordinal == 3) {
                return AnonymousClass6RQ.CAROUSEL_CHAT_HISTORY;
            }
            if (ordinal == 5) {
                return AnonymousClass6RQ.CAROUSEL_LARGE;
            }
            if (ordinal == 6) {
                return AnonymousClass6RQ.CAROUSEL_SMALL;
            }
            if (ordinal != 1 && ordinal == 7) {
                return AnonymousClass6RQ.LIST;
            }
        }
        return AnonymousClass6RQ.HIDDEN;
    }

    public static final C134816rC A01(JSONObject jSONObject) {
        C134806rB r1;
        JSONObject optJSONObject = jSONObject.optJSONObject("caption");
        String str = null;
        if (optJSONObject != null) {
            r1 = new C134806rB(C18070vi.A0J("text", optJSONObject), C18070vi.A0J("language", optJSONObject));
        } else {
            r1 = null;
        }
        String A02 = A6n.A02("otid", jSONObject);
        if (A02 != null) {
            str = A02;
        }
        return new C134816rC(r1, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C30391dr r6, X.C23421Fz r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C147417Tb
            if (r0 == 0) goto L_0x0033
            r4 = r6
            X.7Tb r4 = (X.C147417Tb) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0033
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 != r1) goto L_0x0039
            X.C30691eM.A01(r3)
        L_0x0020:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0023:
            X.C30691eM.A01(r3)
            java.lang.Object r0 = r5.A01
            X.1G2 r0 = (X.AnonymousClass1G2) r0
            r4.label = r1
            java.lang.Object r0 = X.C88604aC.A02(r4, r7, r0)
            if (r0 != r2) goto L_0x0020
            return r2
        L_0x0033:
            X.7Tb r4 = new X.7Tb
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0039:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147277Sn.A02(X.1dr, X.1Fz):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v253, resolved type: X.3RO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v259, resolved type: X.5gg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v367, resolved type: X.3RO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v368, resolved type: X.3RO} */
    /* JADX WARNING: type inference failed for: r11v1, types: [X.A8k, com.whatsapp.infra.graphql.generated.aihome.AiHomeBot] */
    /* JADX WARNING: type inference failed for: r6v19, types: [X.A8k, com.whatsapp.infra.graphql.generated.aihome.AiHomeBot] */
    /* JADX WARNING: type inference failed for: r7v34, types: [java.util.AbstractCollection, java.util.List, java.util.LinkedList] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1040:0x1329, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1041:0x132d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1051:0x134a, code lost:
        if (r2 == X.C122636Rd.A0B) goto L_0x134c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1236:0x17c3, code lost:
        if (r4 != X.C31751g4.COROUTINE_SUSPENDED) goto L_0x1999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1237:0x17c5, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1324:0x195c, code lost:
        X.C30691eM.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1330:0x198b, code lost:
        if (r0 != r4) goto L_0x1999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1331:0x198d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x052f, code lost:
        if (r5 != false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x07a5, code lost:
        r2 = ((X.C139286ya) ((X.C138466x8) r1.A0N.get()).A03.get()).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x07b7, code lost:
        if (r2 != null) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x07b9, code lost:
        r2.A07 = X.C108975cc.A0X();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x07bf, code lost:
        com.whatsapp.util.Log.e("MetaAiRtcVoiceManager/onDataChannelMessage invalid JSON message, skipping");
        ((X.AnonymousClass190) r1.A0J.get()).A0G("MetaAiRtcVoiceManager/onDataChannelMessage", (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0c3c, code lost:
        X.C18070vi.A18(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:0x0ea7, code lost:
        r1.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:900:0x1094, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:901:0x1098, code lost:
        r0 = "talkbackForSearchLazy";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1209:0x172f  */
    /* JADX WARNING: Removed duplicated region for block: B:1214:0x173e  */
    /* JADX WARNING: Removed duplicated region for block: B:1320:0x194f  */
    /* JADX WARNING: Removed duplicated region for block: B:1325:0x1960  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02e1 A[Catch:{ JSONException -> 0x079d }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0329 A[Catch:{ JSONException -> 0x079d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x0b29  */
    /* JADX WARNING: Removed duplicated region for block: B:630:0x0b35  */
    /* JADX WARNING: Removed duplicated region for block: B:633:0x0b4e  */
    /* JADX WARNING: Removed duplicated region for block: B:659:0x0b98  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:662:0x0ba3  */
    /* JADX WARNING: Removed duplicated region for block: B:665:0x0bac  */
    /* JADX WARNING: Removed duplicated region for block: B:685:0x0bf4  */
    /* JADX WARNING: Removed duplicated region for block: B:688:0x0c06  */
    /* JADX WARNING: Removed duplicated region for block: B:693:0x0c25  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:782:0x0e52  */
    /* JADX WARNING: Removed duplicated region for block: B:786:0x0e5f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BJt(java.lang.Object r34, X.C30391dr r35) {
        /*
            r33 = this;
            r0 = r34
            r1 = r33
            int r2 = r1.A00
            r6 = r35
            switch(r2) {
                case 0: goto L_0x1934;
                case 1: goto L_0x198e;
                case 2: goto L_0x17e1;
                case 3: goto L_0x1766;
                case 4: goto L_0x1713;
                case 5: goto L_0x14c9;
                case 6: goto L_0x14ab;
                case 7: goto L_0x1378;
                case 8: goto L_0x1362;
                case 9: goto L_0x1333;
                case 10: goto L_0x1313;
                case 11: goto L_0x12ef;
                case 12: goto L_0x12dd;
                case 13: goto L_0x12d4;
                case 14: goto L_0x1109;
                case 15: goto L_0x10cd;
                case 16: goto L_0x10a0;
                case 17: goto L_0x0e74;
                case 18: goto L_0x0e37;
                case 19: goto L_0x0c41;
                case 20: goto L_0x0ae5;
                case 21: goto L_0x0ad0;
                case 22: goto L_0x0aab;
                case 23: goto L_0x0a66;
                case 24: goto L_0x0920;
                case 25: goto L_0x08b1;
                case 26: goto L_0x0815;
                case 27: goto L_0x07d6;
                case 28: goto L_0x1771;
                case 29: goto L_0x0170;
                case 30: goto L_0x0130;
                case 31: goto L_0x00eb;
                case 32: goto L_0x0012;
                case 33: goto L_0x00b7;
                case 34: goto L_0x0079;
                case 35: goto L_0x003b;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.1Fz r0 = (X.C23421Fz) r0
            java.lang.Object r4 = r1.A02(r6, r0)
            return r4
        L_0x0012:
            X.6Rs r0 = (X.C122736Rs) r0
            java.lang.Object r1 = r1.A01
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r1 = (com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment) r1
            X.5io r4 = r1.A03
            if (r4 != 0) goto L_0x0020
            java.lang.String r0 = "viewModel"
            goto L_0x1329
        L_0x0020:
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            r4.A00 = r0
            X.206 r3 = X.C111195io.A00(r4)
            if (r3 == 0) goto L_0x1999
            X.2r7 r2 = r4.A05
            X.6m6 r1 = r4.A03
            int r1 = r1.A00(r0, r3)
            r0 = 39
            r2.A00(r3, r0, r1)
            goto L_0x1999
        L_0x003b:
            boolean r2 = r6 instanceof X.C147407Ta
            if (r2 == 0) goto L_0x005d
            r5 = r6
            X.7Ta r5 = (X.C147407Ta) r5
            int r4 = r5.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x005d
            int r4 = r4 - r3
            r5.label = r4
        L_0x004d:
            java.lang.Object r6 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r5.label
            r3 = 1
            if (r2 == 0) goto L_0x0063
            if (r2 == r3) goto L_0x195c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x005d:
            X.7Ta r5 = new X.7Ta
            r5.<init>(r1, r6)
            goto L_0x004d
        L_0x0063:
            X.C30691eM.A01(r6)
            X.0wh r2 = r5.getContext()
            X.C30551e8.A05(r2)
            java.lang.Object r1 = r1.A01
            X.1G2 r1 = (X.AnonymousClass1G2) r1
            r5.label = r3
            java.lang.Object r0 = r1.BJt(r0, r5)
            goto L_0x198b
        L_0x0079:
            X.6mu r0 = (X.C132496mu) r0
            java.lang.Object r3 = r0.A01
            monitor-enter(r3)
            boolean r2 = r0.A00     // Catch:{ all -> 0x00b4 }
            monitor-exit(r3)
            if (r2 != 0) goto L_0x1999
            java.lang.String r2 = r0.A00()
            java.lang.Object r3 = r1.A01
            com.whatsapp.updates.viewmodels.SearchUsecase r3 = (com.whatsapp.updates.viewmodels.SearchUsecase) r3
            X.6mu r1 = r3.A02
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = r1.A00()
        L_0x0093:
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 == 0) goto L_0x1999
            java.lang.String r1 = r0.A00()
            boolean r1 = X.AnonymousClass1YF.A0T(r1)
            if (r1 != 0) goto L_0x1999
            X.1md r2 = r3.A07
            java.lang.String r1 = r0.A00()
            r0 = 0
            com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob r0 = r2.A00(r0, r3, r1, r0)
            r3.A01 = r0
            goto L_0x1999
        L_0x00b2:
            r1 = 0
            goto L_0x0093
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00b7:
            java.lang.Object r4 = r1.A01
            com.whatsapp.updates.ui.UpdatesFragment r4 = (com.whatsapp.updates.ui.UpdatesFragment) r4
            boolean r1 = r0 instanceof X.AnonymousClass6KX
            if (r1 == 0) goto L_0x00d6
            r3 = 2131892810(0x7f121a4a, float:1.9420379E38)
        L_0x00c2:
            X.00H r0 = r4.A27()
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r1 = 49
            X.7RM r0 = new X.7RM
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.A0J(r0)
            goto L_0x1999
        L_0x00d6:
            boolean r1 = r0 instanceof X.AnonymousClass6KW
            if (r1 == 0) goto L_0x00de
            r3 = 2131890491(0x7f12113b, float:1.9415675E38)
            goto L_0x00c2
        L_0x00de:
            boolean r0 = r0 instanceof X.AnonymousClass6KY
            if (r0 == 0) goto L_0x00e6
            r3 = 2131897307(0x7f122bdb, float:1.94295E38)
            goto L_0x00c2
        L_0x00e6:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00eb:
            int r2 = X.AnonymousClass000.A0M(r0)
            r0 = 26
            if (r2 != r0) goto L_0x011a
            java.lang.Object r1 = r1.A01
            com.whatsapp.pancake.PomegranatePancakeFragment r1 = (com.whatsapp.pancake.PomegranatePancakeFragment) r1
            X.0vl r0 = r1.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.pancake.PomegranatePancakeViewModel r0 = (com.whatsapp.pancake.PomegranatePancakeViewModel) r0
            X.1pm r4 = X.AnonymousClass3MZ.A0H(r1)
            X.7Kf r3 = r0.A00
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A04
            r0 = 1
            boolean r0 = r1.compareAndSet(r2, r0)
            if (r0 == 0) goto L_0x1999
            r1 = 0
            com.whatsapp.pancake.CommonPearDelegate$pollParentConsentVerification$1 r0 = new com.whatsapp.pancake.CommonPearDelegate$pollParentConsentVerification$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r4)
            goto L_0x1999
        L_0x011a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.pancake.PomegranatePancakeFragment r0 = (com.whatsapp.pancake.PomegranatePancakeFragment) r0
            X.0vl r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.pancake.PomegranatePancakeViewModel r0 = (com.whatsapp.pancake.PomegranatePancakeViewModel) r0
            X.7Kf r0 = r0.A00
            X.1OD r1 = r0.A08
            r0 = 0
            r1.BEM(r0)
            goto L_0x1999
        L_0x0130:
            boolean r2 = r6 instanceof X.AnonymousClass7U5
            if (r2 == 0) goto L_0x0152
            r5 = r6
            X.7U5 r5 = (X.AnonymousClass7U5) r5
            int r4 = r5.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0152
            int r4 = r4 - r3
            r5.label = r4
        L_0x0142:
            java.lang.Object r6 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r3 = r5.label
            r2 = 1
            if (r3 == 0) goto L_0x0158
            if (r3 == r2) goto L_0x195c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0152:
            X.7U5 r5 = new X.7U5
            r5.<init>(r1, r6)
            goto L_0x0142
        L_0x0158:
            X.C30691eM.A01(r6)
            java.lang.Object r1 = r1.A01
            X.1G2 r1 = (X.AnonymousClass1G2) r1
            java.util.List r0 = (java.util.List) r0
            X.C18070vi.A0b(r0)
            java.lang.Object r0 = X.C29431cG.A0c(r0)
            r5.label = r2
            java.lang.Object r0 = r1.BJt(r0, r5)
            goto L_0x198b
        L_0x0170:
            byte[] r0 = (byte[]) r0
            java.lang.Object r1 = r1.A01
            X.4jJ r1 = (X.C93644jJ) r1
            java.nio.charset.Charset r3 = X.C93644jJ.A0Y
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r3)
            r18 = 0
            org.json.JSONObject r11 = X.C17880vN.A16(r2)     // Catch:{ JSONException -> 0x07a5 }
            java.lang.String r14 = "botContent"
            r5 = 0
            java.lang.String r0 = "state"
            int r4 = r11.getInt(r0)     // Catch:{ JSONException -> 0x079d }
            X.0z2 r0 = X.AnonymousClass6RO.A00     // Catch:{ JSONException -> 0x079d }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ JSONException -> 0x079d }
        L_0x0192:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x079d }
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r0 = r3.next()     // Catch:{ JSONException -> 0x079d }
            r2 = r0
            X.6RO r2 = (X.AnonymousClass6RO) r2     // Catch:{ JSONException -> 0x079d }
            int r2 = r2.value     // Catch:{ JSONException -> 0x079d }
            if (r2 != r4) goto L_0x0192
        L_0x01a3:
            X.6RO r0 = (X.AnonymousClass6RO) r0     // Catch:{ JSONException -> 0x079d }
            goto L_0x01a8
        L_0x01a6:
            r0 = 0
            goto L_0x01a3
        L_0x01a8:
            if (r0 == 0) goto L_0x1999
            java.lang.String r2 = "userContent"
            org.json.JSONObject r2 = r11.optJSONObject(r2)     // Catch:{ JSONException -> 0x079d }
            if (r2 == 0) goto L_0x0265
            X.6rC r4 = A01(r2)     // Catch:{ JSONException -> 0x079d }
        L_0x01b6:
            org.json.JSONObject r3 = r11.optJSONObject(r14)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x025f
            X.6rC r9 = A01(r3)     // Catch:{ JSONException -> 0x079d }
            java.lang.String r2 = "otid"
            java.lang.String r21 = X.A6n.A02(r2, r3)     // Catch:{ JSONException -> 0x079d }
        L_0x01c6:
            org.json.JSONObject r3 = r11.optJSONObject(r14)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x031d
            java.lang.String r2 = "llmResp"
            org.json.JSONObject r10 = r3.optJSONObject(r2)     // Catch:{ JSONException -> 0x079d }
            if (r10 == 0) goto L_0x031d
            java.lang.String r8 = "genaiViewModels"
            org.json.JSONObject r3 = r10.optJSONObject(r8)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x025d
            java.lang.String r2 = "imagine_view_model"
            org.json.JSONObject r3 = r3.optJSONObject(r2)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x025d
            java.lang.String r2 = "imagine_raw_data"
            org.json.JSONArray r2 = r3.optJSONArray(r2)     // Catch:{ JSONException -> 0x079d }
            if (r2 == 0) goto L_0x025d
            org.json.JSONObject r6 = r2.getJSONObject(r5)     // Catch:{ JSONException -> 0x079d }
            if (r6 == 0) goto L_0x025d
            java.lang.String r2 = "media_type"
            r6.getString(r2)     // Catch:{ JSONException -> 0x079d }
            java.lang.String r2 = "uri"
            java.lang.String r3 = r6.getString(r2)     // Catch:{ JSONException -> 0x079d }
            java.lang.String r2 = "temporary_handle"
            r6.getString(r2)     // Catch:{ JSONException -> 0x079d }
            java.lang.String r2 = "request_id"
            r6.getString(r2)     // Catch:{ JSONException -> 0x079d }
            java.lang.String r2 = "response_id"
            r6.getString(r2)     // Catch:{ JSONException -> 0x079d }
        L_0x020c:
            X.6qV r7 = new X.6qV     // Catch:{ JSONException -> 0x079d }
            r7.<init>(r3)     // Catch:{ JSONException -> 0x079d }
            org.json.JSONObject r3 = r10.optJSONObject(r8)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x02b9
            java.lang.String r2 = "search_view_model"
            org.json.JSONObject r12 = r3.optJSONObject(r2)     // Catch:{ JSONException -> 0x079d }
            if (r12 == 0) goto L_0x02b9
            java.lang.String r2 = "search_engine"
            java.lang.String r23 = X.A6n.A02(r2, r12)     // Catch:{ JSONException -> 0x079d }
            if (r23 == 0) goto L_0x02b9
            java.lang.String r2 = "search_query"
            java.lang.String r25 = X.A6n.A02(r2, r12)     // Catch:{ JSONException -> 0x079d }
            if (r25 == 0) goto L_0x02b9
            java.lang.String r2 = "attribution_link"
            java.lang.String r24 = X.A6n.A02(r2, r12)     // Catch:{ JSONException -> 0x079d }
            if (r24 == 0) goto L_0x02b9
            java.lang.String r2 = "search_result_uri"
            org.json.JSONArray r15 = r12.optJSONArray(r2)     // Catch:{ JSONException -> 0x079d }
            if (r15 == 0) goto L_0x02b9
            int r16 = r15.length()     // Catch:{ JSONException -> 0x079d }
            java.util.ArrayList r20 = X.C17880vN.A0z(r16)     // Catch:{ JSONException -> 0x079d }
            r6 = 0
            r3 = 0
        L_0x0249:
            java.lang.String r19 = "null cannot be cast to non-null type kotlin.String"
            r2 = r16
            if (r3 >= r2) goto L_0x026e
            java.lang.Object r13 = r15.get(r3)     // Catch:{ JSONException -> 0x079d }
            if (r13 == 0) goto L_0x0269
            r2 = r20
            r2.add(r13)     // Catch:{ JSONException -> 0x079d }
            int r3 = r3 + 1
            goto L_0x0249
        L_0x025d:
            r3 = 0
            goto L_0x020c
        L_0x025f:
            r9 = r18
            r21 = r9
            goto L_0x01c6
        L_0x0265:
            r4 = r18
            goto L_0x01b6
        L_0x0269:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r19)     // Catch:{ JSONException -> 0x079d }
            throw r0     // Catch:{ JSONException -> 0x079d }
        L_0x026e:
            java.lang.String r2 = "references_title"
            org.json.JSONArray r15 = r12.optJSONArray(r2)     // Catch:{ JSONException -> 0x079d }
            if (r15 == 0) goto L_0x02b9
            int r17 = r15.length()     // Catch:{ JSONException -> 0x079d }
            java.util.ArrayList r16 = X.C17880vN.A0z(r17)     // Catch:{ JSONException -> 0x079d }
            r3 = 0
        L_0x027f:
            r2 = r17
            if (r3 >= r2) goto L_0x0296
            java.lang.Object r13 = r15.get(r3)     // Catch:{ JSONException -> 0x079d }
            if (r13 == 0) goto L_0x0291
            r2 = r16
            r2.add(r13)     // Catch:{ JSONException -> 0x079d }
            int r3 = r3 + 1
            goto L_0x027f
        L_0x0291:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r19)     // Catch:{ JSONException -> 0x079d }
            throw r0     // Catch:{ JSONException -> 0x079d }
        L_0x0296:
            java.lang.String r2 = "thumbnail_cdn_url"
            org.json.JSONArray r3 = r12.optJSONArray(r2)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x02b9
            int r12 = r3.length()     // Catch:{ JSONException -> 0x079d }
            java.util.ArrayList r13 = X.C17880vN.A0z(r12)     // Catch:{ JSONException -> 0x079d }
        L_0x02a6:
            if (r6 >= r12) goto L_0x02bc
            java.lang.Object r2 = r3.get(r6)     // Catch:{ JSONException -> 0x079d }
            if (r2 == 0) goto L_0x02b4
            r13.add(r2)     // Catch:{ JSONException -> 0x079d }
            int r6 = r6 + 1
            goto L_0x02a6
        L_0x02b4:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r19)     // Catch:{ JSONException -> 0x079d }
            throw r0     // Catch:{ JSONException -> 0x079d }
        L_0x02b9:
            r22 = r18
            goto L_0x02c7
        L_0x02bc:
            X.6tP r22 = new X.6tP     // Catch:{ JSONException -> 0x079d }
            r26 = r20
            r27 = r16
            r28 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28)     // Catch:{ JSONException -> 0x079d }
        L_0x02c7:
            org.json.JSONObject r3 = r10.optJSONObject(r8)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x034e
            java.lang.String r2 = "reels_view_model"
            org.json.JSONObject r3 = r3.optJSONObject(r2)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x034e
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x079d }
            java.lang.String r2 = "reels_data"
            org.json.JSONArray r2 = r3.optJSONArray(r2)     // Catch:{ JSONException -> 0x079d }
            if (r2 == 0) goto L_0x0323
            X.Akx r13 = X.A6n.A04(r2)     // Catch:{ JSONException -> 0x079d }
        L_0x02e5:
            boolean r2 = r13.hasNext()     // Catch:{ JSONException -> 0x079d }
            if (r2 == 0) goto L_0x0323
            java.lang.Object r3 = r13.next()     // Catch:{ JSONException -> 0x079d }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ JSONException -> 0x079d }
            X.C18070vi.A0d(r3, r5)     // Catch:{ JSONException -> 0x079d }
            java.lang.String r2 = "reels_url"
            java.lang.String r12 = X.A6n.A02(r2, r3)     // Catch:{ JSONException -> 0x079d }
            if (r12 == 0) goto L_0x02e5
            java.lang.String r2 = "thumbnail_url"
            java.lang.String r8 = X.A6n.A02(r2, r3)     // Catch:{ JSONException -> 0x079d }
            if (r8 == 0) goto L_0x02e5
            java.lang.String r2 = "avatar_url"
            java.lang.String r6 = X.A6n.A02(r2, r3)     // Catch:{ JSONException -> 0x079d }
            if (r6 == 0) goto L_0x02e5
            java.lang.String r2 = "author"
            java.lang.String r3 = X.A6n.A02(r2, r3)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x02e5
            X.6sp r2 = new X.6sp     // Catch:{ JSONException -> 0x079d }
            r2.<init>(r12, r8, r6, r3)     // Catch:{ JSONException -> 0x079d }
            r10.add(r2)     // Catch:{ JSONException -> 0x079d }
            goto L_0x02e5
        L_0x031d:
            r7 = r18
            r22 = r7
            r8 = r7
            goto L_0x032e
        L_0x0323:
            boolean r2 = r10.isEmpty()     // Catch:{ JSONException -> 0x079d }
            if (r2 != 0) goto L_0x034e
            X.6qW r8 = new X.6qW     // Catch:{ JSONException -> 0x079d }
            r8.<init>(r10)     // Catch:{ JSONException -> 0x079d }
        L_0x032e:
            org.json.JSONObject r3 = r11.optJSONObject(r14)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x0367
            java.lang.String r2 = "textPrompts"
            org.json.JSONObject r3 = r3.optJSONObject(r2)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x0367
            java.lang.String r2 = "prompts"
            org.json.JSONArray r12 = r3.optJSONArray(r2)     // Catch:{ JSONException -> 0x079d }
            if (r12 == 0) goto L_0x0367
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x079d }
            int r11 = r12.length()     // Catch:{ JSONException -> 0x079d }
            r10 = 0
            goto L_0x0351
        L_0x034e:
            r8 = r18
            goto L_0x032e
        L_0x0351:
            if (r10 >= r11) goto L_0x0369
            org.json.JSONObject r3 = r12.getJSONObject(r10)     // Catch:{ JSONException -> 0x079d }
            if (r3 == 0) goto L_0x0364
            java.lang.String r2 = "text"
            java.lang.String r2 = X.A6n.A02(r2, r3)     // Catch:{ JSONException -> 0x079d }
            if (r2 == 0) goto L_0x0364
            r6.add(r2)     // Catch:{ JSONException -> 0x079d }
        L_0x0364:
            int r10 = r10 + 1
            goto L_0x0351
        L_0x0367:
            r6 = r18
        L_0x0369:
            X.00H r2 = r1.A0N     // Catch:{ JSONException -> 0x07a5 }
            java.lang.Object r10 = r2.get()     // Catch:{ JSONException -> 0x07a5 }
            X.6x8 r10 = (X.C138466x8) r10     // Catch:{ JSONException -> 0x07a5 }
            X.6RO r15 = X.AnonymousClass6RO.RESPONDING     // Catch:{ JSONException -> 0x07a5 }
            if (r0 != r15) goto L_0x039d
            if (r9 == 0) goto L_0x039d
            X.6rB r2 = r9.A00     // Catch:{ JSONException -> 0x07a5 }
            if (r2 == 0) goto L_0x039d
            java.lang.String r2 = r2.A00     // Catch:{ JSONException -> 0x07a5 }
            int r2 = r2.length()     // Catch:{ JSONException -> 0x07a5 }
            if (r2 <= 0) goto L_0x039d
            r10.A02 = r5     // Catch:{ JSONException -> 0x07a5 }
            if (r8 == 0) goto L_0x0388
            goto L_0x0399
        L_0x0388:
            if (r7 == 0) goto L_0x0391
            java.lang.String r2 = r7.A00     // Catch:{ JSONException -> 0x07a5 }
            if (r2 == 0) goto L_0x0391
            X.6RB r2 = X.AnonymousClass6RB.NUM_RESPONSE_IMAGES     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x039b
        L_0x0391:
            if (r22 == 0) goto L_0x0396
            X.6RB r2 = X.AnonymousClass6RB.NUM_RESPONSE_SEARCH_RESULTS     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x039b
        L_0x0396:
            X.6RB r2 = X.AnonymousClass6RB.NUM_RESPONSE_TEXT_RESULTS     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x039b
        L_0x0399:
            X.6RB r2 = X.AnonymousClass6RB.NUM_RESPONSE_REELS     // Catch:{ JSONException -> 0x07a5 }
        L_0x039b:
            r10.A00 = r2     // Catch:{ JSONException -> 0x07a5 }
        L_0x039d:
            X.6RO r2 = r10.A01     // Catch:{ JSONException -> 0x07a5 }
            if (r0 == r2) goto L_0x0435
            X.6RO r11 = X.AnonymousClass6RO.LISTENING     // Catch:{ JSONException -> 0x07a5 }
            if (r2 != r11) goto L_0x0422
            X.6RO r2 = X.AnonymousClass6RO.AMBIENT     // Catch:{ JSONException -> 0x07a5 }
            if (r0 == r2) goto L_0x0422
            if (r4 == 0) goto L_0x0422
            X.6rB r2 = r4.A00     // Catch:{ JSONException -> 0x07a5 }
            if (r2 == 0) goto L_0x0422
            java.lang.String r2 = r2.A00     // Catch:{ JSONException -> 0x07a5 }
            int r2 = r2.length()     // Catch:{ JSONException -> 0x07a5 }
            if (r2 <= 0) goto L_0x0422
            X.00H r2 = r10.A03     // Catch:{ JSONException -> 0x07a5 }
            java.lang.Object r12 = r2.get()     // Catch:{ JSONException -> 0x07a5 }
            X.6ya r12 = (X.C139286ya) r12     // Catch:{ JSONException -> 0x07a5 }
            monitor-enter(r12)     // Catch:{ JSONException -> 0x07a5 }
            X.64Z r2 = r12.A01     // Catch:{ all -> 0x040a }
            if (r2 == 0) goto L_0x03d5
            java.lang.Long r2 = r2.A0D     // Catch:{ all -> 0x040a }
            if (r2 == 0) goto L_0x03d5
            long r16 = r2.longValue()     // Catch:{ all -> 0x040a }
            r13 = 0
            int r2 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x03d5
            r12.A01()     // Catch:{ all -> 0x040a }
        L_0x03d5:
            X.64Z r2 = r12.A01     // Catch:{ all -> 0x040a }
            if (r2 != 0) goto L_0x040d
            r2 = r18
            r12.A03 = r2     // Catch:{ all -> 0x040a }
            r12.A06 = r5     // Catch:{ all -> 0x040a }
            r2 = 0
            r12.A00 = r2     // Catch:{ all -> 0x040a }
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ all -> 0x040a }
            r2.<init>()     // Catch:{ all -> 0x040a }
            r12.A05 = r2     // Catch:{ all -> 0x040a }
            X.6R6 r2 = X.AnonymousClass6R6.UNKNOWN     // Catch:{ all -> 0x040a }
            r12.A02 = r2     // Catch:{ all -> 0x040a }
            X.64Z r2 = new X.64Z     // Catch:{ all -> 0x040a }
            r2.<init>()     // Catch:{ all -> 0x040a }
            r12.A01 = r2     // Catch:{ all -> 0x040a }
            X.00H r3 = r12.A07     // Catch:{ all -> 0x040a }
            java.lang.Object r2 = r3.get()     // Catch:{ all -> 0x040a }
            X.6uK r2 = (X.C136746uK) r2     // Catch:{ all -> 0x040a }
            r2.A01()     // Catch:{ all -> 0x040a }
            java.lang.Object r2 = r3.get()     // Catch:{ all -> 0x040a }
            X.6uK r2 = (X.C136746uK) r2     // Catch:{ all -> 0x040a }
            r2.A02()     // Catch:{ all -> 0x040a }
            goto L_0x040d
        L_0x040a:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ JSONException -> 0x07a5 }
            throw r0     // Catch:{ JSONException -> 0x07a5 }
        L_0x040d:
            monitor-exit(r12)     // Catch:{ JSONException -> 0x07a5 }
            boolean r2 = r10.A02     // Catch:{ JSONException -> 0x07a5 }
            if (r2 != 0) goto L_0x0422
            r2 = 1
            r10.A02 = r2     // Catch:{ JSONException -> 0x07a5 }
            X.00H r2 = r10.A04     // Catch:{ JSONException -> 0x07a5 }
            java.lang.Object r3 = r2.get()     // Catch:{ JSONException -> 0x07a5 }
            X.6zu r3 = (X.C140076zu) r3     // Catch:{ JSONException -> 0x07a5 }
            X.6RB r2 = X.AnonymousClass6RB.NUM_REQUESTS_SENT     // Catch:{ JSONException -> 0x07a5 }
            r3.A01(r2)     // Catch:{ JSONException -> 0x07a5 }
        L_0x0422:
            X.6RO r2 = r10.A01     // Catch:{ JSONException -> 0x07a5 }
            if (r2 != r15) goto L_0x0429
            X.C138466x8.A00(r10)     // Catch:{ JSONException -> 0x07a5 }
        L_0x0429:
            if (r0 == r11) goto L_0x042f
            X.6RO r2 = X.AnonymousClass6RO.THINKING     // Catch:{ JSONException -> 0x07a5 }
            if (r0 != r2) goto L_0x0433
        L_0x042f:
            r2 = r18
            r10.A00 = r2     // Catch:{ JSONException -> 0x07a5 }
        L_0x0433:
            r10.A01 = r0     // Catch:{ JSONException -> 0x07a5 }
        L_0x0435:
            if (r21 == 0) goto L_0x0441
            int r2 = r21.length()     // Catch:{ JSONException -> 0x07a5 }
            if (r2 == 0) goto L_0x0441
            r2 = r21
            r1.A04 = r2     // Catch:{ JSONException -> 0x07a5 }
        L_0x0441:
            if (r7 == 0) goto L_0x045d
            java.lang.String r2 = r7.A00     // Catch:{ JSONException -> 0x07a5 }
            if (r2 == 0) goto L_0x045d
            java.lang.String r7 = r1.A04     // Catch:{ JSONException -> 0x07a5 }
            X.6R6 r10 = X.AnonymousClass6R6.IMAGE     // Catch:{ JSONException -> 0x07a5 }
            X.6qT r3 = new X.6qT     // Catch:{ JSONException -> 0x07a5 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x07a5 }
            X.6zo r2 = new X.6zo     // Catch:{ JSONException -> 0x07a5 }
            r12 = r18
            r13 = r12
            r8 = r2
            r9 = r3
            r11 = r12
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x04b8
        L_0x045d:
            if (r9 == 0) goto L_0x04b7
            X.6rB r2 = r9.A00     // Catch:{ JSONException -> 0x07a5 }
            if (r2 == 0) goto L_0x04b7
            java.lang.String r2 = r2.A00     // Catch:{ JSONException -> 0x07a5 }
            int r3 = r2.length()     // Catch:{ JSONException -> 0x07a5 }
            if (r3 <= 0) goto L_0x04b7
            if (r22 != 0) goto L_0x0485
            if (r8 != 0) goto L_0x049e
            java.lang.String r7 = r1.A04     // Catch:{ JSONException -> 0x07a5 }
            X.6R6 r10 = X.AnonymousClass6R6.TEXT     // Catch:{ JSONException -> 0x07a5 }
            X.6qU r3 = new X.6qU     // Catch:{ JSONException -> 0x07a5 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x07a5 }
            X.6zo r2 = new X.6zo     // Catch:{ JSONException -> 0x07a5 }
            r12 = r18
            r13 = r12
            r8 = r2
            r9 = r12
            r11 = r3
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x04b8
        L_0x0485:
            if (r8 != 0) goto L_0x049e
            java.lang.String r7 = r1.A04     // Catch:{ JSONException -> 0x07a5 }
            X.6R6 r19 = X.AnonymousClass6R6.SEARCH     // Catch:{ JSONException -> 0x07a5 }
            X.6qU r3 = new X.6qU     // Catch:{ JSONException -> 0x07a5 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x07a5 }
            X.6zo r2 = new X.6zo     // Catch:{ JSONException -> 0x07a5 }
            r21 = r18
            r17 = r2
            r20 = r3
            r23 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x04b8
        L_0x049e:
            java.lang.String r7 = r1.A04     // Catch:{ JSONException -> 0x07a5 }
            X.6R6 r19 = X.AnonymousClass6R6.REELS     // Catch:{ JSONException -> 0x07a5 }
            X.6qU r3 = new X.6qU     // Catch:{ JSONException -> 0x07a5 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x07a5 }
            X.6zo r2 = new X.6zo     // Catch:{ JSONException -> 0x07a5 }
            r17 = r2
            r20 = r3
            r21 = r8
            r22 = r18
            r23 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x04b8
        L_0x04b7:
            r2 = 0
        L_0x04b8:
            if (r6 == 0) goto L_0x04e0
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r9 = r1.A01     // Catch:{ JSONException -> 0x07a5 }
            if (r9 == 0) goto L_0x04e0
            X.00H r3 = r9.A0S     // Catch:{ JSONException -> 0x07a5 }
            X.1UD r7 = X.AnonymousClass3MW.A0X(r3)     // Catch:{ JSONException -> 0x07a5 }
            boolean r3 = r7.A0F()     // Catch:{ JSONException -> 0x07a5 }
            if (r3 == 0) goto L_0x04dd
            X.0ve r8 = r7.A00     // Catch:{ JSONException -> 0x07a5 }
            X.0vf r7 = X.C18040vf.A01     // Catch:{ JSONException -> 0x07a5 }
            r3 = 12290(0x3002, float:1.7222E-41)
            boolean r3 = X.C18020vd.A05(r7, r8, r3)     // Catch:{ JSONException -> 0x07a5 }
            if (r3 == 0) goto L_0x04dd
            boolean r3 = r6.isEmpty()     // Catch:{ JSONException -> 0x07a5 }
            if (r3 == 0) goto L_0x04de
            goto L_0x04e0
        L_0x04dd:
            r6 = 0
        L_0x04de:
            r9.A04 = r6     // Catch:{ JSONException -> 0x07a5 }
        L_0x04e0:
            if (r4 == 0) goto L_0x06ee
            X.6rB r3 = r4.A00     // Catch:{ JSONException -> 0x07a5 }
            if (r3 == 0) goto L_0x06ee
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r9 = r1.A01     // Catch:{ JSONException -> 0x07a5 }
            if (r9 == 0) goto L_0x06ee
            java.lang.String r6 = r3.A00     // Catch:{ JSONException -> 0x07a5 }
            java.lang.String r7 = r4.A01     // Catch:{ JSONException -> 0x07a5 }
            if (r2 == 0) goto L_0x04f1
            r5 = 1
        L_0x04f1:
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A07(r9)     // Catch:{ JSONException -> 0x07a5 }
            X.6uK r4 = r9.A0L     // Catch:{ JSONException -> 0x07a5 }
            boolean r3 = r4.A01     // Catch:{ JSONException -> 0x07a5 }
            if (r3 == 0) goto L_0x0515
            r4.A00()     // Catch:{ JSONException -> 0x07a5 }
            X.00H r3 = r9.A0V     // Catch:{ JSONException -> 0x07a5 }
            java.lang.Object r10 = r3.get()     // Catch:{ JSONException -> 0x07a5 }
            X.6zu r10 = (X.C140076zu) r10     // Catch:{ JSONException -> 0x07a5 }
            long r3 = r4.A00     // Catch:{ JSONException -> 0x07a5 }
            X.0vl r8 = r10.A08     // Catch:{ JSONException -> 0x07a5 }
            boolean r8 = X.C72453Mb.A1a(r8)     // Catch:{ JSONException -> 0x07a5 }
            if (r8 == 0) goto L_0x0515
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x07a5 }
            r10.A03 = r3     // Catch:{ JSONException -> 0x07a5 }
        L_0x0515:
            int r3 = r6.length()     // Catch:{ JSONException -> 0x07a5 }
            if (r3 <= 0) goto L_0x052a
            X.1DT r8 = r9.A0D     // Catch:{ JSONException -> 0x07a5 }
            java.lang.Object r4 = r8.A06()     // Catch:{ JSONException -> 0x07a5 }
            X.6RF r3 = X.AnonymousClass6RF.RESPONDING     // Catch:{ JSONException -> 0x07a5 }
            if (r4 == r3) goto L_0x052a
            X.6RF r3 = X.AnonymousClass6RF.PROCESSING     // Catch:{ JSONException -> 0x07a5 }
            r8.A0E(r3)     // Catch:{ JSONException -> 0x07a5 }
        L_0x052a:
            X.1DT r4 = r9.A0G     // Catch:{ JSONException -> 0x07a5 }
            if (r7 != 0) goto L_0x0531
            r3 = 0
            if (r5 == 0) goto L_0x0532
        L_0x0531:
            r3 = 1
        L_0x0532:
            X.1D6 r3 = X.C108975cc.A0i(r6, r3)     // Catch:{ JSONException -> 0x07a5 }
            r4.A0E(r3)     // Catch:{ JSONException -> 0x07a5 }
            if (r7 == 0) goto L_0x06ee
            X.6k4 r5 = r9.A0K     // Catch:{ JSONException -> 0x07a5 }
            java.lang.Integer r8 = r9.A02     // Catch:{ JSONException -> 0x07a5 }
            java.lang.String r4 = r9.A03     // Catch:{ JSONException -> 0x07a5 }
            monitor-enter(r5)     // Catch:{ JSONException -> 0x07a5 }
            java.lang.String r3 = r5.A00     // Catch:{ all -> 0x06eb }
            boolean r3 = X.C18070vi.A18(r3, r7)     // Catch:{ all -> 0x06eb }
            if (r3 != 0) goto L_0x06e9
            r5.A00 = r7     // Catch:{ all -> 0x06eb }
            java.lang.Integer r9 = r5.A09     // Catch:{ all -> 0x06eb }
            java.lang.Integer r17 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x06eb }
            r3 = r17
            if (r9 != r3) goto L_0x0558
            java.lang.Integer r3 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x06eb }
            r5.A09 = r3     // Catch:{ all -> 0x06eb }
        L_0x0558:
            java.lang.Integer r20 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x06eb }
            X.11P r3 = r5.A02     // Catch:{ all -> 0x06eb }
            long r25 = X.AnonymousClass11P.A01(r3)     // Catch:{ all -> 0x06eb }
            X.6tO r3 = new X.6tO     // Catch:{ all -> 0x06eb }
            r19 = r3
            r21 = r8
            r22 = r6
            r23 = r7
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x06eb }
            java.util.concurrent.ConcurrentLinkedQueue r7 = r5.A01     // Catch:{ all -> 0x06eb }
            r7.offer(r3)     // Catch:{ all -> 0x06eb }
            X.00H r4 = r5.A05     // Catch:{ all -> 0x06eb }
            r19 = r4
            java.lang.Object r12 = r19.get()     // Catch:{ all -> 0x06eb }
            X.6eV r12 = (X.C127526eV) r12     // Catch:{ all -> 0x06eb }
            long r8 = r3.A00     // Catch:{ all -> 0x06eb }
            java.lang.String r14 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x06eb }
            org.json.JSONObject r13 = X.C17880vN.A15()     // Catch:{ all -> 0x06eb }
            java.lang.Integer r4 = r3.A02     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = X.C124026Wt.A00(r4)     // Catch:{ all -> 0x06eb }
            java.lang.String r11 = "type"
            r13.put(r11, r4)     // Catch:{ all -> 0x06eb }
            java.lang.String r10 = "message"
            java.lang.String r4 = r3.A04     // Catch:{ all -> 0x06eb }
            r13.put(r10, r4)     // Catch:{ all -> 0x06eb }
            java.lang.String r8 = "sessionId"
            java.lang.String r4 = r3.A05     // Catch:{ all -> 0x06eb }
            r13.put(r8, r4)     // Catch:{ all -> 0x06eb }
            java.lang.String r9 = "timestamp"
            r13.put(r9, r14)     // Catch:{ all -> 0x06eb }
            java.lang.Integer r4 = r3.A01     // Catch:{ all -> 0x06eb }
            if (r4 == 0) goto L_0x05c8
            java.lang.String r4 = X.C196839vj.A01(r4)     // Catch:{ all -> 0x06eb }
        L_0x05ae:
            java.lang.String r6 = "botMetricsEntryPoint"
            r13.put(r6, r4)     // Catch:{ all -> 0x06eb }
            java.lang.String r4 = "botMetricsDestinationId"
            java.lang.String r3 = r3.A03     // Catch:{ all -> 0x06eb }
            r13.put(r4, r3)     // Catch:{ all -> 0x06eb }
            java.lang.String r3 = X.C18070vi.A0H(r13)     // Catch:{ all -> 0x06eb }
            X.0vl r12 = r12.A01     // Catch:{ all -> 0x06eb }
            android.content.SharedPreferences$Editor r12 = X.C108995ce.A0E(r12)     // Catch:{ all -> 0x06eb }
            X.C17880vN.A1E(r12, r14, r3)     // Catch:{ all -> 0x06eb }
            goto L_0x05ca
        L_0x05c8:
            r4 = 0
            goto L_0x05ae
        L_0x05ca:
            X.00H r3 = r5.A03     // Catch:{ all -> 0x06e7 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x06e7 }
            X.1iT r3 = (X.C33221iT) r3     // Catch:{ all -> 0x06e7 }
            com.whatsapp.bot.home.sync.discovery.DiscoveryBots r12 = r3.A00()     // Catch:{ all -> 0x06e7 }
            if (r12 != 0) goto L_0x05df
            java.lang.String r3 = "MetaAiVoiceMessageStore/flushStoreToSendMessage: couldn't load bots"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x06e7 }
            goto L_0x06e9
        L_0x05df:
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x06e7 }
            if (r3 == 0) goto L_0x06a9
            java.lang.Object r3 = r19.get()     // Catch:{ all -> 0x06e7 }
            X.6eV r3 = (X.C127526eV) r3     // Catch:{ all -> 0x06e7 }
            X.0vl r3 = r3.A01     // Catch:{ all -> 0x06e7 }
            android.content.SharedPreferences r3 = X.C18070vi.A03(r3)     // Catch:{ all -> 0x06e7 }
            java.util.Map r3 = r3.getAll()     // Catch:{ all -> 0x06e7 }
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ all -> 0x06e7 }
            r7.<init>()     // Catch:{ all -> 0x06e7 }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x06e7 }
            java.util.Iterator r16 = X.AnonymousClass000.A15(r3)     // Catch:{ all -> 0x06e7 }
        L_0x0601:
            boolean r3 = r16.hasNext()     // Catch:{ all -> 0x06e7 }
            if (r3 == 0) goto L_0x0698
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r16)     // Catch:{ all -> 0x06e7 }
            java.lang.Object r14 = r3.getKey()     // Catch:{ all -> 0x06e7 }
            java.lang.Object r13 = r3.getValue()     // Catch:{ all -> 0x06e7 }
            boolean r3 = r13 instanceof java.lang.String     // Catch:{ all -> 0x06e7 }
            if (r3 == 0) goto L_0x061a
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x06e7 }
            goto L_0x061b
        L_0x061a:
            r13 = 0
        L_0x061b:
            if (r14 == 0) goto L_0x0601
            if (r13 == 0) goto L_0x0601
            org.json.JSONObject r3 = X.C17880vN.A16(r13)     // Catch:{ Exception -> 0x0690 }
            java.lang.String r14 = X.C18070vi.A0J(r11, r3)     // Catch:{ Exception -> 0x0690 }
            java.lang.String r13 = "SYSTEM_START"
            boolean r13 = r14.equals(r13)     // Catch:{ Exception -> 0x0690 }
            if (r13 == 0) goto L_0x0632
            r22 = r17
            goto L_0x063c
        L_0x0632:
            java.lang.String r13 = "SYSTEM_END"
            boolean r13 = r14.equals(r13)     // Catch:{ Exception -> 0x0690 }
            if (r13 == 0) goto L_0x0680
            java.lang.Integer r22 = X.AnonymousClass00R.A01     // Catch:{ Exception -> 0x0690 }
        L_0x063c:
            java.lang.String r24 = r3.getString(r10)     // Catch:{ Exception -> 0x0690 }
            boolean r13 = r3.has(r8)     // Catch:{ Exception -> 0x0690 }
            r26 = 0
            if (r13 == 0) goto L_0x067d
            java.lang.String r25 = r3.getString(r8)     // Catch:{ Exception -> 0x0690 }
        L_0x064c:
            java.lang.String r13 = X.C18070vi.A0J(r9, r3)     // Catch:{ Exception -> 0x0690 }
            long r27 = java.lang.Long.parseLong(r13)     // Catch:{ Exception -> 0x0690 }
            boolean r13 = r3.has(r6)     // Catch:{ Exception -> 0x0690 }
            if (r13 == 0) goto L_0x067a
            java.lang.String r13 = X.C18070vi.A0J(r6, r3)     // Catch:{ Exception -> 0x0690 }
            java.lang.Integer r23 = X.C196839vj.A00(r13)     // Catch:{ Exception -> 0x0690 }
        L_0x0662:
            boolean r13 = r3.has(r4)     // Catch:{ Exception -> 0x0690 }
            if (r13 == 0) goto L_0x066c
            java.lang.String r26 = r3.getString(r4)     // Catch:{ Exception -> 0x0690 }
        L_0x066c:
            X.C18070vi.A0b(r24)     // Catch:{ Exception -> 0x0690 }
            X.6tO r3 = new X.6tO     // Catch:{ Exception -> 0x0690 }
            r21 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0690 }
            r7.add(r3)     // Catch:{ Exception -> 0x0690 }
            goto L_0x0601
        L_0x067a:
            r23 = r18
            goto L_0x0662
        L_0x067d:
            r25 = r18
            goto L_0x064c
        L_0x0680:
            java.lang.String r13 = "USER"
            boolean r13 = r14.equals(r13)     // Catch:{ Exception -> 0x0690 }
            if (r13 == 0) goto L_0x068b
            r22 = r20
            goto L_0x063c
        L_0x068b:
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r14)     // Catch:{ Exception -> 0x0690 }
            throw r3     // Catch:{ Exception -> 0x0690 }
        L_0x0690:
            r13 = move-exception
            java.lang.String r3 = "MetaAiVoiceMessageStoreSharedPreferences/getAllMetaAiVoiceMessages"
            com.whatsapp.util.Log.e(r3, r13)     // Catch:{ all -> 0x06e7 }
            goto L_0x0601
        L_0x0698:
            int r4 = r7.size()     // Catch:{ all -> 0x06e7 }
            r3 = 1
            if (r4 <= r3) goto L_0x06a9
            r4 = 21
            X.7Rn r3 = new X.7Rn     // Catch:{ all -> 0x06e7 }
            r3.<init>(r4)     // Catch:{ all -> 0x06e7 }
            X.C29391cC.A0H(r7, r3)     // Catch:{ all -> 0x06e7 }
        L_0x06a9:
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x06e7 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x06e9
            java.lang.Object r8 = r7.peek()     // Catch:{ all -> 0x06e7 }
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.metaai.voice.MetaAiVoiceMessageStore.VoiceMessage"
            X.C18070vi.A0z(r8, r3)     // Catch:{ all -> 0x06e7 }
            X.6tO r8 = (X.C136176tO) r8     // Catch:{ all -> 0x06e7 }
            X.0vl r3 = r5.A08     // Catch:{ all -> 0x06e7 }
            java.lang.Object r6 = r3.getValue()     // Catch:{ all -> 0x06e7 }
            X.10s r6 = (X.C200710s) r6     // Catch:{ all -> 0x06e7 }
            r4 = 44
            X.7R0 r3 = new X.7R0     // Catch:{ all -> 0x06e7 }
            r3.<init>(r8, r5, r12, r4)     // Catch:{ all -> 0x06e7 }
            r6.execute(r3)     // Catch:{ all -> 0x06e7 }
            r7.remove()     // Catch:{ all -> 0x06e7 }
            java.lang.Object r6 = r19.get()     // Catch:{ all -> 0x06e7 }
            X.6eV r6 = (X.C127526eV) r6     // Catch:{ all -> 0x06e7 }
            long r3 = r8.A00     // Catch:{ all -> 0x06e7 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x06e7 }
            X.0vl r3 = r6.A01     // Catch:{ all -> 0x06e7 }
            android.content.SharedPreferences$Editor r3 = X.C108995ce.A0E(r3)     // Catch:{ all -> 0x06e7 }
            X.C17880vN.A1B(r3, r4)     // Catch:{ all -> 0x06e7 }
            goto L_0x06a9
        L_0x06e7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06eb }
        L_0x06e9:
            monitor-exit(r5)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x06ee
        L_0x06eb:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ JSONException -> 0x07a5 }
            throw r0     // Catch:{ JSONException -> 0x07a5 }
        L_0x06ee:
            if (r2 == 0) goto L_0x074f
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r6 = r1.A01     // Catch:{ JSONException -> 0x07a5 }
            if (r6 == 0) goto L_0x074f
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A07(r6)     // Catch:{ JSONException -> 0x07a5 }
            X.6R6 r7 = r2.A01     // Catch:{ JSONException -> 0x07a5 }
            X.6R6 r3 = X.AnonymousClass6R6.UNKNOWN     // Catch:{ JSONException -> 0x07a5 }
            if (r7 == r3) goto L_0x0729
            X.6ya r8 = r6.A0I     // Catch:{ JSONException -> 0x07a5 }
            monitor-enter(r8)     // Catch:{ JSONException -> 0x07a5 }
            X.64Z r5 = r8.A01     // Catch:{ all -> 0x0715 }
            if (r5 == 0) goto L_0x0712
            java.lang.Long r3 = r5.A0D     // Catch:{ all -> 0x0715 }
            if (r3 != 0) goto L_0x0712
            long r3 = X.C139286ya.A00(r8)     // Catch:{ all -> 0x0715 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0715 }
            r5.A0D = r3     // Catch:{ all -> 0x0715 }
        L_0x0712:
            r8.A02 = r7     // Catch:{ all -> 0x0715 }
            goto L_0x0718
        L_0x0715:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ JSONException -> 0x07a5 }
            throw r0     // Catch:{ JSONException -> 0x07a5 }
        L_0x0718:
            monitor-exit(r8)     // Catch:{ JSONException -> 0x07a5 }
            r3 = 1
            r6.A0W(r3)     // Catch:{ JSONException -> 0x07a5 }
            X.1DT r4 = r6.A0D     // Catch:{ JSONException -> 0x07a5 }
            X.6RF r3 = X.AnonymousClass6RF.RESPONDING     // Catch:{ JSONException -> 0x07a5 }
            r4.A0E(r3)     // Catch:{ JSONException -> 0x07a5 }
            X.1DT r3 = r6.A0E     // Catch:{ JSONException -> 0x07a5 }
            r3.A0E(r2)     // Catch:{ JSONException -> 0x07a5 }
        L_0x0729:
            X.6R6 r3 = X.AnonymousClass6R6.SEARCH     // Catch:{ JSONException -> 0x07a5 }
            if (r7 != r3) goto L_0x073c
            X.6tP r3 = r2.A04     // Catch:{ JSONException -> 0x07a5 }
            if (r3 == 0) goto L_0x073c
            java.util.List r3 = r3.A04     // Catch:{ JSONException -> 0x07a5 }
            int r3 = r3.size()     // Catch:{ JSONException -> 0x07a5 }
            X.6ya r5 = r6.A0I     // Catch:{ JSONException -> 0x07a5 }
            long r3 = (long) r3     // Catch:{ JSONException -> 0x07a5 }
            r5.A00 = r3     // Catch:{ JSONException -> 0x07a5 }
        L_0x073c:
            X.6R6 r3 = X.AnonymousClass6R6.REELS     // Catch:{ JSONException -> 0x07a5 }
            if (r7 != r3) goto L_0x074f
            X.6qW r2 = r2.A03     // Catch:{ JSONException -> 0x07a5 }
            if (r2 == 0) goto L_0x074f
            java.util.List r2 = r2.A00     // Catch:{ JSONException -> 0x07a5 }
            int r2 = r2.size()     // Catch:{ JSONException -> 0x07a5 }
            X.6ya r4 = r6.A0I     // Catch:{ JSONException -> 0x07a5 }
            long r2 = (long) r2     // Catch:{ JSONException -> 0x07a5 }
            r4.A00 = r2     // Catch:{ JSONException -> 0x07a5 }
        L_0x074f:
            X.6RO r3 = X.AnonymousClass6RO.LISTENING     // Catch:{ JSONException -> 0x07a5 }
            if (r0 == r3) goto L_0x0757
            X.6RO r2 = X.AnonymousClass6RO.THINKING     // Catch:{ JSONException -> 0x07a5 }
            if (r0 != r2) goto L_0x075b
        L_0x0757:
            r2 = r18
            r1.A04 = r2     // Catch:{ JSONException -> 0x07a5 }
        L_0x075b:
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r5 = r1.A01     // Catch:{ JSONException -> 0x07a5 }
            if (r5 == 0) goto L_0x1999
            if (r0 == r3) goto L_0x0765
            X.6RO r2 = X.AnonymousClass6RO.AMBIENT     // Catch:{ JSONException -> 0x07a5 }
            if (r0 != r2) goto L_0x0779
        L_0x0765:
            X.1DT r4 = r5.A0D     // Catch:{ JSONException -> 0x07a5 }
            java.lang.Object r3 = r4.A06()     // Catch:{ JSONException -> 0x07a5 }
            X.6RF r2 = X.AnonymousClass6RF.RESPONDING     // Catch:{ JSONException -> 0x07a5 }
            if (r3 != r2) goto L_0x0779
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A05(r5)     // Catch:{ JSONException -> 0x07a5 }
            X.6RF r0 = X.AnonymousClass6RF.LISTENING     // Catch:{ JSONException -> 0x07a5 }
            r4.A0E(r0)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x1999
        L_0x0779:
            X.6RO r2 = X.AnonymousClass6RO.THINKING     // Catch:{ JSONException -> 0x07a5 }
            if (r0 != r2) goto L_0x078c
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A07(r5)     // Catch:{ JSONException -> 0x07a5 }
            X.1DT r2 = r5.A0D     // Catch:{ JSONException -> 0x07a5 }
            X.6RF r0 = X.AnonymousClass6RF.PROCESSING     // Catch:{ JSONException -> 0x07a5 }
            r2.A0E(r0)     // Catch:{ JSONException -> 0x07a5 }
        L_0x0787:
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A06(r5)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x1999
        L_0x078c:
            if (r0 != r15) goto L_0x0787
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A07(r5)     // Catch:{ JSONException -> 0x07a5 }
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A04(r5)     // Catch:{ JSONException -> 0x07a5 }
            X.1DT r2 = r5.A0D     // Catch:{ JSONException -> 0x07a5 }
            X.6RF r0 = X.AnonymousClass6RF.RESPONDING     // Catch:{ JSONException -> 0x07a5 }
            r2.A0E(r0)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x1999
        L_0x079d:
            r2 = move-exception
            java.lang.String r0 = "AiVoiceMetadata invalid payload"
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ JSONException -> 0x07a5 }
            goto L_0x1999
        L_0x07a5:
            X.00H r0 = r1.A0N
            java.lang.Object r0 = r0.get()
            X.6x8 r0 = (X.C138466x8) r0
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.6ya r0 = (X.C139286ya) r0
            X.64Z r2 = r0.A01
            if (r2 == 0) goto L_0x07bf
            java.lang.Long r0 = X.C108975cc.A0X()
            r2.A07 = r0
        L_0x07bf:
            java.lang.String r0 = "MetaAiRtcVoiceManager/onDataChannelMessage invalid JSON message, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r1.A0J
            java.lang.Object r3 = r0.get()
            X.190 r3 = (X.AnonymousClass190) r3
            java.lang.String r2 = "MetaAiRtcVoiceManager/onDataChannelMessage"
            r1 = 1
            r0 = r18
            r3.A0G(r2, r0, r1)
            goto L_0x1999
        L_0x07d6:
            X.6zc r0 = (X.C139896zc) r0
            java.lang.String r3 = r0.A02
            if (r3 == 0) goto L_0x07e7
            java.lang.Object r2 = r1.A01
            X.687 r2 = (X.AnonymousClass687) r2
            android.widget.TextView r2 = r2.A00
            if (r2 == 0) goto L_0x0811
            r2.setText(r3)
        L_0x07e7:
            android.graphics.Bitmap r4 = r0.A00
            java.lang.Object r3 = r1.A01
            X.687 r3 = (X.AnonymousClass687) r3
            X.1E7 r2 = r0.A01
            if (r2 == 0) goto L_0x1999
            if (r4 != 0) goto L_0x0804
            X.1VW r1 = r3.A03
            if (r1 == 0) goto L_0x0800
            com.whatsapp.components.button.ThumbnailButton r0 = r3.A02
            if (r0 == 0) goto L_0x080d
            r1.A0C(r0, r2)
            goto L_0x1999
        L_0x0800:
            java.lang.String r0 = "contactAvatars"
            goto L_0x1329
        L_0x0804:
            com.whatsapp.components.button.ThumbnailButton r0 = r3.A02
            if (r0 == 0) goto L_0x080d
            r0.setImageBitmap(r4)
            goto L_0x1999
        L_0x080d:
            java.lang.String r0 = "iconImageView"
            goto L_0x1329
        L_0x0811:
            java.lang.String r0 = "contactNameTextView"
            goto L_0x1329
        L_0x0815:
            X.6bp r0 = (X.C125876bp) r0
            java.lang.Object r5 = r1.A01
            com.whatsapp.expressionstray.search.ExpressionsSearchView r5 = (com.whatsapp.expressionstray.search.ExpressionsSearchView) r5
            boolean r1 = r0 instanceof X.C117105zE
            if (r1 == 0) goto L_0x083b
            java.lang.String r3 = "expressions_sheet"
            X.00H r0 = r5.A0Q
            if (r0 == 0) goto L_0x0837
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.73V r2 = (X.AnonymousClass73V) r2
            X.1FL r1 = X.C72453Mb.A0Z(r5)
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 0
            r2.A04(r1, r3, r0)
            goto L_0x1999
        L_0x0837:
            java.lang.String r0 = "avatarEditorLauncherLazy"
            goto L_0x1329
        L_0x083b:
            boolean r1 = r0 instanceof X.C117075zB
            if (r1 == 0) goto L_0x0846
            com.whatsapp.WaEditText r0 = r5.A0B
            X.C108965cb.A1B(r0)
            goto L_0x1999
        L_0x0846:
            boolean r1 = r0 instanceof X.C117065zA
            if (r1 != 0) goto L_0x08a7
            boolean r1 = r0 instanceof X.C117145zI
            if (r1 == 0) goto L_0x0868
            X.1LU r0 = r5.A0K
            if (r0 == 0) goto L_0x1094
            android.content.Context r0 = r5.A14()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.stickers.store.StickerStoreActivity"
            r2.setClassName(r1, r0)
            r5.A1k(r2)
            goto L_0x1999
        L_0x0868:
            boolean r1 = r0 instanceof X.C117205zO
            if (r1 == 0) goto L_0x087b
            X.5zO r0 = (X.C117205zO) r0
            boolean r1 = r0.A02
            if (r1 == 0) goto L_0x1999
            com.whatsapp.WaEditText r1 = r5.A0B
            X.C108965cb.A1B(r1)
            X.87C r2 = r5.A0J
            goto L_0x118d
        L_0x087b:
            boolean r1 = r0 instanceof X.C117155zJ
            if (r1 != 0) goto L_0x08a7
            boolean r1 = r0 instanceof X.C117215zP
            if (r1 == 0) goto L_0x1999
            X.5zP r0 = (X.C117215zP) r0
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x1999
            java.lang.String r1 = "ExpressionsSearchView/OnStickerSelected in search screen"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.WaEditText r1 = r5.A0B
            X.C108965cb.A1B(r1)
            r5.A28()
            X.88B r4 = r5.A0N
            if (r4 == 0) goto L_0x1999
            X.77d r3 = r0.A02
            java.lang.Integer r2 = r0.A03
            int r1 = r0.A00
            X.1BI r0 = r5.A0L
            r4.C6w(r0, r3, r2, r1)
            goto L_0x1999
        L_0x08a7:
            com.whatsapp.WaEditText r0 = r5.A0B
            X.C108965cb.A1B(r0)
            r5.A28()
            goto L_0x1999
        L_0x08b1:
            X.6Ts r0 = (X.C123256Ts) r0
            java.lang.Object r6 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r6 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r6
            boolean r1 = r0 instanceof X.C121056Hl
            if (r1 == 0) goto L_0x1999
            X.6Hl r0 = (X.C121056Hl) r0
            X.6Ra r1 = r0.A01
            if (r1 != 0) goto L_0x091b
            r2 = -1
        L_0x08c2:
            r4 = 1
            r1 = 2
            if (r2 == r1) goto L_0x0918
            java.lang.String r7 = "recent"
        L_0x08c8:
            X.0ve r2 = r6.A02
            X.C18070vi.A0W(r2)
            r1 = 8964(0x2304, float:1.2561E-41)
            boolean r1 = X.C25291Nq.A04(r2, r1)
            if (r1 == 0) goto L_0x090c
            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r6)
            r2 = 2131755265(0x7f100101, float:1.9141404E38)
            int r1 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.AnonymousClass000.A1L(r0, r1)
            java.lang.String r5 = r3.getQuantityString(r2, r1, r0)
        L_0x08e7:
            X.C18070vi.A0b(r5)
            r0 = 6
            X.48i r4 = new X.48i
            r4.<init>(r0, r7, r6)
            r3 = 2131896434(0x7f122872, float:1.942773E38)
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = r6.A04
            if (r2 == 0) goto L_0x0903
            r1 = 0
            r0 = 0
            X.Bik r0 = X.C23520Bik.A00(r0, r2, r5, r1)
            r0.A0F(r4, r3)
            r0.A08()
        L_0x0903:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A06
            if (r0 == 0) goto L_0x1999
            r0.A0c()
            goto L_0x1999
        L_0x090c:
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r6)
            r0 = 2131896435(0x7f122873, float:1.9427731E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x08e7
        L_0x0918:
            java.lang.String r7 = "starred"
            goto L_0x08c8
        L_0x091b:
            int r2 = r1.ordinal()
            goto L_0x08c2
        L_0x0920:
            X.6TE r0 = (X.AnonymousClass6TE) r0
            boolean r2 = r0 instanceof X.AnonymousClass608
            if (r2 == 0) goto L_0x0943
            java.lang.Object r4 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r4 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r4
            android.view.View r2 = r4.A01
            int r3 = X.C72453Mb.A0D(r2)
            android.view.View r2 = r4.A02
            if (r2 == 0) goto L_0x0937
            r2.setVisibility(r3)
        L_0x0937:
            java.lang.Object r1 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r1 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r1
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r1 = r1.A0E
            if (r1 == 0) goto L_0x1999
            boolean r0 = r0 instanceof X.AnonymousClass60D
            goto L_0x0ea7
        L_0x0943:
            boolean r2 = r0 instanceof X.AnonymousClass60C
            if (r2 == 0) goto L_0x0994
            java.lang.Object r8 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r8 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r8
            r9 = r0
            X.60C r9 = (X.AnonymousClass60C) r9
            android.view.View r2 = r8.A01
            int r3 = X.C72453Mb.A0D(r2)
            android.view.View r2 = r8.A02
            if (r2 == 0) goto L_0x095b
            r2.setVisibility(r3)
        L_0x095b:
            androidx.recyclerview.widget.RecyclerView r3 = r8.A06
            if (r3 == 0) goto L_0x0966
            X.1rI r2 = r3.getRecycledViewPool()
            r2.A01()
        L_0x0966:
            r7 = 0
            if (r3 == 0) goto L_0x0973
            X.1qy r2 = r3.getLayoutManager()
            if (r2 == 0) goto L_0x0973
            android.os.Parcelable r7 = r2.A0u()
        L_0x0973:
            X.5kV r6 = r8.A0F
            if (r6 == 0) goto L_0x0987
            X.1uh r2 = r6.A00
            java.util.List r5 = r2.A02
            java.util.List r4 = r9.A01
            r3 = 34
            X.3C4 r2 = new X.3C4
            r2.<init>(r5, r8, r7, r3)
            r6.A0V(r2, r4)
        L_0x0987:
            java.util.List r3 = r9.A02
            X.5kS r2 = r8.A0C
            if (r2 == 0) goto L_0x0990
            r2.A0W(r3)
        L_0x0990:
            r2 = 0
            r8.A0X = r2
            goto L_0x0937
        L_0x0994:
            boolean r2 = r0 instanceof X.AnonymousClass609
            if (r2 == 0) goto L_0x09a5
            java.lang.Object r3 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r3 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r3
            r2 = r0
            X.609 r2 = (X.AnonymousClass609) r2
            java.util.List r2 = r2.A00
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment.A06(r3, r2)
            goto L_0x0937
        L_0x09a5:
            boolean r2 = r0 instanceof X.AnonymousClass60A
            if (r2 == 0) goto L_0x09cf
            java.lang.Object r5 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r5 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r5
            r2 = r0
            X.60A r2 = (X.AnonymousClass60A) r2
            java.util.List r2 = r2.A00
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment.A06(r5, r2)
            X.00H r2 = r5.A0V
            if (r2 == 0) goto L_0x1098
            java.lang.Object r4 = r2.get()
            X.6mp r4 = (X.C132446mp) r4
            android.content.Context r3 = r5.A1n()
            r2 = 2131890257(0x7f121051, float:1.94152E38)
        L_0x09c6:
            java.lang.String r2 = X.AnonymousClass3MY.A0n(r5, r2)
            r4.A00(r3, r2)
            goto L_0x0937
        L_0x09cf:
            boolean r2 = r0 instanceof X.AnonymousClass60D
            if (r2 == 0) goto L_0x0a10
            java.lang.Object r5 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r5 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r5
            androidx.recyclerview.widget.RecyclerView r2 = r5.A06
            if (r2 == 0) goto L_0x09e2
            X.1rI r2 = r2.getRecycledViewPool()
            r2.A01()
        L_0x09e2:
            X.5kV r3 = r5.A0F
            if (r3 == 0) goto L_0x09eb
            X.0wS r2 = X.C18460wS.A00
            r3.A0W(r2)
        L_0x09eb:
            X.5kS r3 = r5.A0C
            if (r3 == 0) goto L_0x09f4
            X.0wS r2 = X.C18460wS.A00
            r3.A0W(r2)
        L_0x09f4:
            android.view.View r2 = r5.A02
            X.C72453Mb.A1D(r2)
            android.view.View r2 = r5.A01
            X.C72453Mb.A1C(r2)
            X.00H r2 = r5.A0V
            if (r2 == 0) goto L_0x1098
            java.lang.Object r4 = r2.get()
            X.6mp r4 = (X.C132446mp) r4
            android.content.Context r3 = r5.A1n()
            r2 = 2131890255(0x7f12104f, float:1.9415197E38)
            goto L_0x09c6
        L_0x0a10:
            boolean r2 = r0 instanceof X.AnonymousClass60E
            if (r2 == 0) goto L_0x0a41
            java.lang.Object r4 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r4 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r4
            androidx.recyclerview.widget.RecyclerView r2 = r4.A06
            if (r2 == 0) goto L_0x0a23
            X.1rI r2 = r2.getRecycledViewPool()
            r2.A01()
        L_0x0a23:
            X.5kV r3 = r4.A0F
            if (r3 == 0) goto L_0x0a2c
            X.0wS r2 = X.C18460wS.A00
            r3.A0W(r2)
        L_0x0a2c:
            X.5kS r3 = r4.A0C
            if (r3 == 0) goto L_0x0a35
            X.0wS r2 = X.C18460wS.A00
            r3.A0W(r2)
        L_0x0a35:
            android.view.View r2 = r4.A01
            X.C72453Mb.A1D(r2)
            android.view.View r2 = r4.A02
            X.C72453Mb.A1C(r2)
            goto L_0x0937
        L_0x0a41:
            boolean r2 = r0 instanceof X.AnonymousClass60B
            if (r2 == 0) goto L_0x0937
            java.lang.Object r5 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r5 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r5
            r2 = r0
            X.60B r2 = (X.AnonymousClass60B) r2
            java.util.List r4 = r2.A02
            int r3 = r2.A00
            X.5kS r2 = r5.A0C
            if (r2 == 0) goto L_0x0a57
            r2.A0W(r4)
        L_0x0a57:
            r2 = -1
            if (r3 == r2) goto L_0x0a61
            androidx.recyclerview.widget.RecyclerView r2 = r5.A07
            if (r2 == 0) goto L_0x0a61
            r2.A0f(r3)
        L_0x0a61:
            r2 = 0
            r5.A0X = r2
            goto L_0x0937
        L_0x0a66:
            java.lang.Object r3 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r3 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r3
            boolean r1 = r0 instanceof X.AnonymousClass6I6
            if (r1 == 0) goto L_0x0a8b
            r2 = 2131890372(0x7f1210c4, float:1.9415434E38)
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r3.A04
            if (r1 == 0) goto L_0x0a79
            r0 = 0
            X.C108955ca.A1H(r1, r2, r0)
        L_0x0a79:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A06
            if (r0 == 0) goto L_0x0a80
            r0.A0c()
        L_0x0a80:
            r0 = 1
            r3.A0X = r0
            java.lang.String r1 = "starred"
            r0 = 0
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment.A05(r3, r1, r0)
            goto L_0x1999
        L_0x0a8b:
            boolean r1 = r0 instanceof X.AnonymousClass6I8
            if (r1 == 0) goto L_0x0aa3
            X.0ve r1 = r3.A02
            X.C18070vi.A0W(r1)
            r0 = 8964(0x2304, float:1.2561E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 != 0) goto L_0x1999
            r2 = 2131890373(0x7f1210c5, float:1.9415436E38)
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r3.A04
            goto L_0x10ad
        L_0x0aa3:
            boolean r1 = r0 instanceof X.AnonymousClass6I5
            if (r1 != 0) goto L_0x1999
            X.6I7 r1 = X.AnonymousClass6I7.A00
            goto L_0x0c3c
        L_0x0aab:
            X.76z r0 = (X.C1417976z) r0
            if (r0 == 0) goto L_0x1999
            java.lang.Object r1 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r1 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r1
            X.5kV r4 = r1.A0F
            if (r4 == 0) goto L_0x1999
            r4.A01 = r0
            int r3 = r4.A0Q()
            r2 = 0
        L_0x0abe:
            if (r2 >= r3) goto L_0x1999
            java.lang.Object r1 = r4.A0U(r2)
            boolean r0 = r1 instanceof X.C1176860o
            if (r0 == 0) goto L_0x0acd
            if (r1 == 0) goto L_0x0acd
            r4.A0G(r2)
        L_0x0acd:
            int r2 = r2 + 1
            goto L_0x0abe
        L_0x0ad0:
            X.6TD r0 = (X.AnonymousClass6TD) r0
            boolean r2 = r0 instanceof X.AnonymousClass607
            if (r2 == 0) goto L_0x1999
            java.lang.Object r2 = r1.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r2 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r2
            X.607 r0 = (X.AnonymousClass607) r0
            java.lang.String r1 = r0.A00
            boolean r0 = r0.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment.A05(r2, r1, r0)
            goto L_0x1999
        L_0x0ae5:
            X.6T9 r0 = (X.AnonymousClass6T9) r0
            boolean r2 = r0 instanceof X.C117425zl
            r7 = 1
            r3 = 0
            r5 = 8
            if (r2 == 0) goto L_0x0b5a
            java.lang.Object r6 = r1.A01
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment r6 = (com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment) r6
            android.view.View r1 = r6.A02
            if (r1 == 0) goto L_0x0afa
            r1.setVisibility(r3)
        L_0x0afa:
            androidx.recyclerview.widget.RecyclerView r1 = r6.A06
            if (r1 == 0) goto L_0x0b01
            r1.setVisibility(r3)
        L_0x0b01:
            X.0vl r1 = r6.A0N
            boolean r1 = X.C72453Mb.A1a(r1)
            if (r1 == 0) goto L_0x0b57
            X.1bI r3 = r6.A0E
            if (r3 == 0) goto L_0x0b25
            android.view.View r2 = r3.A00
            r1 = 0
            if (r2 == 0) goto L_0x0b13
            r1 = 1
        L_0x0b13:
            if (r1 != r7) goto L_0x0b25
            android.view.View r1 = r3.A02()
        L_0x0b19:
            if (r1 == 0) goto L_0x0b1e
            r1.setVisibility(r5)
        L_0x0b1e:
            com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView r1 = r6.A0D
            if (r1 == 0) goto L_0x0b25
            r1.setVisibility(r5)
        L_0x0b25:
            X.5kX r2 = r6.A0A
            if (r2 == 0) goto L_0x0b31
            r1 = r0
            X.5zl r1 = (X.C117425zl) r1
            java.util.List r1 = r1.A00
            r2.A0W(r1)
        L_0x0b31:
            androidx.recyclerview.widget.RecyclerView r4 = r6.A06
            if (r4 == 0) goto L_0x0b4a
            android.content.Context r3 = r6.A1n()
            r1 = r0
            X.5zl r1 = (X.C117425zl) r1
            java.util.List r1 = r1.A01
            int r2 = r1.size()
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            r1.<init>(r3, r2)
            r4.setLayoutManager(r1)
        L_0x0b4a:
            X.5kW r1 = r6.A0C
            if (r1 == 0) goto L_0x1999
            X.5zl r0 = (X.C117425zl) r0
            java.util.List r0 = r0.A01
            r1.A0W(r0)
            goto L_0x1999
        L_0x0b57:
            android.view.View r1 = r6.A01
            goto L_0x0b19
        L_0x0b5a:
            boolean r2 = r0 instanceof X.C117415zk
            if (r2 == 0) goto L_0x0bc5
            java.lang.Object r2 = r1.A01
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment r2 = (com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment) r2
            android.view.View r1 = r2.A02
            if (r1 == 0) goto L_0x0b69
            r1.setVisibility(r3)
        L_0x0b69:
            androidx.recyclerview.widget.RecyclerView r1 = r2.A06
            if (r1 == 0) goto L_0x0b70
            r1.setVisibility(r5)
        L_0x0b70:
            X.0vl r1 = r2.A0N
            boolean r1 = X.C72453Mb.A1a(r1)
            if (r1 == 0) goto L_0x0bc2
            X.1bI r4 = r2.A0E
            if (r4 == 0) goto L_0x0b94
            android.view.View r3 = r4.A00
            r1 = 0
            if (r3 == 0) goto L_0x0b82
            r1 = 1
        L_0x0b82:
            if (r1 != r7) goto L_0x0b94
            android.view.View r1 = r4.A02()
        L_0x0b88:
            if (r1 == 0) goto L_0x0b8d
            r1.setVisibility(r5)
        L_0x0b8d:
            com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView r1 = r2.A0D
            if (r1 == 0) goto L_0x0b94
            r1.setVisibility(r5)
        L_0x0b94:
            X.5kX r1 = r2.A0A
            if (r1 == 0) goto L_0x0b9f
            X.5zk r0 = (X.C117415zk) r0
            java.util.List r0 = r0.A00
            r1.A0W(r0)
        L_0x0b9f:
            X.5kW r1 = r2.A0C
            if (r1 == 0) goto L_0x0ba8
            X.0wS r0 = X.C18460wS.A00
            r1.A0W(r0)
        L_0x0ba8:
            X.00H r0 = r2.A0K
            if (r0 == 0) goto L_0x1098
            java.lang.Object r3 = r0.get()
            X.6mp r3 = (X.C132446mp) r3
            android.content.Context r1 = r2.A1n()
            r0 = 2131890257(0x7f121051, float:1.94152E38)
        L_0x0bb9:
            java.lang.String r0 = X.AnonymousClass3MY.A0n(r2, r0)
            r3.A00(r1, r0)
            goto L_0x1999
        L_0x0bc2:
            android.view.View r1 = r2.A01
            goto L_0x0b88
        L_0x0bc5:
            boolean r2 = r0 instanceof X.C117435zm
            if (r2 == 0) goto L_0x0c3a
            java.lang.Object r2 = r1.A01
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment r2 = (com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment) r2
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0bd4
            r0.setVisibility(r5)
        L_0x0bd4:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A06
            if (r0 == 0) goto L_0x0bdb
            r0.setVisibility(r5)
        L_0x0bdb:
            X.0vl r0 = r2.A0N
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0c33
            X.1bI r0 = r2.A0E
            if (r0 == 0) goto L_0x0bf0
            android.view.View r0 = r0.A02()
        L_0x0beb:
            if (r0 == 0) goto L_0x0bf0
            r0.setVisibility(r3)
        L_0x0bf0:
            com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView r0 = r2.A0D
            if (r0 == 0) goto L_0x0bf7
            r0.setVisibility(r3)
        L_0x0bf7:
            int[] r0 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A0R
            X.5z5 r4 = new X.5z5
            r4.<init>(r0)
            long r7 = X.C43291zZ.A00(r4, r3)
            com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView r5 = r2.A0D
            if (r5 == 0) goto L_0x0c21
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r2)
            r0 = 2131166632(0x7f0705a8, float:1.7947515E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A00 = r0
            X.00H r0 = r2.A0H
            if (r0 == 0) goto L_0x0c36
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader r3 = (com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader) r3
            r6 = 0
            r3.A01(r4, r5, r6, r7)
        L_0x0c21:
            X.00H r0 = r2.A0K
            if (r0 == 0) goto L_0x1098
            java.lang.Object r3 = r0.get()
            X.6mp r3 = (X.C132446mp) r3
            android.content.Context r1 = r2.A1n()
            r0 = 2131890255(0x7f12104f, float:1.9415197E38)
            goto L_0x0bb9
        L_0x0c33:
            android.view.View r0 = r2.A01
            goto L_0x0beb
        L_0x0c36:
            java.lang.String r0 = "emojiImageViewLoader"
            goto L_0x1329
        L_0x0c3a:
            X.5zn r1 = X.C117445zn.A00
        L_0x0c3c:
            X.C18070vi.A18(r0, r1)
            goto L_0x1999
        L_0x0c41:
            X.6T8 r0 = (X.AnonymousClass6T8) r0
            java.lang.Object r11 = r1.A01
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment r11 = (com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment) r11
            boolean r1 = r0 instanceof X.C117375zg
            if (r1 == 0) goto L_0x0c96
            X.5zg r0 = (X.C117375zg) r0
            int[] r5 = r0.A01
            int r4 = r0.A00
            int r1 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(r11)
            int r2 = r4 / r1
            androidx.recyclerview.widget.RecyclerView r1 = r11.A05
            r3 = 0
            if (r1 == 0) goto L_0x0c94
            X.1xT r1 = r1.A0O(r2)
            if (r1 == 0) goto L_0x0c94
            android.view.View r2 = r1.A0H
        L_0x0c64:
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0c92
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x0c6a:
            int r1 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(r11)
            int r4 = r4 % r1
            if (r2 == 0) goto L_0x1999
            android.view.View r2 = r2.getChildAt(r4)
            if (r2 == 0) goto L_0x1999
            X.1KW r4 = r11.A09
            if (r4 == 0) goto L_0x0dbc
            r1 = 0
            X.7G9 r3 = new X.7G9
            r3.<init>(r11, r0, r1)
            r6 = 1
            X.5gg r1 = new X.5gg
            r1.<init>(r2, r3, r4, r5, r6)
            r11.A07 = r1
        L_0x0c89:
            android.view.View r0 = r11.A0B
            if (r0 == 0) goto L_0x1999
            X.AnonymousClass72X.A01(r2, r0, r1)
            goto L_0x1999
        L_0x0c92:
            r2 = r3
            goto L_0x0c6a
        L_0x0c94:
            r2 = r3
            goto L_0x0c64
        L_0x0c96:
            boolean r1 = r0 instanceof X.C117385zh
            if (r1 == 0) goto L_0x0cdc
            X.5zh r0 = (X.C117385zh) r0
            int[] r5 = r0.A01
            int r4 = r0.A00
            int r1 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(r11)
            int r2 = r4 / r1
            androidx.recyclerview.widget.RecyclerView r1 = r11.A05
            r3 = 0
            if (r1 == 0) goto L_0x0cda
            X.1xT r1 = r1.A0O(r2)
            if (r1 == 0) goto L_0x0cda
            android.view.View r2 = r1.A0H
        L_0x0cb3:
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0cd8
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x0cb9:
            int r1 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(r11)
            int r4 = r4 % r1
            if (r2 == 0) goto L_0x1999
            android.view.View r2 = r2.getChildAt(r4)
            if (r2 == 0) goto L_0x1999
            r6 = 1
            X.7G9 r3 = new X.7G9
            r3.<init>(r11, r0, r6)
            X.1KW r4 = r11.A09
            if (r4 == 0) goto L_0x0dbc
            X.3RO r1 = new X.3RO
            r1.<init>(r2, r3, r4, r5, r6)
            r11.A08 = r1
            goto L_0x0c89
        L_0x0cd8:
            r2 = r3
            goto L_0x0cb9
        L_0x0cda:
            r2 = r3
            goto L_0x0cb3
        L_0x0cdc:
            boolean r1 = r0 instanceof X.C117395zi
            if (r1 == 0) goto L_0x0dc0
            X.5zi r0 = (X.C117395zi) r0
            int r14 = r0.A00
            int[] r8 = r0.A01
            X.0vl r0 = r11.A0N
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0db8
            X.1bI r0 = r11.A0F
            if (r0 == 0) goto L_0x1999
            android.view.View r13 = r0.A02()
        L_0x0cf6:
            if (r13 == 0) goto L_0x1999
            r0 = 2131427776(0x7f0b01c0, float:1.8477178E38)
            android.view.View r4 = X.AnonymousClass3MX.A0C(r13, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeAllViews()
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
            r0 = 2131166635(0x7f0705ab, float:1.794752E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
            r0 = 2131166633(0x7f0705a9, float:1.7947517E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r3 - r0
            int r2 = r0 / 2
            int[][] r9 = X.AnonymousClass74I.A0B(r8)
            X.C18070vi.A0b(r9)
            r5 = 6
            r7 = 0
            r1 = 0
        L_0x0d28:
            r12 = r9[r1]
            android.content.Context r6 = r13.getContext()
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r6)
            r0.setPadding(r2, r2, r2, r2)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r3, r3)
            r0.setLayoutParams(r6)
            X.1KW r15 = r11.A09
            if (r15 == 0) goto L_0x0dbc
            android.content.res.Resources r16 = X.AnonymousClass3MZ.A09(r11)
            X.C18070vi.A0X(r16)
            java.lang.String r6 = X.C43271zX.A00
            X.C18070vi.A0b(r12)
            X.5z5 r6 = new X.5z5
            r6.<init>(r12)
            r18 = 1061158912(0x3f400000, float:0.75)
            r19 = -1
            r17 = r6
            android.graphics.drawable.Drawable r6 = r15.A08(r16, r17, r18, r19)
            r0.setImageDrawable(r6)
            r15 = 1
            X.78D r10 = new X.78D
            r10.<init>(r11, r12, r13, r14, r15)
            r0.setOnClickListener(r10)
            r4.addView(r0)
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x0d28
            r0 = 2131434782(0x7f0b1d1e, float:1.8491388E38)
            android.widget.ImageView r1 = X.C108975cc.A0B(r13, r0)
            r1.setPadding(r2, r2, r2, r2)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            X.1KW r15 = r11.A09
            if (r15 == 0) goto L_0x0dbc
            android.content.res.Resources r16 = X.AnonymousClass3MZ.A09(r11)
            X.C18070vi.A0X(r16)
            X.5z5 r0 = new X.5z5
            r0.<init>(r8)
            r17 = r0
            android.graphics.drawable.Drawable r0 = r15.A08(r16, r17, r18, r19)
            r1.setImageDrawable(r0)
            r0 = 2131433257(0x7f0b1729, float:1.8488295E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 26
            X.AnonymousClass78O.A00(r1, r13, r0)
            r1 = 27
            X.78O r0 = new X.78O
            r0.<init>((java.lang.Object) r13, (int) r1)
            r13.setOnClickListener(r0)
            r13.setVisibility(r7)
            goto L_0x1999
        L_0x0db8:
            android.view.View r13 = r11.A03
            goto L_0x0cf6
        L_0x0dbc:
            java.lang.String r0 = "emojiLoader"
            goto L_0x1329
        L_0x0dc0:
            boolean r1 = r0 instanceof X.C117405zj
            if (r1 == 0) goto L_0x1999
            X.5zj r0 = (X.C117405zj) r0
            int r6 = r0.A00
            int[] r7 = r0.A01
            int r0 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(r11)
            int r4 = r6 / r0
            X.5kX r0 = r11.A0A
            r3 = 0
            if (r0 == 0) goto L_0x0e2e
            X.1uh r0 = r0.A00
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x0e2e
            java.util.ArrayList r3 = X.C17880vN.A10(r0)
            java.lang.Object r5 = r3.get(r4)
            X.6lH r5 = (X.C131546lH) r5
        L_0x0de5:
            boolean r0 = r5 instanceof X.C117535zx
            if (r0 == 0) goto L_0x0e30
            X.5zx r5 = (X.C117535zx) r5
            if (r5 == 0) goto L_0x0e30
            int[][] r1 = r5.A04
            int r0 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(r11)
            int r6 = r6 % r0
            r0 = r1[r6]
            boolean r0 = java.util.Arrays.equals(r0, r7)
            if (r0 != 0) goto L_0x1999
            r2 = 0
            X.1ZV r0 = new X.1ZV
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            r1.set(r6, r7)
            int[][] r0 = new int[r2][]
            java.lang.Object[] r10 = r1.toArray(r0)
            int[][] r10 = (int[][]) r10
            int[][] r9 = r5.A03
            X.1KW r6 = r5.A00
            java.lang.Integer r8 = r5.A02
            X.6sg r7 = r5.A01
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.5zx r5 = new X.5zx
            r5.<init>(r6, r7, r8, r9, r10)
            r3.set(r4, r5)
            X.5kX r0 = r11.A0A
            if (r0 == 0) goto L_0x1999
            r0.A0W(r3)
            goto L_0x1999
        L_0x0e2e:
            r5 = r3
            goto L_0x0de5
        L_0x0e30:
            java.lang.String r0 = "Unable to identify current emoji row to update skin tone."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x1999
        L_0x0e37:
            boolean r2 = r6 instanceof X.AnonymousClass7UN
            if (r2 == 0) goto L_0x0e59
            r5 = r6
            X.7UN r5 = (X.AnonymousClass7UN) r5
            int r4 = r5.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0e59
            int r4 = r4 - r3
            r5.label = r4
        L_0x0e49:
            java.lang.Object r6 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r5.label
            r3 = 1
            if (r2 == 0) goto L_0x0e5f
            if (r2 == r3) goto L_0x195c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0e59:
            X.7UN r5 = new X.7UN
            r5.<init>(r1, r6)
            goto L_0x0e49
        L_0x0e5f:
            X.C30691eM.A01(r6)
            java.lang.Object r2 = r1.A01
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            boolean r1 = X.AnonymousClass000.A1Y(r0)
            if (r1 == 0) goto L_0x1999
            r5.label = r3
            java.lang.Object r0 = r2.BJt(r0, r5)
            goto L_0x198b
        L_0x0e74:
            X.6T6 r0 = (X.AnonymousClass6T6) r0
            X.5za r2 = X.C117325za.A00
            boolean r2 = X.C18070vi.A18(r0, r2)
            if (r2 == 0) goto L_0x0eab
            java.lang.Object r4 = r1.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r4 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r4
            android.view.View r2 = r4.A00
            int r3 = X.C72453Mb.A0D(r2)
            android.view.View r2 = r4.A01
            if (r2 == 0) goto L_0x0e8f
            r2.setVisibility(r3)
        L_0x0e8f:
            X.1bI r2 = r4.A0G
            if (r2 == 0) goto L_0x0e96
            r2.A04(r3)
        L_0x0e96:
            android.view.ViewStub r2 = r4.A02
            if (r2 == 0) goto L_0x0e9d
            r2.setVisibility(r3)
        L_0x0e9d:
            java.lang.Object r1 = r1.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r1 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r1
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r1 = r1.A0B
            if (r1 == 0) goto L_0x1999
            boolean r0 = r0 instanceof X.C117295zX
        L_0x0ea7:
            r1.A05 = r0
            goto L_0x1999
        L_0x0eab:
            X.5zb r2 = X.C117335zb.A00
            boolean r2 = X.C18070vi.A18(r0, r2)
            if (r2 == 0) goto L_0x0ee9
            java.lang.Object r4 = r1.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r4 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r4
            android.view.View r2 = r4.A00
            int r3 = X.C72453Mb.A0D(r2)
            android.view.View r2 = r4.A01
            if (r2 == 0) goto L_0x0ec4
            r2.setVisibility(r3)
        L_0x0ec4:
            X.1bI r2 = r4.A0G
            if (r2 == 0) goto L_0x0ecb
            r2.A04(r3)
        L_0x0ecb:
            android.view.ViewStub r2 = r4.A02
            X.C72453Mb.A1C(r2)
            X.00H r2 = r4.A0K
            if (r2 == 0) goto L_0x1098
            java.lang.Object r5 = r2.get()
            X.6mp r5 = (X.C132446mp) r5
            android.content.Context r3 = r4.A1n()
            r2 = 2131890252(0x7f12104c, float:1.941519E38)
        L_0x0ee1:
            java.lang.String r2 = X.AnonymousClass3MY.A0n(r4, r2)
            r5.A00(r3, r2)
            goto L_0x0e9d
        L_0x0ee9:
            boolean r2 = r0 instanceof X.C117305zY
            if (r2 == 0) goto L_0x0fb2
            java.lang.Object r10 = r1.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r10 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r10
            r5 = r0
            X.5zY r5 = (X.C117305zY) r5
            android.view.View r2 = r10.A01
            int r4 = X.C72453Mb.A0D(r2)
            X.1bI r3 = r10.A0G
            if (r3 == 0) goto L_0x0f02
            r2 = 0
            r3.A04(r2)
        L_0x0f02:
            android.view.View r2 = r10.A00
            if (r2 == 0) goto L_0x0f09
            r2.setVisibility(r4)
        L_0x0f09:
            android.view.ViewStub r2 = r10.A02
            if (r2 == 0) goto L_0x0f10
            r2.setVisibility(r4)
        L_0x0f10:
            X.5kV r3 = r10.A0C
            if (r3 == 0) goto L_0x0f19
            java.util.List r2 = r5.A00
            r3.A0W(r2)
        L_0x0f19:
            X.0vl r2 = r10.A0T
            boolean r2 = X.C72453Mb.A1a(r2)
            r30 = r2 ^ 1
            X.5kV r2 = r10.A0C
            if (r2 != 0) goto L_0x0f84
            X.0ve r8 = r10.A02
            X.00H r12 = r10.A0L
            if (r12 == 0) goto L_0x1094
            X.00H r13 = r10.A0H
            if (r13 == 0) goto L_0x1090
            X.00H r14 = r10.A0J
            if (r14 == 0) goto L_0x108c
            r3 = 8138(0x1fca, float:1.1404E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r28 = X.C18020vd.A05(r2, r8, r3)
            X.1Sw r9 = r10.A0F
            if (r9 == 0) goto L_0x109c
            X.1Ns r4 = r10.A05
            if (r4 == 0) goto L_0x1088
            X.0ve r3 = r10.A02
            X.C18070vi.A0W(r3)
            r2 = 9860(0x2684, float:1.3817E-41)
            boolean r31 = X.C25291Nq.A04(r3, r2)
            X.00H r2 = r10.A0I
            if (r2 == 0) goto L_0x1084
            java.lang.Object r7 = r2.get()
            X.6nk r7 = (X.C132866nk) r7
            X.1OS r2 = r10.A0W
            X.C18070vi.A0b(r7)
            r5 = 0
            r29 = 0
            r27 = 1
            r11 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r18 = r5
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r5
            X.5kV r3 = new X.5kV
            r6 = r5
            r26 = r2
            r32 = r29
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r10.A0C = r3
        L_0x0f84:
            X.1bI r2 = r10.A0G
            if (r2 == 0) goto L_0x0f95
            android.view.View r3 = r2.A02()
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 == 0) goto L_0x0f95
            X.5kV r2 = r10.A0C
            r3.setAdapter(r2)
        L_0x0f95:
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment.A03(r10)
            X.00H r2 = r10.A0K
            if (r2 == 0) goto L_0x1098
            java.lang.Object r4 = r2.get()
            X.6mp r4 = (X.C132446mp) r4
            android.content.Context r3 = r10.A1n()
            r2 = 2131890257(0x7f121051, float:1.94152E38)
            java.lang.String r2 = X.AnonymousClass3MY.A0n(r10, r2)
            r4.A00(r3, r2)
            goto L_0x0e9d
        L_0x0fb2:
            boolean r2 = r0 instanceof X.C117295zX
            if (r2 == 0) goto L_0x1017
            java.lang.Object r4 = r1.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r4 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r4
            r2 = r0
            X.5zX r2 = (X.C117295zX) r2
            X.77d r7 = r2.A00
            android.view.View r2 = r4.A01
            int r3 = X.C72453Mb.A0D(r2)
            X.1bI r2 = r4.A0G
            if (r2 == 0) goto L_0x0fcc
            r2.A04(r3)
        L_0x0fcc:
            android.view.ViewStub r2 = r4.A02
            if (r2 == 0) goto L_0x0fd3
            r2.setVisibility(r3)
        L_0x0fd3:
            android.view.View r2 = r4.A00
            X.C72453Mb.A1C(r2)
            android.content.Context r2 = r4.A1n()
            if (r2 == 0) goto L_0x0e9d
            android.content.res.Resources r3 = r2.getResources()
            if (r3 == 0) goto L_0x0e9d
            r2 = 2131166577(0x7f070571, float:1.7947403E38)
            int r9 = r3.getDimensionPixelSize(r2)
            com.whatsapp.WaImageView r6 = r4.A06
            if (r6 == 0) goto L_0x0e9d
            if (r7 == 0) goto L_0x1004
            X.1Sw r2 = r4.A0F
            if (r2 == 0) goto L_0x109c
            r8 = 0
            r13 = 1
            r11 = 0
            r15 = r11
            X.2my r5 = new X.2my
            r10 = r9
            r12 = r11
            r14 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A06(r5)
        L_0x1004:
            X.00H r2 = r4.A0K
            if (r2 == 0) goto L_0x1098
            java.lang.Object r5 = r2.get()
            X.6mp r5 = (X.C132446mp) r5
            android.content.Context r3 = r4.A1n()
            r2 = 2131890255(0x7f12104f, float:1.9415197E38)
            goto L_0x0ee1
        L_0x1017:
            boolean r2 = r0 instanceof X.C117315zZ
            if (r2 == 0) goto L_0x0e9d
            java.lang.Object r6 = r1.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r6 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r6
            r7 = r0
            X.5zZ r7 = (X.C117315zZ) r7
            android.view.View r2 = r6.A01
            X.C72453Mb.A1C(r2)
            android.view.View r2 = r6.A00
            int r3 = X.C72453Mb.A0D(r2)
            X.1bI r2 = r6.A0G
            if (r2 == 0) goto L_0x1034
            r2.A04(r3)
        L_0x1034:
            android.view.ViewStub r2 = r6.A02
            if (r2 == 0) goto L_0x103b
            r2.setVisibility(r3)
        L_0x103b:
            androidx.recyclerview.widget.RecyclerView r2 = r6.A04
            r8 = 0
            if (r2 == 0) goto L_0x104a
            X.1qy r2 = r2.getLayoutManager()
            if (r2 == 0) goto L_0x104a
            android.os.Parcelable r8 = r2.A0u()
        L_0x104a:
            X.5kV r3 = r6.A0C
            if (r3 == 0) goto L_0x105e
            X.1uh r2 = r3.A00
            java.util.List r5 = r2.A02
            java.util.List r2 = r7.A01
            r9 = 37
            X.3Cr r4 = new X.3Cr
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (int) r9)
            r3.A0V(r4, r2)
        L_0x105e:
            com.whatsapp.expressionstray.expression.avatars.AvatarStickersCategoriesView r3 = r6.A0A
            if (r3 == 0) goto L_0x1076
            boolean r2 = r7.A03
            r3.setRecentEnabled(r2)
            boolean r2 = r7.A04
            r3.setStarredEnabled(r2)
            X.6UV r2 = r7.A00
            r3.setSelectedCategory(r2)
            boolean r2 = r7.A05
            r3.setTogetherVisible(r2)
        L_0x1076:
            boolean r2 = r7.A02
            if (r2 == 0) goto L_0x0e9d
            r2 = 1
            r6.A0M = r2
            X.6UV r2 = r7.A00
            r6.Bo3(r2)
            goto L_0x0e9d
        L_0x1084:
            java.lang.String r0 = "shapeImageViewLoader"
            goto L_0x1329
        L_0x1088:
            java.lang.String r0 = "referenceCountedFileManager"
            goto L_0x1329
        L_0x108c:
            java.lang.String r0 = "stickerSizeCalculator"
            goto L_0x1329
        L_0x1090:
            java.lang.String r0 = "expressionUserJourneyLogger"
            goto L_0x1329
        L_0x1094:
            java.lang.String r0 = "waIntents"
            goto L_0x1329
        L_0x1098:
            java.lang.String r0 = "talkbackForSearchLazy"
            goto L_0x1329
        L_0x109c:
            java.lang.String r0 = "stickerImageFileLoader"
            goto L_0x1329
        L_0x10a0:
            java.lang.Object r3 = r1.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r3 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r3
            boolean r1 = r0 instanceof X.AnonymousClass6I5
            if (r1 == 0) goto L_0x10b5
            r2 = 2131890372(0x7f1210c4, float:1.9415434E38)
        L_0x10ab:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r3.A03
        L_0x10ad:
            if (r1 == 0) goto L_0x1999
            r0 = 0
            X.C108955ca.A1H(r1, r2, r0)
            goto L_0x1999
        L_0x10b5:
            boolean r1 = r0 instanceof X.AnonymousClass6I6
            if (r1 != 0) goto L_0x1999
            X.6I8 r1 = X.AnonymousClass6I8.A00
            boolean r1 = X.C18070vi.A18(r0, r1)
            if (r1 != 0) goto L_0x1999
            X.6I7 r1 = X.AnonymousClass6I7.A00
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x1999
            r2 = 2131890373(0x7f1210c5, float:1.9415436E38)
            goto L_0x10ab
        L_0x10cd:
            boolean r0 = r0 instanceof X.AnonymousClass6E5
            if (r0 == 0) goto L_0x1999
            java.lang.Object r2 = r1.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r2 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r2
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r1 = X.C108965cb.A0M(r2)
            java.lang.Class<X.60i> r0 = X.C1176260i.class
            r1.A0U(r0)
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r0 = r2.A0E
            if (r0 == 0) goto L_0x1105
            X.6RP r1 = r0.A00()
            X.6RP r0 = X.AnonymousClass6RP.DISABLED
            boolean r0 = X.AnonymousClass3Ma.A1Z(r1, r0)
            if (r0 == 0) goto L_0x1999
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r0 = r2.A0E
            if (r0 == 0) goto L_0x1105
            java.lang.String r2 = "Style2"
            X.00H r0 = r0.A02
            android.content.SharedPreferences r0 = X.C108995ce.A0F(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_squid_version"
            X.C17880vN.A1E(r1, r0, r2)
            goto L_0x1999
        L_0x1105:
            java.lang.String r0 = "squidConfiguration"
            goto L_0x1329
        L_0x1109:
            X.6bp r0 = (X.C125876bp) r0
            java.lang.Object r3 = r1.A01
            com.whatsapp.expressionstray.ExpressionsTrayView r3 = (com.whatsapp.expressionstray.ExpressionsTrayView) r3
            boolean r2 = r3.A0U
            if (r2 == 0) goto L_0x12bc
            boolean r1 = r3.A0V
            if (r1 != 0) goto L_0x12bc
            boolean r1 = r0 instanceof X.C117105zE
            if (r1 == 0) goto L_0x1138
            java.lang.String r4 = "expressions_sheet"
            X.00H r0 = r3.getAvatarEditorLauncherLazy()
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.73V r2 = (X.AnonymousClass73V) r2
            android.app.Activity r1 = X.AnonymousClass3Ma.A05(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.C18070vi.A0z(r1, r0)
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 0
            r2.A04(r1, r4, r0)
            goto L_0x1999
        L_0x1138:
            boolean r1 = r0 instanceof X.C117075zB
            if (r1 != 0) goto L_0x1999
            boolean r1 = r0 instanceof X.C117065zA
            if (r1 != 0) goto L_0x12b7
            boolean r1 = r0 instanceof X.C117145zI
            if (r1 == 0) goto L_0x1161
            android.content.Context r4 = r3.getContext()
            r3.getWaIntents()
            android.content.Context r0 = r3.getContext()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.stickers.store.StickerStoreActivity"
            r2.setClassName(r1, r0)
            r4.startActivity(r2)
            goto L_0x1999
        L_0x1161:
            boolean r1 = r0 instanceof X.C117215zP
            if (r1 == 0) goto L_0x1181
            X.5zP r0 = (X.C117215zP) r0
            boolean r1 = r0.A04
            if (r1 != 0) goto L_0x1999
            java.lang.String r1 = "ExpressionsTrayView/OnStickerSelected in regular screen"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.88B r5 = r3.A0M
            if (r5 == 0) goto L_0x1999
            X.77d r4 = r0.A02
            java.lang.Integer r2 = r0.A03
            int r1 = r0.A00
            X.1BI r0 = r3.A0L
            r5.C6w(r0, r4, r2, r1)
            goto L_0x1999
        L_0x1181:
            boolean r1 = r0 instanceof X.C117205zO
            if (r1 == 0) goto L_0x1198
            X.5zO r0 = (X.C117205zO) r0
            boolean r1 = r0.A02
            if (r1 != 0) goto L_0x1999
            X.87C r2 = r3.A0J
        L_0x118d:
            if (r2 == 0) goto L_0x1999
            X.77J r1 = r0.A00
            boolean r0 = r0.A03
            r2.BvG(r1, r0)
            goto L_0x1999
        L_0x1198:
            boolean r1 = r0 instanceof X.C117085zC
            if (r1 == 0) goto L_0x11a5
            X.5ai r0 = r3.A02
            if (r0 == 0) goto L_0x1999
            r0.BmC()
            goto L_0x1999
        L_0x11a5:
            boolean r1 = r0 instanceof X.C117155zJ
            if (r1 == 0) goto L_0x11b6
            X.5ai r1 = r3.A02
            if (r1 == 0) goto L_0x1999
            X.5zJ r0 = (X.C117155zJ) r0
            int[] r0 = r0.A01
            r1.BsW(r0)
            goto L_0x1999
        L_0x11b6:
            boolean r1 = r0 instanceof X.C117185zM
            if (r1 == 0) goto L_0x11c7
            X.88y r1 = r3.A0H
            if (r1 == 0) goto L_0x1999
            X.5zM r0 = (X.C117185zM) r0
            java.lang.String r0 = r0.A01
            r1.CAy(r0)
            goto L_0x1999
        L_0x11c7:
            boolean r2 = r0 instanceof X.C117115zF
            r1 = 0
            if (r2 == 0) goto L_0x11d5
            X.88y r0 = r3.A0H
            if (r0 == 0) goto L_0x1999
            r0.CAy(r1)
            goto L_0x1999
        L_0x11d5:
            boolean r1 = r0 instanceof X.C117125zG
            if (r1 == 0) goto L_0x11e2
            X.88y r0 = r3.A0H
            if (r0 == 0) goto L_0x1999
            r0.CNn()
            goto L_0x1999
        L_0x11e2:
            boolean r1 = r0 instanceof X.C117165zK
            if (r1 == 0) goto L_0x11f3
            X.1Di r1 = r3.A0R
            if (r1 == 0) goto L_0x1999
            X.5zK r0 = (X.C117165zK) r0
            X.73u r0 = r0.A01
            r1.invoke(r0)
            goto L_0x1999
        L_0x11f3:
            boolean r1 = r0 instanceof X.C117195zN
            if (r1 == 0) goto L_0x121b
            android.app.Activity r2 = X.AnonymousClass3Ma.A05(r3)
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C18070vi.A0z(r2, r1)
            X.01E r2 = (X.AnonymousClass01E) r2
            boolean r1 = r2 instanceof X.AnonymousClass1FU
            if (r1 == 0) goto L_0x1999
            X.1FU r2 = (X.AnonymousClass1FU) r2
            if (r2 == 0) goto L_0x1999
            X.5zN r0 = (X.C117195zN) r0
            java.lang.String r9 = r0.A01
            r3 = 0
            java.lang.String r8 = "soc-sti-warning"
            r5 = r3
            r6 = r3
            r7 = r3
            r10 = r3
            r4 = r3
            r2.CMx(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x1999
        L_0x121b:
            boolean r1 = r0 instanceof X.C117135zH
            if (r1 == 0) goto L_0x1286
            X.5Xm r0 = r3.A09
            if (r0 == 0) goto L_0x1999
            X.4n7 r0 = (X.C95984n7) r0
            X.4aY r2 = r0.A00
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A0i
            r0 = 3
            r1.A0W(r0)
            com.whatsapp.expressionstray.ExpressionsTrayView r7 = r2.A3D
            X.0ve r1 = r7.getAbProps()
            r0 = 8964(0x2304, float:1.2561E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x1999
            X.5hp r6 = r7.A0F
            if (r6 == 0) goto L_0x127d
            java.util.List r0 = r6.A04
            int r5 = r0.size()
            if (r5 < 0) goto L_0x127d
            r4 = 0
        L_0x1248:
            android.util.SparseArray r0 = r6.A01
            java.lang.Object r3 = r0.get(r4)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            boolean r0 = r3 instanceof com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment
            if (r0 == 0) goto L_0x1278
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r3 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r3
            if (r3 == 0) goto L_0x1278
            r2 = 1
            X.5kV r1 = r3.A0F
            if (r1 == 0) goto L_0x1273
            boolean r0 = r1.A03
            if (r0 == r2) goto L_0x1278
            r1.A03 = r2
            r1.A0X()
            com.whatsapp.wds.components.topbar.WDSToolbar r0 = r3.A0J
            X.C72453Mb.A1C(r0)
            android.view.View r0 = r3.A03
            X.C72453Mb.A1D(r0)
            r1.notifyDataSetChanged()
        L_0x1273:
            java.lang.String r0 = "starred"
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment.A05(r3, r0, r2)
        L_0x1278:
            if (r4 == r5) goto L_0x127d
            int r4 = r4 + 1
            goto L_0x1248
        L_0x127d:
            android.widget.FrameLayout r1 = r7.A0d
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x1999
        L_0x1286:
            boolean r1 = r0 instanceof X.C117095zD
            if (r1 != 0) goto L_0x12b7
            boolean r1 = r0 instanceof X.C117175zL
            if (r1 == 0) goto L_0x1999
            X.5Xn r1 = r3.A0A
            if (r1 == 0) goto L_0x1999
            X.5zL r0 = (X.C117175zL) r0
            java.lang.String r4 = r0.A01
            X.4n8 r1 = (X.C95994n8) r1
            X.4aY r3 = r1.A00
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A0i
            r0 = 4
            r1.A0W(r0)
            if (r4 == 0) goto L_0x1999
            com.whatsapp.mentions.MentionableEntry r2 = r3.A3Z
            X.5cQ r1 = r3.A2Q
            r0 = 2131892050(0x7f121752, float:1.9418837E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r3.A3Z
            r0.setText(r4)
            goto L_0x1999
        L_0x12b7:
            r3.A0B()
            goto L_0x1999
        L_0x12bc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExpressionsTrayView/Not calling observer/isAttached = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ; stopListeningObserver = "
            r1.append(r0)
            boolean r0 = r3.A0V
            X.C17900vP.A0r(r1, r0)
            goto L_0x1999
        L_0x12d4:
            int r2 = X.AnonymousClass000.A0M(r0)
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            goto L_0x130e
        L_0x12dd:
            java.lang.Object r1 = r1.A01
            X.7Dj r1 = (X.C143427Dj) r1
            X.0vl r1 = r1.A0C
            java.lang.Object r1 = r1.getValue()
            X.1G3 r1 = (X.AnonymousClass1G3) r1
            java.lang.Object r4 = r1.BJt(r0, r6)
            goto L_0x17c1
        L_0x12ef:
            boolean r3 = X.AnonymousClass000.A1Y(r0)
            java.lang.Object r0 = r1.A01
            com.whatsapp.camera.CameraActivity r0 = (com.whatsapp.camera.CameraActivity) r0
            X.7DY r1 = r0.BO9()
            com.whatsapp.CircularProgressBar r0 = r1.A0G
            if (r0 == 0) goto L_0x1999
            r2 = 0
            boolean r0 = X.C108995ce.A1U(r0)
            if (r0 == r3) goto L_0x1999
            com.whatsapp.CircularProgressBar r0 = r1.A0G
            if (r0 == 0) goto L_0x1999
            if (r3 != 0) goto L_0x130e
            r2 = 8
        L_0x130e:
            r0.setVisibility(r2)
            goto L_0x1999
        L_0x1313:
            X.5Wl r0 = (X.C106595Wl) r0
            java.lang.Object r1 = r1.A01
            com.whatsapp.camera.CameraActivity r1 = (com.whatsapp.camera.CameraActivity) r1
            X.7DY r2 = r1.BO9()
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            r2.A0I = r0
            X.741 r0 = r2.A0M
            if (r0 != 0) goto L_0x132e
            java.lang.String r0 = "cameraActionsController"
        L_0x1329:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x132e:
            r0.A07()
            goto L_0x1999
        L_0x1333:
            X.7C7 r0 = (X.AnonymousClass7C7) r0
            java.lang.Object r5 = r1.A01
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r5 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2) r5
            X.7C7 r3 = r5.A00
            r4 = 0
            if (r3 == 0) goto L_0x1360
            X.6Rd r2 = r3.A04
        L_0x1340:
            X.6Rd r1 = X.C122636Rd.A0D
            if (r2 == r1) goto L_0x134c
            if (r3 == 0) goto L_0x135e
            X.6Rd r2 = r3.A04
        L_0x1348:
            X.6Rd r1 = X.C122636Rd.A0B
            if (r2 != r1) goto L_0x135a
        L_0x134c:
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A0K
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onViewStateDismissed$1 r1 = new com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onViewStateDismissed$1
            r1.<init>(r5, r4)
            X.AnonymousClass3MW.A1X(r2, r1, r3)
        L_0x135a:
            r5.A00 = r0
            goto L_0x1999
        L_0x135e:
            r2 = r4
            goto L_0x1348
        L_0x1360:
            r2 = r4
            goto L_0x1340
        L_0x1362:
            X.7C7 r0 = (X.AnonymousClass7C7) r0
            if (r0 == 0) goto L_0x136f
            java.lang.Object r1 = r1.A01
            X.5tL r1 = (X.C115065tL) r1
            r1.A04(r0)
            goto L_0x1999
        L_0x136f:
            java.lang.Object r0 = r1.A01
            X.4VL r0 = (X.AnonymousClass4VL) r0
            r0.A01()
            goto L_0x1999
        L_0x1378:
            X.88u r0 = (X.C1605188u) r0
            java.lang.Object r7 = r1.A01
            com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer r7 = (com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer) r7
            r7.setListeners(r0)
            X.73r r6 = r7.getFloatingViewManager()
            X.7DJ r5 = r7.getUserActionListener()
            android.content.res.Resources r2 = r7.getResources()
            r1 = 2131166834(0x7f070672, float:1.7947925E38)
            int r2 = r2.getDimensionPixelSize(r1)
            X.C18070vi.A0i(r0, r5)
            boolean r1 = r0 instanceof X.AnonymousClass7DN
            if (r1 == 0) goto L_0x13cc
            boolean r1 = r6.A0A
            if (r1 != 0) goto L_0x13b8
            X.6T0 r4 = r0.BN3()
            if (r4 == 0) goto L_0x13c0
            X.1F9 r1 = X.AnonymousClass1ZG.A00(r7)
            if (r1 == 0) goto L_0x13c0
            X.1pm r3 = X.AnonymousClass3MZ.A0H(r1)
            r2 = 0
            com.whatsapp.calling.floatingview.ui.FloatingViewManager$tryHideWithAnimation$1 r1 = new com.whatsapp.calling.floatingview.ui.FloatingViewManager$tryHideWithAnimation$1
            r1.<init>(r7, r6, r4, r2)
            X.AnonymousClass3MX.A1Q(r1, r3)
        L_0x13b8:
            boolean r0 = r0.Bfr()
            r6.A0D = r0
            goto L_0x1999
        L_0x13c0:
            r6.A0A(r7)
            r1 = 0
            r6.A03 = r1
            r1 = 0
            r6.A00 = r1
            r6.A02 = r1
            goto L_0x13b8
        L_0x13cc:
            boolean r1 = r0 instanceof X.AnonymousClass7DM
            if (r1 == 0) goto L_0x13b8
            r8 = r0
            X.7DM r8 = (X.AnonymousClass7DM) r8
            r6.A01 = r2
            boolean r9 = r8.A03
            r4 = 1
            X.70A r3 = r8.A01
            if (r9 == 0) goto L_0x1484
            boolean r1 = r3.A0D
            r10 = 2
            if (r1 == 0) goto L_0x13e2
            r10 = 6
        L_0x13e2:
            X.5nN r2 = r6.A04
            if (r2 == 0) goto L_0x143c
            int r1 = r2.A01
            if (r10 != r1) goto L_0x143c
            X.70A r1 = r2.A05
            if (r1 == 0) goto L_0x13f7
            boolean r1 = X.AnonymousClass70A.A00(r3, r1)
            if (r1 != 0) goto L_0x13f7
            r2.A0B()
        L_0x13f7:
            r2.A0J(r3)
            android.graphics.Point r7 = X.C1409473r.A02(r7, r6, r8)
            android.view.View r1 = r6.A08()
            if (r1 == 0) goto L_0x1422
            int r2 = r1.getHeight()
            int r1 = r7.y
            if (r2 != r1) goto L_0x1422
            android.view.View r1 = r6.A08()
            if (r1 == 0) goto L_0x1422
            int r2 = r1.getWidth()
            int r1 = r7.x
            if (r2 != r1) goto L_0x1422
        L_0x141a:
            X.5nN r1 = r6.A04
            if (r1 == 0) goto L_0x13b8
            r1.A0I(r5)
            goto L_0x13b8
        L_0x1422:
            android.view.View r3 = r6.A08()
            if (r3 == 0) goto L_0x141a
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L_0x14a4
            int r1 = r7.x
            r2.width = r1
            int r1 = r7.y
            r2.height = r1
            r6.A09 = r4
            r3.setLayoutParams(r2)
            goto L_0x141a
        L_0x143c:
            r6.A0A(r7)
            X.5lE r1 = r6.A0E
            X.1xT r10 = r1.A0F(r7, r10)
            X.5nN r10 = (X.C113615nN) r10
            boolean r1 = r10 instanceof X.C116185wX
            if (r1 == 0) goto L_0x1451
            r1 = r10
            X.5wX r1 = (X.C116185wX) r1
            r1.A0K()
        L_0x1451:
            android.graphics.Point r2 = X.C1409473r.A02(r7, r6, r8)
            X.6T0 r1 = r8.A02
            r6.A06 = r1
            android.view.View r11 = r10.A0H
            int r8 = r2.x
            int r1 = r2.y
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r8, r1)
            if (r9 == 0) goto L_0x146a
            r1 = 17
            r2.gravity = r1
        L_0x146a:
            r7.addView(r11, r2)
            r1 = 2131430909(0x7f0b0dfd, float:1.8483532E38)
            r11.setId(r1)
            r10.A0J(r3)
            boolean r1 = r10 instanceof X.C116155wU
            if (r1 == 0) goto L_0x147f
            r1 = 9
            r10.A0E(r1)
        L_0x147f:
            r6.A04 = r10
            r6.A09 = r4
            goto L_0x141a
        L_0x1484:
            android.graphics.Point r1 = r8.A00
            int r2 = r1.x
            int r1 = r1.y
            boolean r2 = X.C108975cc.A1D(r2, r1)
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            boolean r1 = r3.A0O
            if (r1 == 0) goto L_0x149d
            boolean r1 = r3.A0D
            if (r1 != 0) goto L_0x149d
            r10 = 1
            goto L_0x13e2
        L_0x149d:
            r10 = 7
            if (r2 == 0) goto L_0x13e2
            r10 = 8
            goto L_0x13e2
        L_0x14a4:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x14ab:
            X.85T r0 = (X.AnonymousClass85T) r0
            java.lang.Object r3 = r1.A01
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r3 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r3
            boolean r1 = r0 instanceof X.C145007Jn
            if (r1 == 0) goto L_0x1999
            X.7Jn r0 = (X.C145007Jn) r0
            java.lang.Object r0 = r0.A00
            X.6rA r0 = (X.C134796rA) r0
            java.util.List r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.1vp r0 = r3.A03
            r0.A0F(r2)
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel.A03(r3, r1)
            goto L_0x1999
        L_0x14c9:
            X.84l r0 = (X.C1594184l) r0
            boolean r5 = r0 instanceof X.AnonymousClass7D0
            if (r5 == 0) goto L_0x14ec
            r2 = r0
            X.7D0 r2 = (X.AnonymousClass7D0) r2
            X.6qh r2 = r2.A00
            java.lang.String r4 = r2.A01
            if (r4 == 0) goto L_0x14ec
            int r2 = r4.length()
            if (r2 == 0) goto L_0x14ec
            java.lang.Object r2 = r1.A01
            com.whatsapp.bot.home.AiHomeViewModel r2 = (com.whatsapp.bot.home.AiHomeViewModel) r2
            X.1DT r3 = r2.A04
            X.6Ik r2 = new X.6Ik
            r2.<init>(r4)
            r3.A0F(r2)
        L_0x14ec:
            java.lang.Object r1 = r1.A01
            com.whatsapp.bot.home.AiHomeViewModel r1 = (com.whatsapp.bot.home.AiHomeViewModel) r1
            X.1DT r3 = r1.A01
            X.71I r2 = r1.A09
            r4 = 0
            if (r0 == 0) goto L_0x1512
            boolean r1 = r0 instanceof X.C143337Cz
            if (r1 == 0) goto L_0x151a
            X.7Cz r0 = (X.C143337Cz) r0
            boolean r1 = r0.A01
            if (r1 == 0) goto L_0x1517
            X.0vl r0 = r2.A03
        L_0x1503:
            java.lang.Object r0 = r0.getValue()
            X.6qg r0 = (X.C134496qg) r0
            java.util.ArrayList r0 = X.AnonymousClass71I.A00(r0)
            X.7Cz r4 = new X.7Cz
            r4.<init>(r1, r0)
        L_0x1512:
            r3.A0F(r4)
            goto L_0x1999
        L_0x1517:
            X.0vl r0 = r2.A04
            goto L_0x1503
        L_0x151a:
            if (r5 == 0) goto L_0x16f7
            X.7D0 r0 = (X.AnonymousClass7D0) r0
            X.6qh r1 = r0.A00
            java.lang.Object r1 = r1.A00
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r15 = r1.iterator()
        L_0x152c:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x16df
            X.A8k r1 = X.C108945cZ.A0V(r15)
            java.lang.String r11 = "__typename"
            org.json.JSONObject r9 = r1.A00
            java.lang.String r1 = r9.optString(r11)
            int r6 = r1.hashCode()
            r1 = -1148830851(0xffffffffbb863b7d, float:-0.004096447)
            if (r6 != r1) goto L_0x161c
            com.whatsapp.infra.graphql.generated.aihome.AiHomePersonaSectionImpl r10 = new com.whatsapp.infra.graphql.generated.aihome.AiHomePersonaSectionImpl
            r10.<init>(r9)
            java.lang.String r1 = "name"
            java.lang.String r8 = r10.A0F(r1)
            java.lang.String r1 = "section_id"
            java.lang.String r19 = r10.A0F(r1)
            if (r8 == 0) goto L_0x161c
            if (r19 == 0) goto L_0x161c
            java.lang.String r1 = "suggested_section_labels"
            X.1IX r1 = r10.A0C(r1)
            X.C199610h.A04(r1)
            X.C18070vi.A0X(r1)
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>(r1)
            java.lang.String r6 = "query"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.AiHomePersonaSectionImpl$Query> r1 = com.whatsapp.infra.graphql.generated.aihome.AiHomePersonaSectionImpl.Query.class
            X.A8k r7 = r10.A09(r1, r6)
            if (r7 == 0) goto L_0x161c
            java.lang.String r6 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.AiHomePersonaSectionImpl$Query$Edges> r1 = com.whatsapp.infra.graphql.generated.aihome.AiHomePersonaSectionImpl.Query.Edges.class
            X.1IX r1 = X.C108955ca.A0J(r7, r1, r6)
            java.util.ArrayList r7 = X.C108965cb.A0t(r1)
            java.util.Iterator r14 = r1.iterator()
        L_0x1587:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x15b3
            X.A8k r13 = X.C108945cZ.A0V(r14)
            java.lang.String r6 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.AiHomePersonaSectionImpl$Query$Edges$Node> r1 = com.whatsapp.infra.graphql.generated.aihome.AiHomePersonaSectionImpl.Query.Edges.Node.class
            X.A8k r1 = r13.A09(r1, r6)
            if (r1 == 0) goto L_0x1587
            org.json.JSONObject r1 = r1.A00
            X.C18070vi.A0W(r1)
            com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl r6 = new com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl
            r6.<init>(r1)
            java.lang.Object r1 = r12.poll()
            java.lang.String r1 = (java.lang.String) r1
            X.7Cw r1 = X.C123766Vt.A00(r6, r1, r8)
            r7.add(r1)
            goto L_0x1587
        L_0x15b3:
            java.util.ArrayList r7 = X.C29431cG.A0m(r7)
            boolean r1 = X.C17880vN.A1X(r7)
            if (r1 == 0) goto L_0x161c
            com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType r6 = com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "display_type"
            java.lang.Enum r1 = r10.A0E(r6, r1)
            com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType r1 = (com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType) r1
            X.6RQ r6 = A00(r1)
            boolean r1 = r2.A00
            if (r1 != 0) goto L_0x1605
            X.6RQ r1 = X.AnonymousClass6RQ.CAROUSEL_LARGE
            if (r6 != r1) goto L_0x1605
            X.2Zb r1 = r2.A01
            X.1rr r13 = r1.A00
            android.content.SharedPreferences r1 = X.C38771rr.A00(r13)
            java.lang.String r12 = "ai_home_explore_card_show_count"
            r11 = 0
            int r9 = r1.getInt(r12, r11)
            r1 = 3
            if (r9 >= r1) goto L_0x1605
            android.content.SharedPreferences r1 = X.C38771rr.A00(r13)
            int r1 = r1.getInt(r12, r11)
            int r9 = r1 + 1
            android.content.SharedPreferences r1 = X.C38771rr.A00(r13)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            X.C17880vN.A1C(r1, r12, r9)
            X.7Cs r1 = new X.7Cs
            r1.<init>()
            r7.add(r11, r1)
            r1 = 1
            r2.A00 = r1
        L_0x1605:
            java.lang.String r1 = "show_see_all_entry_point"
            boolean r21 = r10.A0G(r1)
            r22 = 0
            X.7Cr r1 = new X.7Cr
            r18 = r8
            r20 = r7
            r16 = r1
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x16da
        L_0x161c:
            java.lang.String r1 = r9.optString(r11)
            int r6 = r1.hashCode()
            r1 = 1950049549(0x743b650d, float:5.938776E31)
            if (r6 != r1) goto L_0x152c
            com.whatsapp.infra.graphql.generated.aihome.AiHomeChatHistorySectionImpl r10 = new com.whatsapp.infra.graphql.generated.aihome.AiHomeChatHistorySectionImpl
            r10.<init>(r9)
            java.lang.String r1 = "name"
            java.lang.String r7 = r10.A0F(r1)
            java.lang.String r1 = "section_id"
            java.lang.String r19 = r10.A0F(r1)
            if (r7 == 0) goto L_0x152c
            if (r19 == 0) goto L_0x152c
            X.1UD r6 = r2.A02
            boolean r1 = r6.A00()
            if (r1 == 0) goto L_0x152c
            X.0ve r8 = r6.A00
            X.0vf r6 = X.C18040vf.A01
            r1 = 12333(0x302d, float:1.7282E-41)
            boolean r1 = X.C18020vd.A05(r6, r8, r1)
            if (r1 == 0) goto L_0x152c
            com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType r6 = com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "display_type"
            java.lang.Enum r1 = r10.A0E(r6, r1)
            com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType r1 = (com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaSectionDisplayType) r1
            X.6RQ r17 = A00(r1)
            java.lang.String r6 = "items"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.AiHomeChatHistorySectionImpl$Items> r1 = com.whatsapp.infra.graphql.generated.aihome.AiHomeChatHistorySectionImpl.Items.class
            X.1IX r1 = X.C108955ca.A0J(r10, r1, r6)
            java.util.ArrayList r6 = X.C108965cb.A0t(r1)
            java.util.Iterator r13 = r1.iterator()
        L_0x1670:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x16c1
            X.A8k r12 = X.C108945cZ.A0V(r13)
            java.lang.String r9 = "persona"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.AiHomeChatHistorySectionImpl$Items$Persona> r8 = com.whatsapp.infra.graphql.generated.aihome.AiHomeChatHistorySectionImpl.Items.Persona.class
            X.A8k r1 = r12.A09(r8, r9)
            if (r1 == 0) goto L_0x1670
            org.json.JSONObject r1 = r1.A00
            X.C18070vi.A0W(r1)
            com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl r11 = new com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl
            r11.<init>(r1)
            X.A8k r8 = r12.A09(r8, r9)
            if (r8 == 0) goto L_0x1670
            java.lang.String r1 = "wa_thread_last_active_time"
            java.lang.String r9 = r8.A0F(r1)
            if (r9 == 0) goto L_0x1670
            X.1Dx r8 = com.whatsapp.jid.PhoneUserJid.Companion
            java.lang.String r1 = "phone_number_jid"
            java.lang.String r1 = r11.A0F(r1)
            com.whatsapp.jid.PhoneUserJid r8 = r8.A04(r1)
            if (r8 != 0) goto L_0x16b6
            X.2qw r8 = X.C42711yc.A01
            java.lang.String r1 = "jid"
            java.lang.String r1 = r11.A0F(r1)
            X.1yc r8 = r8.A02(r1)
        L_0x16b6:
            X.1BI r8 = (X.AnonymousClass1BI) r8
            X.7Cu r1 = new X.7Cu
            r1.<init>(r11, r8, r7, r9)
            r6.add(r1)
            goto L_0x1670
        L_0x16c1:
            boolean r1 = X.C17880vN.A1X(r6)
            if (r1 == 0) goto L_0x152c
            java.lang.String r1 = "should_show_see_all_entry_point"
            boolean r21 = r10.A0G(r1)
            r22 = 0
            X.7Cr r1 = new X.7Cr
            r18 = r7
            r20 = r6
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x16da:
            r5.add(r1)
            goto L_0x152c
        L_0x16df:
            r2 = 0
            X.6qg r1 = new X.6qg
            r1.<init>(r5, r2)
            java.util.ArrayList r2 = X.AnonymousClass71I.A00(r1)
            X.6qh r1 = new X.6qh
            r1.<init>(r2, r4)
            boolean r0 = r0.A01
            X.7D0 r4 = new X.7D0
            r4.<init>(r1, r0)
            goto L_0x1512
        L_0x16f7:
            boolean r1 = r0 instanceof X.AnonymousClass7D1
            if (r1 == 0) goto L_0x170e
            X.7D1 r0 = (X.AnonymousClass7D1) r0
            java.lang.Integer r1 = r0.A00
            java.util.List r2 = X.C123776Vu.A00(r1)
            boolean r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            X.7D1 r4 = new X.7D1
            r4.<init>(r0, r2, r1)
            goto L_0x1512
        L_0x170e:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x1713:
            boolean r0 = r6 instanceof X.C147467Tg
            if (r0 == 0) goto L_0x1738
            r5 = r6
            X.7Tg r5 = (X.C147467Tg) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x1738
            int r3 = r3 - r2
            r5.label = r3
        L_0x1725:
            java.lang.Object r6 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r5.label
            r3 = 2
            r0 = 1
            if (r2 == 0) goto L_0x173e
            if (r2 == r0) goto L_0x1752
            if (r2 == r3) goto L_0x195c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x1738:
            X.7Tg r5 = new X.7Tg
            r5.<init>(r1, r6)
            goto L_0x1725
        L_0x173e:
            X.C30691eM.A01(r6)
            java.lang.Object r2 = r1.A01
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            r5.L$0 = r2
            r5.label = r0
            r0 = 50
            java.lang.Object r0 = X.C62882s9.A00(r5, r0)
            if (r0 != r4) goto L_0x1759
            return r4
        L_0x1752:
            java.lang.Object r2 = r5.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r6)
        L_0x1759:
            X.1Wu r1 = X.C27621Wu.A00
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r0 = r2.BJt(r1, r5)
            goto L_0x198b
        L_0x1766:
            java.lang.Object r0 = r1.A01
            com.whatsapp.bot.home.AiHomeViewModel r0 = (com.whatsapp.bot.home.AiHomeViewModel) r0
            com.whatsapp.bot.home.AiHomeFetchService r0 = r0.A08
            java.lang.Object r4 = r0.A01(r6)
            goto L_0x17c1
        L_0x1771:
            X.85U r0 = (X.AnonymousClass85U) r0
            boolean r2 = r0 instanceof X.C145057Js
            r4 = 0
            if (r2 == 0) goto L_0x1798
            java.lang.Object r3 = r1.A01
            com.whatsapp.media.utwonet.UTwoNetViewModel r3 = (com.whatsapp.media.utwonet.UTwoNetViewModel) r3
            r1 = r0
            X.7Js r1 = (X.C145057Js) r1
            java.lang.String r2 = r1.A02
            int r1 = r1.A00
            boolean r1 = com.whatsapp.media.utwonet.UTwoNetViewModel.A00(r3, r2, r1)
            if (r1 != 0) goto L_0x1790
            java.lang.String r0 = "UTwoNetViewModel/init/Error/invalid model"
        L_0x178b:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x1999
        L_0x1790:
            X.0wl r2 = r3.A08
            com.whatsapp.media.utwonet.UTwoNetViewModel$startToObserveFetch$1$1$1 r1 = new com.whatsapp.media.utwonet.UTwoNetViewModel$startToObserveFetch$1$1$1
            r1.<init>(r3, r0, r4)
            goto L_0x17bb
        L_0x1798:
            boolean r2 = r0 instanceof X.C145067Jt
            if (r2 == 0) goto L_0x17d6
            java.lang.Object r3 = r1.A01
            com.whatsapp.media.utwonet.UTwoNetViewModel r3 = (com.whatsapp.media.utwonet.UTwoNetViewModel) r3
            boolean r1 = r3.A01
            if (r1 != 0) goto L_0x17c6
            r1 = r0
            X.7Jt r1 = (X.C145067Jt) r1
            java.lang.String r2 = r1.A02
            int r1 = r1.A00
            boolean r1 = com.whatsapp.media.utwonet.UTwoNetViewModel.A00(r3, r2, r1)
            if (r1 == 0) goto L_0x17c6
            r1 = 1
            r3.A01 = r1
            X.0wl r2 = r3.A08
            com.whatsapp.media.utwonet.UTwoNetViewModel$startToObserveFetch$1$1$2 r1 = new com.whatsapp.media.utwonet.UTwoNetViewModel$startToObserveFetch$1$1$2
            r1.<init>(r3, r0, r4)
        L_0x17bb:
            X.1OS r1 = (X.AnonymousClass1OS) r1
            java.lang.Object r4 = X.C30451dy.A00(r6, r2, r1)
        L_0x17c1:
            X.1g4 r0 = X.C31751g4.COROUTINE_SUSPENDED
            if (r4 != r0) goto L_0x1999
            return r4
        L_0x17c6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UTwoNetViewModel/init/Success/invalid model or modelAlreadyFetched = "
            r1.append(r0)
            boolean r0 = r3.A01
            java.lang.String r0 = X.AnonymousClass3MY.A0r(r1, r0)
            goto L_0x178b
        L_0x17d6:
            X.7Ju r1 = X.C145077Ju.A00
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x1999
            java.lang.String r0 = "UTwoNetViewModel/init/fetching"
            goto L_0x178b
        L_0x17e1:
            X.6Sy r0 = (X.C123056Sy) r0
            java.lang.Object r4 = r1.A01
            com.whatsapp.bot.botmemory.MemoryActivity r4 = (com.whatsapp.bot.botmemory.MemoryActivity) r4
            X.0vl r3 = r4.A08
            java.lang.Object r1 = r3.getValue()
            com.whatsapp.bot.botmemory.MemoryViewModel r1 = (com.whatsapp.bot.botmemory.MemoryViewModel) r1
            X.1G1 r1 = r1.A04
            java.lang.Object r6 = r1.getValue()
            X.6Sy r6 = (X.C123056Sy) r6
            boolean r5 = r6 instanceof X.C115755vh
            java.lang.String r1 = "toolbar"
            com.whatsapp.wds.components.topbar.WDSToolbar r2 = r4.A05
            if (r5 == 0) goto L_0x1834
            if (r2 == 0) goto L_0x192f
            X.5vh r6 = (X.C115755vh) r6
            java.util.List r1 = r6.A00
            int r1 = r1.size()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.setTitle((java.lang.CharSequence) r1)
        L_0x1810:
            boolean r1 = r0 instanceof X.C115745vg
            if (r1 == 0) goto L_0x183d
            r4.invalidateOptionsMenu()
            X.5kP r3 = r4.A02
            if (r3 == 0) goto L_0x182b
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            java.lang.Integer r1 = r3.A00
            if (r1 == r2) goto L_0x182b
            java.util.Set r1 = r3.A01
            r1.clear()
            r3.A00 = r2
            r3.notifyDataSetChanged()
        L_0x182b:
            X.5vg r0 = (X.C115745vg) r0
            int r0 = r0.A00
            r4.CNA(r0)
            goto L_0x1999
        L_0x1834:
            if (r2 == 0) goto L_0x192f
            r1 = 2131899173(0x7f123325, float:1.9433284E38)
            r2.setTitle((int) r1)
            goto L_0x1810
        L_0x183d:
            boolean r1 = r0 instanceof X.C115765vi
            if (r1 == 0) goto L_0x18d3
            r4.CEx()
            r4.invalidateOptionsMenu()
            X.5kP r5 = r4.A02
            if (r5 == 0) goto L_0x185b
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            java.lang.Integer r1 = r5.A00
            if (r1 == r2) goto L_0x185b
            java.util.Set r1 = r5.A01
            r1.clear()
            r5.A00 = r2
            r5.notifyDataSetChanged()
        L_0x185b:
            X.5kP r2 = r4.A02
            if (r2 == 0) goto L_0x1867
            r1 = r0
            X.5vi r1 = (X.C115765vi) r1
            java.util.List r1 = r1.A01
            r2.A0W(r1)
        L_0x1867:
            X.5vi r0 = (X.C115765vi) r0
            java.util.List r1 = r0.A01
            boolean r1 = r1.isEmpty()
            androidx.constraintlayout.widget.Group r2 = r4.A01
            if (r1 == 0) goto L_0x18c6
            if (r2 == 0) goto L_0x192d
            r1 = 8
            r2.setVisibility(r1)
            android.widget.ScrollView r2 = r4.A00
            if (r2 == 0) goto L_0x18f6
            r1 = 0
        L_0x187f:
            r2.setVisibility(r1)
            java.lang.Integer r0 = r0.A00
        L_0x1884:
            if (r0 == 0) goto L_0x1999
            int r2 = r0.intValue()
            r0 = 2131434744(0x7f0b1cf8, float:1.849131E38)
            android.view.View r1 = X.C110885hR.A0A(r4, r0)
            r0 = -1
            X.C108955ca.A1H(r1, r2, r0)
            java.lang.Object r2 = r3.getValue()
            com.whatsapp.bot.botmemory.MemoryViewModel r2 = (com.whatsapp.bot.botmemory.MemoryViewModel) r2
            X.1G1 r5 = r2.A04
            java.lang.Object r1 = r5.getValue()
            boolean r0 = r1 instanceof X.C115765vi
            r4 = 0
            if (r0 == 0) goto L_0x18df
            X.1G4 r3 = r2.A03
        L_0x18a8:
            java.lang.Object r2 = r3.getValue()
            java.lang.Object r1 = r5.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.bot.botmemory.MemoryScreenUiState.Loaded"
            X.C18070vi.A0z(r1, r0)
            X.5vi r1 = (X.C115765vi) r1
            java.util.List r1 = r1.A01
            X.5vi r0 = new X.5vi
            r0.<init>(r4, r1)
            boolean r0 = r3.BFK(r2, r0)
            if (r0 == 0) goto L_0x18a8
            goto L_0x1999
        L_0x18c6:
            if (r2 == 0) goto L_0x192d
            r1 = 0
            r2.setVisibility(r1)
            android.widget.ScrollView r2 = r4.A00
            if (r2 == 0) goto L_0x18f6
            r1 = 8
            goto L_0x187f
        L_0x18d3:
            boolean r1 = r0 instanceof X.C115785vk
            if (r1 == 0) goto L_0x18f9
            r4.CEx()
            X.5vk r0 = (X.C115785vk) r0
            java.lang.Integer r0 = r0.A00
            goto L_0x1884
        L_0x18df:
            boolean r0 = r1 instanceof X.C115785vk
            if (r0 == 0) goto L_0x1999
            X.1G4 r2 = r2.A03
        L_0x18e5:
            java.lang.Object r1 = r2.getValue()
            X.5vk r0 = new X.5vk
            r0.<init>(r4)
            boolean r0 = r2.BFK(r1, r0)
            if (r0 == 0) goto L_0x18e5
            goto L_0x1999
        L_0x18f6:
            java.lang.String r1 = "emptyList"
            goto L_0x192f
        L_0x18f9:
            boolean r1 = r0 instanceof X.C115775vj
            if (r1 == 0) goto L_0x191a
            r4.invalidateOptionsMenu()
            X.5kP r2 = r4.A02
            if (r2 == 0) goto L_0x1999
            java.lang.Integer r1 = X.AnonymousClass00R.A01
        L_0x1906:
            java.lang.Integer r0 = r2.A00
            if (r0 == r1) goto L_0x1999
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x1913
            java.util.Set r0 = r2.A01
            r0.clear()
        L_0x1913:
            r2.A00 = r1
            r2.notifyDataSetChanged()
            goto L_0x1999
        L_0x191a:
            boolean r0 = r0 instanceof X.C115755vh
            if (r0 == 0) goto L_0x1928
            r4.invalidateOptionsMenu()
            X.5kP r2 = r4.A02
            if (r2 == 0) goto L_0x1999
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x1906
        L_0x1928:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x192d:
            java.lang.String r1 = "nonEmptyList"
        L_0x192f:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        L_0x1934:
            boolean r2 = r6 instanceof X.C147437Td
            if (r2 == 0) goto L_0x1956
            r7 = r6
            X.7Td r7 = (X.C147437Td) r7
            int r4 = r7.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x1956
            int r4 = r4 - r3
            r7.label = r4
        L_0x1946:
            java.lang.Object r6 = r7.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r7.label
            r5 = 1
            if (r2 == 0) goto L_0x1960
            if (r2 == r5) goto L_0x195c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x1956:
            X.7Td r7 = new X.7Td
            r7.<init>(r1, r6)
            goto L_0x1946
        L_0x195c:
            X.C30691eM.A01(r6)
            goto L_0x1999
        L_0x1960:
            X.C30691eM.A01(r6)
            java.lang.Object r3 = r1.A01
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x1971:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1985
            java.lang.Object r0 = r1.next()
            X.9uS r0 = (X.C196099uS) r0
            X.9tt r0 = r0.A00()
            r2.add(r0)
            goto L_0x1971
        L_0x1985:
            r7.label = r5
            java.lang.Object r0 = r3.BJt(r2, r7)
        L_0x198b:
            if (r0 != r4) goto L_0x1999
            return r4
        L_0x198e:
            boolean r2 = X.AnonymousClass000.A1Y(r0)
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            X.C123656Vh.A00(r0, r2)
        L_0x1999:
            X.1Wu r4 = X.C27621Wu.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147277Sn.BJt(java.lang.Object, X.1dr):java.lang.Object");
    }
}
