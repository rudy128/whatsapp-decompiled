package X;

import android.content.ContentValues;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.308  reason: invalid class name */
public final class AnonymousClass308 implements C72113Kr {
    public final C18030ve A00;
    public final C26301Rp A01;
    public final AnonymousClass1LW A02;
    public final AnonymousClass1CJ A03;

    public void Bqf() {
        boolean z;
        int A022;
        String obj;
        int A002 = C18020vd.A00(C18040vf.A02, this.A00, 8586);
        if (A002 == 0) {
            obj = "LidChatCtwaBackfillDailyCron Skipped cron job, AB prop is off.";
        } else {
            C26301Rp r4 = this.A01;
            if (A002 > C20099A7c.A01(r4.A0K("LID_CHAT_BACKFILL_STATUS"), 0)) {
                Log.i("LidChatCtwaBackfillDailyCron running backfill job");
                AnonymousClass1CJ r6 = this.A03;
                ArrayList A13 = AnonymousClass000.A13();
                ConcurrentHashMap A012 = AnonymousClass1CJ.A01(r6);
                synchronized (r6) {
                    z = r6.A00;
                }
                if (z) {
                    Iterator A0i = C17890vO.A0i(A012);
                    while (A0i.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A0i);
                        C29691ci r1 = (C29691ci) A16.getValue();
                        if (C22971Dz.A0T((Jid) A16.getKey()) && r1.A0b == null && !r1.A0s) {
                            A13.add(r1);
                        }
                    }
                    AnonymousClass1LW r7 = this.A02;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("ChatStore/backfillAllLidChats - receiving:");
                    C17900vP.A0o(A10, A13.size());
                    if (A13.size() == 0) {
                        A022 = 0;
                    } else {
                        List<C29691ci> subList = A13.subList(0, Math.min(999, A13.size()));
                        ArrayList A14 = AnonymousClass000.A14(subList);
                        for (C29691ci A09 : subList) {
                            A14.add(A09.A09().toString());
                        }
                        C28791au A05 = r7.A03.A05();
                        try {
                            AnonymousClass1Ez r12 = new AnonymousClass1Ez("ChatStore/backfillAllLidChats");
                            ContentValues A08 = C17880vN.A08();
                            C49502Qs r62 = C49502Qs.CTWA;
                            A08.put("chat_origin", r62.toString());
                            C23141Ev r11 = ((C28801av) A05).A02;
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("_id IN");
                            A022 = r11.A02(A08, "chat", AnonymousClass000.A0y(AnonymousClass1H2.A00(A14.size()), A102), "backfillAllLidChats", C17890vO.A1b(A14, A14.size()));
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("ChatStore/backfillAllLidChats - DB Job - time spent:");
                            C17890vO.A16(A103, r12.A02());
                            for (C29691ci r13 : subList) {
                                if (r13.A0b == null) {
                                    r13.A0b = r62;
                                }
                            }
                            Log.i("ChatStore/backfillAllLidChats - cache updated");
                            A05.close();
                        } catch (Throwable th) {
                            AnonymousClass0DT.A00(th, th);
                            throw th;
                        }
                    }
                    if (A022 == A13.size()) {
                        Log.i("LidChatCtwaBackfillDailyCron all chats were updated");
                        C26301Rp.A04(r4, "LID_CHAT_BACKFILL_STATUS", String.valueOf(A002));
                        return;
                    }
                    StringBuilder A104 = AnonymousClass000.A10();
                    A104.append("LidChatCtwaBackfillDailyCron not all chats were updated, ");
                    A104.append(A022);
                    C17890vO.A14(" out of ", A104, A13);
                    obj = A104.toString();
                } else {
                    throw AnonymousClass000.A0n("ChatsCache/getLidChatsWithoutOrigin: chat haven't initialized");
                }
            } else {
                return;
            }
        }
        Log.i(obj);
    }

    public AnonymousClass308(AnonymousClass1LW r1, AnonymousClass1CJ r2, C18030ve r3, C26301Rp r4) {
        C18070vi.A0s(r1, r4, r3, r2);
        this.A02 = r1;
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r2;
    }
}
