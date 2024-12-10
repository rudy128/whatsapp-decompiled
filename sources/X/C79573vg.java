package X;

import android.view.MenuItem;
import com.google.android.material.chip.Chip;
import com.whatsapp.community.communitymedia.CommunityMediaActivity;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3vg  reason: invalid class name and case insensitive filesystem */
public class C79573vg extends C91124fB {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79573vg(AnonymousClass1FY r2, AnonymousClass5ZZ r3, C107265Za r4, C87564Wb r5, C18000vb r6, AnonymousClass1KW r7, C18030ve r8, Object obj, int i) {
        super(r2, r3, r4, r5, r6, r7, r8, (Integer) null);
        this.A00 = i;
        this.A01 = obj;
        C18070vi.A0p(r8, r7, r6);
        C18070vi.A0d(r5, 7);
    }

    public void BLL() {
        MessageSelectionViewModel messageSelectionViewModel;
        switch (this.A00) {
            case 0:
                C73373Vg A0R = AnonymousClass3Ma.A0R((CommunityMediaActivity) this.A01);
                AnonymousClass1G4 r2 = A0R.A0q;
                do {
                } while (!r2.BFK(r2.getValue(), C17880vN.A13()));
                A0R.A0V();
                return;
            case 1:
                messageSelectionViewModel = ((MediaAlbumActivity) this.A01).A09;
                break;
            case 2:
                messageSelectionViewModel = ((C79333vF) this.A01).A07;
                break;
            case 3:
                messageSelectionViewModel = (MessageSelectionViewModel) ((ReportToAdminMessagesActivity) this.A01).A0D.getValue();
                break;
            case 4:
                AnonymousClass4aY r22 = (AnonymousClass4aY) this.A01;
                r22.A2J.A0T();
                Chip chip = r22.A0j;
                if (chip != null) {
                    chip.setVisibility(8);
                    r22.A0D.setVisibility(0);
                    return;
                }
                return;
            case 5:
                ((MediaGalleryActivity) this.A01).BLL();
                return;
            case 6:
                AnonymousClass02B r0 = ((MyStatusesActivity) this.A01).A00;
                if (r0 != null) {
                    r0.A05();
                    return;
                }
                return;
            default:
                ((StorageUsageGalleryActivity) this.A01).BLL();
                return;
        }
        messageSelectionViewModel.A0T();
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r14) {
        if (4 - this.A00 == 0) {
            AnonymousClass4aY r9 = (AnonymousClass4aY) this.A01;
            AnonymousClass4S9 selectedMessages = r9.A2Q.getSelectedMessages();
            if (selectedMessages == null) {
                return true;
            }
            HashMap hashMap = selectedMessages.A03;
            if (hashMap.isEmpty()) {
                return true;
            }
            C87644Wj r5 = r9.A2C;
            int itemId = menuItem.getItemId();
            C81553zQ A002 = C87644Wj.A00(selectedMessages, r9.A3R, 2);
            int i = 2;
            if (itemId != 2131432607) {
                int i2 = 3;
                if (itemId != 8) {
                    i = 4;
                    if (itemId != 21) {
                        i = 5;
                        if (itemId != 1) {
                            if (itemId == 12) {
                                i = 6;
                            } else if (itemId == 2 || itemId == 3) {
                                i = 7;
                            } else {
                                i = 8;
                                if (itemId != 5) {
                                    i = 9;
                                    if (itemId != 15) {
                                        i2 = 11;
                                        if (itemId == 11) {
                                            i = 10;
                                        } else if (itemId != 4) {
                                            i = 1;
                                            if (itemId == 9) {
                                                i = 12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
            }
            A002.A04 = Integer.valueOf(i);
            r5.A00.CC7(A002);
            int itemId2 = menuItem.getItemId();
            if (itemId2 == 2 || itemId2 == 3) {
                AnonymousClass1FY A0P = AnonymousClass3MW.A0P(r9);
                AnonymousClass11C systemServices = r9.A2Q.getSystemServices();
                AnonymousClass1FY A0Q = AnonymousClass3MW.A0Q(r9);
                int i3 = 2131892099;
                if (itemId2 == 2) {
                    i3 = 2131892095;
                }
                AnonymousClass1Y5.A00(A0P, systemServices, A0Q.getString(i3));
            }
            if (hashMap.size() == 1 && (itemId2 == 5 || itemId2 == 8)) {
                Iterator it = selectedMessages.A00().iterator();
                if (it.hasNext()) {
                    A4u a4u = (A4u) r9.A4z.get();
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    int i4 = 1;
                    if (itemId2 != 5) {
                        if (itemId2 == 8) {
                            i4 = 3;
                        }
                    }
                    A4u.A01(a4u, A0Y, i4);
                }
            }
        }
        return super.Bks(menuItem, r14);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79573vg(AnonymousClass1FY r11, AnonymousClass5ZZ r12, C107265Za r13, C87564Wb r14, AnonymousClass4aY r15, C18000vb r16, AnonymousClass1KW r17, C18030ve r18, Integer num) {
        super(r11, r12, r13, r14, r16, r17, r18, num);
        this.A00 = 4;
        this.A01 = r15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79573vg(X.C95134lk r11, X.C18000vb r12, X.AnonymousClass1KW r13, X.C18030ve r14, com.whatsapp.status.playback.MyStatusesActivity r15, X.C79463vT r16, X.C79663vp r17) {
        /*
            r10 = this;
            r0 = 6
            r1 = r10
            r10.A00 = r0
            r2 = r15
            r10.A01 = r15
            r8 = r14
            X.C18070vi.A0b(r14)
            r7 = r13
            X.C18070vi.A0b(r13)
            r6 = r12
            X.C18070vi.A0b(r12)
            r5 = r17
            X.C18070vi.A0b(r5)
            r9 = 0
            r4 = r11
            r3 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79573vg.<init>(X.4lk, X.0vb, X.1KW, X.0ve, com.whatsapp.status.playback.MyStatusesActivity, X.3vT, X.3vp):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79573vg(com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity r11, X.C79433vQ r12, X.C95134lk r13, X.C79603vj r14, X.C18000vb r15, X.AnonymousClass1KW r16, X.C18030ve r17) {
        /*
            r10 = this;
            r0 = 3
            r1 = r10
            r10.A00 = r0
            r2 = r11
            r10.A01 = r11
            r8 = r17
            X.C18070vi.A0b(r8)
            r7 = r16
            X.C18070vi.A0b(r7)
            r6 = r15
            X.C18070vi.A0b(r15)
            r5 = r14
            X.C18070vi.A0b(r14)
            r9 = 0
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79573vg.<init>(com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity, X.3vQ, X.4lk, X.3vj, X.0vb, X.1KW, X.0ve):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79573vg(com.whatsapp.community.communitymedia.CommunityMediaActivity r11, X.C79413vO r12, X.C79623vl r13, X.C95134lk r14, X.C18000vb r15, X.AnonymousClass1KW r16, X.C18030ve r17) {
        /*
            r10 = this;
            r0 = 0
            r1 = r10
            r10.A00 = r0
            r2 = r11
            r10.A01 = r11
            r8 = r17
            X.C18070vi.A0b(r8)
            r7 = r16
            X.C18070vi.A0b(r7)
            r6 = r15
            X.C18070vi.A0b(r15)
            r9 = 0
            r3 = r12
            r5 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79573vg.<init>(com.whatsapp.community.communitymedia.CommunityMediaActivity, X.3vO, X.3vl, X.4lk, X.0vb, X.1KW, X.0ve):void");
    }
}
