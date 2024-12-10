package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.chatlock.ChatLockSearchManager$tryUnlockLockedChats$1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4fJ  reason: invalid class name and case insensitive filesystem */
public class C91204fJ implements C15950rT {
    public final int A00;
    public final Object A01;

    public final Object apply(Object obj) {
        String str;
        String str2;
        String str3;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                AnonymousClass3T3 r3 = (AnonymousClass3T3) this.A01;
                C24887COf cOf = (C24887COf) obj2;
                Collection collection = (Collection) cOf.A01;
                C42621yT r4 = cOf.A00;
                try {
                    r4.A02();
                    ArrayList A13 = AnonymousClass000.A13();
                    AnonymousClass1M9 r1 = r3.A05;
                    ArrayList A132 = AnonymousClass000.A13();
                    Iterator A0i = C17890vO.A0i(r1.A0P(new HashSet(collection)));
                    while (A0i.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A0i);
                        if (!C22971Dz.A0d((Jid) A16.getKey())) {
                            str2 = "ContactStruct/constructContactsFromUserJid chat JID not an instance of user JID";
                        } else if (A16.getValue() == null) {
                            str2 = "ContactStruct/constructContactsFromUserJid null WaContact";
                        } else {
                            UserJid userJid = (UserJid) A16.getKey();
                            AnonymousClass73C r8 = new AnonymousClass73C();
                            r8.A0A.A01 = ((AnonymousClass1E7) A16.getValue()).A0K();
                            r8.A03(userJid, AnonymousClass17K.A05(userJid), (String) null, 2, true);
                            A132.add(r8);
                        }
                        Log.w(str2);
                    }
                    Iterator it = A132.iterator();
                    while (it.hasNext()) {
                        AnonymousClass73C r5 = (AnonymousClass73C) it.next();
                        r4.A02();
                        try {
                            str = new C139136yH(r3.A04, r3.A06).A01(r5);
                        } catch (C33281iZ e) {
                            Log.e("ContactsAttachmentSelectorViewModel/ Could not create VCard", new AnonymousClass2RP(e));
                            str = null;
                        }
                        if (str != null) {
                            A13.add(str);
                        }
                    }
                    return A13;
                } catch (AnonymousClass1QC unused) {
                    return AnonymousClass000.A13();
                }
            case 1:
                C77843ra r0 = (C77843ra) this.A01;
                C86844Th r11 = (C86844Th) obj2;
                AnonymousClass1FR r2 = r0.A03;
                r2.CEx();
                AnonymousClass1EC r12 = r0.A0J;
                DialogFragment A002 = AnonymousClass4GA.A00(r0.A09, r12, false);
                if (A002 == null) {
                    Set singleton = Collections.singleton(r12);
                    int i = r11.A00;
                    AnonymousClass1EC r32 = r11.A01;
                    int i2 = 0;
                    if (r32 != null) {
                        i2 = 2;
                    }
                    A002 = C83754Gn.A00(r32, (String) null, singleton, i, i2, false, true);
                }
                r2.CMk(A002, (String) null);
                return null;
            case 2:
                AnonymousClass3Ut r6 = (AnonymousClass3Ut) this.A01;
                C86844Th r112 = (C86844Th) obj2;
                boolean A1Z = C72453Mb.A1Z(r112);
                AnonymousClass1CJ r02 = r6.A03;
                AnonymousClass1EC r42 = r6.A08;
                boolean A0R = r02.A0R(r42);
                AnonymousClass4ZP.A00(r6.A05, r6.A06, r42, A1Z ? 1 : 0, C72453Mb.A03(A0R ? 1 : 0));
                if (C72463Mc.A1S(r6.A07, r42, r6.A09)) {
                    str3 = "group_fmx_card_leave";
                } else {
                    str3 = "group_fmx_card_leave_non_suspicious";
                }
                AnonymousClass1DS r13 = r6.A01;
                C18070vi.A0z(r13, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.ExitGroupButtonViewModel.ExitGroupFlowUiState>");
                r13.A0E(new AnonymousClass4UZ(r112, r42, str3, A0R));
                return null;
            case 3:
                C86844Th r113 = (C86844Th) obj2;
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) ((C825148g) this.A01).A01;
                groupChatInfoActivity.CEx();
                Set singleton2 = Collections.singleton(groupChatInfoActivity.A1K);
                int i3 = r113.A00;
                AnonymousClass1EC r62 = r113.A01;
                int i4 = 0;
                if (r62 != null) {
                    i4 = 2;
                }
                groupChatInfoActivity.CMk(C83754Gn.A00(r62, (String) null, singleton2, i3, i4, false, true), (String) null);
                return null;
            default:
                C25021CTx cTx = (C25021CTx) this.A01;
                C24887COf cOf2 = (C24887COf) obj2;
                C18070vi.A0h(cTx, cOf2);
                C34141jz r9 = (C34141jz) cOf2.A01;
                C98494rF A003 = C98494rF.A00();
                try {
                    if (!AnonymousClass3MW.A0Y(cTx.A03).A0K()) {
                        return A003.element;
                    }
                    C42621yT r22 = cOf2.A00;
                    r22.A02();
                    if (r9.A02 != 0 || r9.A03 != null || r9.A06 != null) {
                        return null;
                    }
                    String A02 = r9.A02();
                    C18070vi.A0X(A02);
                    if (!C18070vi.A18(((ChatLockPasscodeManager) cTx.A04.get()).A02(A02), C76923oo.A00)) {
                        return null;
                    }
                    r22.A02();
                    AnonymousClass4GT.A00(AnonymousClass1OR.A00, new ChatLockSearchManager$tryUnlockLockedChats$1(r9, cTx, cOf2, (C30391dr) null, A003));
                    return A003.element;
                } catch (AnonymousClass1QC unused2) {
                    return null;
                }
        }
    }

    public C91204fJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
