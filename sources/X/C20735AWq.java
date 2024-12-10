package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

/* renamed from: X.AWq  reason: case insensitive filesystem */
public class C20735AWq implements C23691Hg {
    public final int A00;

    public C20735AWq(int i) {
        this.A00 = i;
    }

    public static void A00(AnonymousClass10T r1, int i) {
        r1.notifyAllObservers(new C20735AWq(i));
    }

    public final void CGE(Object obj) {
        Set emptySet;
        C198589ya r3;
        switch (this.A00) {
            case 0:
                C20564APy aPy = (C20564APy) ((B5B) obj);
                ((AnonymousClass120) AnonymousClass3MW.A0c(aPy.A02.A01).A01(AnonymousClass120.class)).A09(aPy);
                C179319Hm r1 = aPy.A01;
                if (r1 == C179319Hm.PAIRING) {
                    BCS bcs = aPy.A03;
                    if (bcs != null) {
                        bcs.Bia(9);
                    }
                } else if (r1 == C179319Hm.UNPAIRING && (r3 = aPy.A00) != null) {
                    C198589ya.A00(r3, C17890vO.A0L(), (String) null, 3);
                }
                aPy.A04.resumeWith(new C184379ar(AnonymousClass9I9.UNKNOWN, true));
                return;
            case 1:
                ((C26181Rd) obj).BvT();
                return;
            case 2:
                ((C26181Rd) obj).BvU();
                return;
            case 3:
                ((C26181Rd) obj).BvV();
                return;
            case 4:
                ((C26181Rd) obj).BvS();
                return;
            case 5:
                ((C26181Rd) obj).BvR();
                return;
            case 6:
                ((C37241pC) obj).BxA();
                return;
            case 7:
                ((C37241pC) obj).BxB();
                return;
            case 8:
                C29501cO r14 = (C29501cO) obj;
                C18070vi.A0d(r14, 0);
                r14.A00();
                return;
            case 9:
                ((C36851oZ) obj).ByW();
                return;
            case 10:
                ((C36851oZ) obj).BmD();
                return;
            case 11:
                ((C36851oZ) obj).C9a();
                return;
            case 12:
                ((C36851oZ) obj).Bsb();
                return;
            case 13:
                ((C36851oZ) obj).By6();
                return;
            case 14:
                ((C36851oZ) obj).Bxy();
                return;
            case 16:
                ((C36851oZ) obj).BmL();
                return;
            case 17:
                ((C36851oZ) obj).BmN();
                return;
            case 18:
                C180579Nc r142 = (C180579Nc) obj;
                C18070vi.A0d(r142, 0);
                r142.A00();
                return;
            case 19:
                ((BDF) obj).Bn8();
                return;
            case 20:
                ((BDF) obj).Bnc();
                return;
            case 21:
                AnonymousClass4WT r143 = (AnonymousClass4WT) obj;
                r143.A00.runOnUiThread(new C98764rg((Object) r143, 31));
                return;
            case 22:
                throw AnonymousClass000.A0s("onSyncdDisabled");
            case 23:
                C26811To r144 = (C26811To) obj;
                AnonymousClass11S r2 = r144.A07;
                C17960vV.A0H(!r2.A0N(), "sync-manager/onUnarchiveChatsSettingChanged/only primary can create this mutation");
                Log.i("sync-manager/onUnarchiveChatsSettingChanged");
                AnonymousClass8mz r12 = (AnonymousClass8mz) ((C58862lN) r144.A0a.get()).A00("setting_unarchiveChats");
                if (r12 == null || AnonymousClass11S.A00(r2) == null || !r144.A0T()) {
                    Log.i("sync-manager/onUnarchiveChatsSettingChanged/emptySet");
                    emptySet = Collections.emptySet();
                } else {
                    emptySet = r144.A0D(r12.A0K());
                }
                r144.A0R(emptySet);
                return;
            case 24:
                BCU bcu = (BCU) obj;
                C18070vi.A0d(bcu, 0);
                bcu.BmT();
                return;
            case 25:
                BCU bcu2 = (BCU) obj;
                C18070vi.A0d(bcu2, 0);
                bcu2.Bqa();
                return;
            case 27:
                ((C29951d9) obj).Brl();
                return;
            case 28:
                ((BDR) obj).C1W();
                return;
            case 29:
                ((BDR) obj).Bno();
                return;
            case 30:
                ((BDR) obj).Bvm();
                return;
            case 31:
                ((BDR) obj).Bnp();
                return;
            case 32:
                ((C22561BCu) obj).Bno();
                return;
            case 33:
                ((C22561BCu) obj).Btc();
                return;
            case 34:
                ((C22561BCu) obj).Bte();
                return;
            case 35:
                ((C22561BCu) obj).Bnp();
                return;
            case 36:
                BDJ bdj = (BDJ) obj;
                C18070vi.A0d(bdj, 3);
                ChatTransferViewModel chatTransferViewModel = ((AW8) bdj).A00;
                A7P a7p = chatTransferViewModel.A0H;
                a7p.A06("completed_screen_click");
                if (chatTransferViewModel.A04) {
                    C17880vN.A1B(C19830z4.A00(chatTransferViewModel.A0I.A00), "chat_transfer_intent_to_migrate_last_set_timestamp");
                } else {
                    a7p.A04(15);
                    C198189xw A04 = ChatTransferViewModel.A04(chatTransferViewModel);
                    if (A04.A00) {
                        AnonymousClass8BR.A0q(A04.A01).A0J("chat_transfer_complete", "chat_transfer_complete_landing", "view");
                    }
                    chatTransferViewModel.A0R.get();
                    C24521Kq r0 = C24521Kq.$redex_init_class;
                    C138296wq.A00(new AW9(), chatTransferViewModel.A0I, new AnonymousClass1NV(new Random(), 3, 200, 1000), false);
                }
                chatTransferViewModel.A0d(5);
                return;
            case 37:
                ((C180609Nf) obj).A00();
                return;
            case 38:
                A5V a5v = ((PaymentSettingsFragment) ((AXA) ((B5Q) obj)).A01).A0g;
                if (a5v != null) {
                    a5v.A04();
                    return;
                }
                return;
            case 39:
                C20759AXo aXo = (C20759AXo) ((B5S) obj);
                switch (aXo.A00) {
                    case 2:
                        IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity = (IndiaUpiMandateHistoryActivity) aXo.A01;
                        indiaUpiMandateHistoryActivity.A05.A04("payment transaction deleted");
                        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel = indiaUpiMandateHistoryActivity.A01;
                        C21427Aju.A00(indiaUpiMandateHistoryViewModel.A06, indiaUpiMandateHistoryViewModel, 43);
                        return;
                    case 3:
                        ((PaymentTransactionHistoryActivity) aXo.A01).A4b();
                        return;
                    case 5:
                        ((AXQ) aXo.A01).A01(false);
                        return;
                    default:
                        return;
                }
            case 41:
                AnonymousClass10T r145 = (AnonymousClass10T) obj;
                C18070vi.A0d(r145, 0);
                A00(r145, 41);
                return;
            case 42:
                ((C34191k5) obj).BnA();
                return;
            case 43:
                ((AnonymousClass1IV) obj).Bmn();
                return;
            case 44:
                ((AnonymousClass1IV) obj).C5e();
                return;
            case 45:
                ((AnonymousClass1M0) obj).A00.A0H();
                return;
            default:
                return;
        }
    }
}
