package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.170  reason: invalid class name */
public final class AnonymousClass170 implements C216816z {
    public float A00 = 0.4f;
    public AnonymousClass3uK A01;
    public boolean A02;
    public boolean A03;
    public final Comparator A04 = new C147027Rn(8);
    public final HashMap A05 = new HashMap();
    public final List A06 = new ArrayList();

    public void C4M() {
        AnonymousClass3uK r3;
        AnonymousClass4VQ r0;
        AnonymousClass21Y fMessage;
        AnonymousClass205 r02;
        C132316ma r03;
        if (this.A02 && this.A03) {
            List list = this.A06;
            list.clear();
            HashMap hashMap = this.A05;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((C132316ma) entry.getValue()).A00 >= this.A00) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            list.addAll(linkedHashMap.entrySet());
            C29391cC.A0H(list, this.A04);
            Map.Entry entry2 = (Map.Entry) C29431cG.A0c(list);
            if (entry2 == null || (r03 = (C132316ma) entry2.getValue()) == null) {
                r3 = null;
            } else {
                r3 = (AnonymousClass3uK) r03.A02.get();
            }
            AnonymousClass3uK r4 = this.A01;
            String str = null;
            if (r4 != null) {
                String str2 = r4.getFMessage().A0v.A01;
                if (!(r3 == null || (fMessage = r3.getFMessage()) == null || (r02 = fMessage.A0v) == null)) {
                    str = r02.A01;
                }
                if (!C18070vi.A18(str2, str) && (r0 = r4.A06) != null) {
                    r0.A01();
                }
            }
            if (r3 != null) {
                AnonymousClass4VQ r2 = r3.A06;
                if (r2 != null) {
                    C827349n r1 = r2.A0E;
                    if (!r1.A0a()) {
                        if (r1.A0e()) {
                            r2.hashCode();
                            r1.A0K();
                        } else {
                            r2.A02();
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ConversationPlaybackManager/playOrResumeMainVisibleVideoInViewpoint/couldn't attemptVideoPlayback() because conversationRowVideoAutoPlay is null for messageId=");
                    sb.append(r3.getFMessage().A0v.A01);
                    Log.e(sb.toString());
                }
            }
            this.A01 = r3;
            this.A02 = false;
        }
    }
}
