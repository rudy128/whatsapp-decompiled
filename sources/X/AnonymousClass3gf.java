package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.Me;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;
import com.whatsapp.calling.favorite.FavoritePicker;
import com.whatsapp.calling.favorite.FavoritePicker$onBlockedItemPressed$1;
import com.whatsapp.calling.favorite.FavoritePickerViewModel;
import com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1;
import com.whatsapp.community.CommunityAdminPickerActivity;
import com.whatsapp.community.LinkExistingGroups;
import com.whatsapp.community.SelectCommunityForGroupActivity;
import com.whatsapp.community.SelectCommunityForGroupViewModel;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.contact.picker.BroadcastListMembersSelector;
import com.whatsapp.contact.picker.ContactsAttachmentSelector;
import com.whatsapp.contact.picker.SelectedContactsList;
import com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$onSubmitRequested$1;
import com.whatsapp.conversation.EditBroadcastRecipientsSelector;
import com.whatsapp.favorites.picker.FavoritesPickerActivity;
import com.whatsapp.favorites.picker.FavoritesPickerViewModel;
import com.whatsapp.favorites.picker.FavoritesPickerViewModel$addFavorites$1;
import com.whatsapp.group.EditGroupAdminsSelector;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.lists.picker.ListsContactPickerActivity;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity;
import com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3gf  reason: invalid class name */
public abstract class AnonymousClass3gf extends C74803cp implements C108435bh, C23351Fr {
    public ViewGroup A00;
    public BaseAdapter A01;
    public ListView A02;
    public AnonymousClass1YQ A03;
    public C36271nc A04;
    public C72043Kk A05;
    public AnonymousClass1M9 A06;
    public C24671Lf A07;
    public C24921Me A08;
    public C27201Vd A09;
    public SelectedContactsList A0A;
    public AnonymousClass733 A0B;
    public C37311pJ A0C;
    public C825548v A0D;
    public C219217x A0E;
    public C18000vb A0F;
    public AnonymousClass129 A0G;
    public WDSSearchBar A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public String A0R;
    public ArrayList A0S;
    public List A0T = AnonymousClass000.A13();
    public List A0U = AnonymousClass000.A13();
    public List A0V = AnonymousClass000.A13();
    public List A0W;
    public boolean A0X = false;
    public boolean A0Y = true;
    public boolean A0Z;
    public MenuItem A0a;
    public ViewGroup A0b;
    public C826949j A0c;
    public AnonymousClass499 A0d;
    public C37451pZ A0e;
    public final AnonymousClass00H A0f = C99054sC.A00(this, 2);
    public final AnonymousClass00H A0g = C99054sC.A00(this, 1);
    public final ArrayList A0h = AnonymousClass000.A13();
    public final List A0i = AnonymousClass000.A13();
    public final C23581Gv A0j = new C94164k9(this, 9);
    public final C28741ap A0k = new C95414mC(this, 6);

    public static void A10(AbstractCollection abstractCollection, List list) {
        C18070vi.A0d(list, 1);
        abstractCollection.add(new AnonymousClass4XO(list, 2131888810, false, true));
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [X.3rR] */
    /* JADX WARNING: type inference failed for: r1v15, types: [X.3rS] */
    /* JADX WARNING: type inference failed for: r1v18, types: [X.3rO] */
    /* JADX WARNING: type inference failed for: r1v22, types: [X.3rQ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4r() {
        /*
            r15 = this;
            r11 = r15
            X.49j r0 = r15.A0c
            r2 = 1
            if (r0 == 0) goto L_0x0009
            r0.A0B(r2)
        L_0x0009:
            X.499 r1 = r15.A0d
            r0 = 0
            if (r1 == 0) goto L_0x0013
            r1.A0B(r2)
            r15.A0d = r0
        L_0x0013:
            X.48v r1 = r15.A0D
            if (r1 == 0) goto L_0x001c
            r1.A0B(r2)
            r15.A0D = r0
        L_0x001c:
            boolean r1 = r15 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r1 == 0) goto L_0x0053
            r3 = r11
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity r3 = (com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity) r3
            X.00H r1 = r3.A04
            if (r1 == 0) goto L_0x0106
            java.lang.Object r5 = X.C18070vi.A0E(r1)
            X.1CJ r5 = (X.AnonymousClass1CJ) r5
            X.1Me r2 = r3.A08
            X.C18070vi.A0W(r2)
            X.0vb r4 = r3.A0F
            X.C18070vi.A0W(r4)
            X.00H r1 = r3.A06
            if (r1 == 0) goto L_0x0103
            java.lang.Object r6 = X.C18070vi.A0E(r1)
            X.126 r6 = (X.AnonymousClass126) r6
            java.util.List r7 = r3.A0i
            X.C18070vi.A0W(r7)
            X.3rQ r1 = new X.3rQ
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x004b:
            r15.A0c = r1
            X.10I r0 = r15.A05
            X.C17890vO.A0u(r1, r0)
            return
        L_0x0053:
            boolean r1 = r15 instanceof X.C77073pJ
            if (r1 == 0) goto L_0x007d
            r5 = r11
            X.3pJ r5 = (X.C77073pJ) r5
            X.4J3 r1 = r5.A00
            if (r1 == 0) goto L_0x0100
            java.util.List r7 = r5.A0i
            X.C18070vi.A0W(r7)
            X.1K2 r0 = r1.A00
            X.10E r0 = r0.A01
            X.1M9 r3 = X.AnonymousClass10E.A4z(r0)
            X.1kb r2 = X.AnonymousClass3MZ.A0b(r0)
            X.1Me r4 = X.AnonymousClass3MZ.A0g(r0)
            X.0vb r6 = X.AnonymousClass10E.A6Q(r0)
            X.3rO r1 = new X.3rO
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x004b
        L_0x007d:
            boolean r1 = r15 instanceof com.whatsapp.community.LinkExistingGroups
            if (r1 == 0) goto L_0x00a0
            r4 = r11
            com.whatsapp.community.LinkExistingGroups r4 = (com.whatsapp.community.LinkExistingGroups) r4
            X.0ve r8 = r4.A0E
            X.1CJ r6 = r4.A02
            if (r6 == 0) goto L_0x0106
            X.18O r2 = r4.A06
            X.1Me r3 = r4.A08
            X.0vb r5 = r4.A0F
            X.126 r9 = r4.A05
            if (r9 == 0) goto L_0x0103
            X.1MZ r7 = r4.A04
            if (r7 == 0) goto L_0x010c
            java.util.List r10 = r4.A0i
            X.3rS r1 = new X.3rS
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x004b
        L_0x00a0:
            boolean r1 = r15 instanceof X.C77053p5
            if (r1 == 0) goto L_0x00d5
            r5 = r11
            X.3p5 r5 = (X.C77053p5) r5
            X.4Iu r1 = r5.A00
            if (r1 == 0) goto L_0x0109
            X.0vl r0 = r5.A03
            X.1EC r8 = X.AnonymousClass3MX.A0p(r0)
            java.util.List r9 = r5.A0i
            X.C18070vi.A0W(r9)
            X.1K2 r0 = r1.A00
            X.10E r0 = r0.A01
            X.11S r2 = X.AnonymousClass10E.A17(r0)
            X.1M9 r3 = X.AnonymousClass10E.A4z(r0)
            X.1MZ r7 = X.AnonymousClass3MY.A0V(r0)
            X.1Me r4 = X.AnonymousClass3MZ.A0g(r0)
            X.0vb r6 = X.AnonymousClass10E.A6Q(r0)
            X.3rR r1 = new X.3rR
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x004b
        L_0x00d5:
            X.1M9 r9 = r15.A06
            X.1Me r10 = r15.A08
            X.0vb r12 = r15.A0F
            java.util.List r3 = r15.A0i
            boolean r0 = r15 instanceof com.whatsapp.group.EditGroupAdminsSelector
            if (r0 == 0) goto L_0x00eb
            r14 = 0
        L_0x00e2:
            X.3rP r1 = new X.3rP
            r8 = r1
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x004b
        L_0x00eb:
            X.00H r0 = r15.A0O
            java.lang.Object r0 = r0.get()
            X.2bJ r0 = (X.C52682bJ) r0
            X.0ve r2 = r0.A00
            r1 = 3764(0xeb4, float:5.274E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r14 = r0 ^ 1
            goto L_0x00e2
        L_0x0100:
            java.lang.String r1 = "loadMyCommunitiesTaskFactory"
            goto L_0x010e
        L_0x0103:
            java.lang.String r1 = "groupChatManager"
            goto L_0x010e
        L_0x0106:
            java.lang.String r1 = "chatsCache"
            goto L_0x010e
        L_0x0109:
            java.lang.String r1 = "loadCommunityAdminsTaskFactory"
            goto L_0x010e
        L_0x010c:
            java.lang.String r1 = "groupParticipantsManager"
        L_0x010e:
            X.C18070vi.A11(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3gf.A4r():void");
    }

    public void A4w(View view, View view2, View view3, View view4) {
        view4.setVisibility(0);
        view.setVisibility(8);
        view2.setVisibility(8);
        view3.setVisibility(0);
    }

    public void A57(List list) {
        this.A0d = null;
        if (this.A0Z) {
            CRZ();
        }
        this.A0U.clear();
        C825548v r1 = new C825548v(this, list);
        this.A0D = r1;
        C17890vO.A0u(r1, this.A05);
    }

    public void A58(List list) {
        List list2;
        this.A0c = null;
        this.A0T = list;
        A0y();
        if (this.A0Y) {
            HashSet A12 = C17880vN.A12();
            List list3 = this.A0W;
            if (list3 != null && !list3.isEmpty()) {
                Iterator it = this.A0T.iterator();
                while (it.hasNext()) {
                    AnonymousClass1E7 A0O2 = C17880vN.A0O(it);
                    Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
                    if (this.A0W.contains(A0O2.A06(cls))) {
                        A0O2.A0y = true;
                        if (!A12.contains(A0O2.A06(cls))) {
                            List list4 = this.A0i;
                            list4.add(A0O2);
                            A12.add(A0O2.A06(cls));
                            if (list4.size() >= A4f()) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            SelectedContactsList selectedContactsList = this.A0A;
            if (!(selectedContactsList == null || (list2 = this.A0W) == null || list2.isEmpty())) {
                selectedContactsList.A07.notifyDataSetChanged();
            }
            this.A0Y = false;
        }
        A4t();
        MenuItem menuItem = this.A0a;
        if (menuItem != null) {
            menuItem.setVisible(AnonymousClass000.A1a(this.A0T));
        }
        SelectedContactsList selectedContactsList2 = this.A0A;
        if (selectedContactsList2 != null) {
            ListView listView = this.A02;
            ViewGroup viewGroup = this.A00;
            boolean z = this.A0Z;
            int i = 0;
            if (selectedContactsList2.A09.isEmpty()) {
                i = 4;
            }
            selectedContactsList2.setVisibility(i);
            if (!selectedContactsList2.A09.isEmpty()) {
                SelectedContactsList.A00(listView, viewGroup, selectedContactsList2, z);
            }
        }
    }

    public void A59(List list) {
        this.A0D = null;
        ArrayList arrayList = this.A0h;
        arrayList.clear();
        arrayList.addAll(list);
        this.A01.notifyDataSetChanged();
        A0z();
    }

    public void BIz(ThumbnailButton thumbnailButton, AnonymousClass1E7 r4) {
        C37451pZ r0 = this.A0e;
        if (r0 != null) {
            r0.A0C(thumbnailButton, r4, false);
        }
    }

    public void onBackPressed() {
        WDSSearchBar wDSSearchBar = this.A0H;
        if (wDSSearchBar == null || !AnonymousClass000.A1P(wDSSearchBar.A08.getVisibility())) {
            A4q();
        } else {
            this.A0H.A02(true);
        }
    }

    private void A0y() {
        AnonymousClass499 r0 = this.A0d;
        if (r0 != null) {
            r0.A0B(true);
            this.A0d = null;
        }
        C825548v r02 = this.A0D;
        if (r02 != null) {
            r02.A0B(true);
            this.A0D = null;
        }
        AnonymousClass499 r1 = new AnonymousClass499(this.A08, this, this.A0S, this.A0T);
        this.A0d = r1;
        C17890vO.A0u(r1, this.A05);
    }

    public int A4c() {
        ArrayList A042;
        if (this instanceof LinkExistingGroupActivity) {
            return 2131891619;
        }
        if (this instanceof GroupMembersSelectorActivity) {
            return 2131892466;
        }
        if (this instanceof NotifyContactsSelector) {
            return 2131888048;
        }
        if (this instanceof InviteNewsletterAdminSelector) {
            return 2131891465;
        }
        if (this instanceof ListsContactPickerActivity) {
            return 2131886520;
        }
        if (this instanceof GroupMembersSelector) {
            Bundle bundleExtra = getIntent().getBundleExtra("fMessageKeyBundle");
            if (bundleExtra == null || (A042 = AnonymousClass4aU.A04(bundleExtra)) == null || A042.size() == 0) {
                return 2131892466;
            }
            return 2131890526;
        } else if (this instanceof EditGroupAdminsSelector) {
            return 2131889621;
        } else {
            if (this instanceof FavoritesPickerActivity) {
                return 2131886517;
            }
            if (this instanceof EditBroadcastRecipientsSelector) {
                return 2131889604;
            }
            if (this instanceof AnonymousClass3qm) {
                return 2131892481;
            }
            if (this instanceof ContactsAttachmentSelector) {
                return 2131888889;
            }
            if (this instanceof AddGroupParticipantsSelector) {
                if (C72453Mb.A1a(((AddGroupParticipantsSelector) this).A0T)) {
                    return 2131886489;
                }
                return 2131886494;
            } else if (this instanceof C77073pJ) {
                return 2131886482;
            } else {
                if (this instanceof LinkExistingGroups) {
                    return 2131891620;
                }
                if (this instanceof C77053p5) {
                    return 2131895610;
                }
                if (this instanceof FavoritePicker) {
                    return 2131887612;
                }
                GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
                if (groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet) {
                    return 2131892001;
                }
                if (GroupCallParticipantPicker.A1A(groupCallParticipantPicker)) {
                    return 2131892451;
                }
                if (GroupCallParticipantPicker.A19(groupCallParticipantPicker)) {
                    return 2131898571;
                }
                return 2131892468;
            }
        }
    }

    public int A4d() {
        if (this instanceof LinkExistingGroupActivity) {
            return 2131889742;
        }
        if (this instanceof AddGroupParticipantsSelector) {
            if (C72453Mb.A1a(((AddGroupParticipantsSelector) this).A0a)) {
                return 2131892972;
            }
            return 0;
        } else if (this instanceof C77053p5) {
            return 2131888501;
        } else {
            return 0;
        }
    }

    public int A4e() {
        if (this instanceof LinkExistingGroupActivity) {
            return 2131755201;
        }
        if (this instanceof GroupMembersSelectorActivity) {
            return 2131755188;
        }
        if (this instanceof NotifyContactsSelector) {
            return 2131755294;
        }
        if (this instanceof InviteNewsletterAdminSelector) {
            return 2131755188;
        }
        if (this instanceof ListsContactPickerActivity) {
            return 2131755216;
        }
        if ((this instanceof GroupMembersSelector) || (this instanceof EditGroupAdminsSelector)) {
            return 2131755188;
        }
        if (this instanceof FavoritesPickerActivity) {
            return 2131755149;
        }
        if ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof AnonymousClass3qm)) {
            return 2131755029;
        }
        if (this instanceof ContactsAttachmentSelector) {
            return 2131755072;
        }
        if (this instanceof AddGroupParticipantsSelector) {
            if (C72453Mb.A1a(((AddGroupParticipantsSelector) this).A0T)) {
                return 2131755062;
            }
            return 2131755188;
        } else if (this instanceof C77073pJ) {
            return -1;
        } else {
            if (this instanceof LinkExistingGroups) {
                LinkExistingGroups linkExistingGroups = (LinkExistingGroups) this;
                AnonymousClass00H r0 = linkExistingGroups.A0A;
                if (r0 != null) {
                    C18030ve r1 = AnonymousClass3MW.A0Z(r0).A07;
                    C18040vf r3 = C18040vf.A02;
                    int A002 = C18020vd.A00(r3, r1, 1990);
                    AnonymousClass00H r02 = linkExistingGroups.A0A;
                    if (r02 != null) {
                        int A003 = C18020vd.A00(r3, AnonymousClass3MW.A0Z(r02).A07, 1238);
                        if (linkExistingGroups.A07 != null || A002 >= A003) {
                            return 2131755202;
                        }
                        return 2131755203;
                    }
                }
                C18070vi.A11("communityChatManager");
                throw null;
            } else if (this instanceof C77053p5) {
                return -1;
            } else {
                if (this instanceof FavoritePicker) {
                    return 0;
                }
                return 2131755187;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A4f() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r0 != 0) goto L_0x015a
            boolean r0 = r6 instanceof com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity
            if (r0 == 0) goto L_0x0017
            r0 = r6
            com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity r0 = (com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity) r0
            X.1MZ r1 = r0.A01
            if (r1 == 0) goto L_0x0109
        L_0x000f:
            r0 = 0
            int r0 = r1.A02(r0)
            int r0 = r0 + -1
        L_0x0016:
            return r0
        L_0x0017:
            boolean r0 = r6 instanceof com.whatsapp.registration.NotifyContactsSelector
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r6 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x005c
            r3 = r6
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r3 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r3
            X.0ve r2 = r3.A0E
            r1 = 6461(0x193d, float:9.054E-42)
            X.0vf r0 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r0, r2, r1)
            X.0vl r0 = r3.A08
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            int r5 = r5 - r0
            java.util.List r0 = r3.A06
            if (r0 == 0) goto L_0x00e2
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x0045:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4NS r0 = (X.AnonymousClass4NS) r0
            X.9Ig r1 = r0.A02
            X.9Ig r0 = X.C179509Ig.ADMIN
            if (r1 != r0) goto L_0x0045
            r4.add(r2)
            goto L_0x0045
        L_0x005c:
            boolean r0 = r6 instanceof com.whatsapp.lists.picker.ListsContactPickerActivity
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r6 instanceof com.whatsapp.group.GroupMembersSelector
            if (r0 == 0) goto L_0x006a
            r0 = r6
            com.whatsapp.group.GroupMembersSelector r0 = (com.whatsapp.group.GroupMembersSelector) r0
            X.1MZ r1 = r0.A03
            goto L_0x000f
        L_0x006a:
            boolean r0 = r6 instanceof com.whatsapp.group.EditGroupAdminsSelector
            if (r0 == 0) goto L_0x0099
            r1 = r6
            com.whatsapp.group.EditGroupAdminsSelector r1 = (com.whatsapp.group.EditGroupAdminsSelector) r1
            java.util.List r0 = r1.A0T
            int r3 = r0.size()
            if (r3 == 0) goto L_0x00d9
            X.1MZ r2 = r1.A00
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r0 = "gid"
            java.lang.String r1 = r1.getStringExtra(r0)
            X.C17960vV.A07(r1)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r0 = r0.A02(r1)
            int r0 = r2.A02(r0)
            int r0 = r0 + -1
            int r0 = java.lang.Math.min(r0, r3)
            return r0
        L_0x0099:
            boolean r0 = r6 instanceof com.whatsapp.favorites.picker.FavoritesPickerActivity
            if (r0 == 0) goto L_0x00b1
            r0 = r6
            com.whatsapp.favorites.picker.FavoritesPickerActivity r0 = (com.whatsapp.favorites.picker.FavoritesPickerActivity) r0
            X.0vl r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.favorites.picker.FavoritesPickerViewModel r0 = (com.whatsapp.favorites.picker.FavoritesPickerViewModel) r0
            java.util.HashSet r0 = r0.A0C
            int r0 = r0.size()
            int r0 = 100 - r0
            return r0
        L_0x00b1:
            boolean r0 = r6 instanceof com.whatsapp.conversation.EditBroadcastRecipientsSelector
            if (r0 == 0) goto L_0x00cb
            X.18O r1 = r6.A06
            X.18Q r0 = X.AnonymousClass18O.A1N
            int r0 = r1.A04(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L_0x0016
            return r1
        L_0x00cb:
            boolean r0 = r6 instanceof X.AnonymousClass3qm
            if (r0 == 0) goto L_0x00e5
            X.18O r1 = r6.A06
            X.18Q r0 = X.AnonymousClass18O.A1N
            int r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0016
        L_0x00d9:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L_0x00dd:
            int r0 = r4.size()
            goto L_0x00e3
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            int r5 = r5 - r0
            return r5
        L_0x00e5:
            boolean r0 = r6 instanceof com.whatsapp.contact.picker.ContactsAttachmentSelector
            if (r0 == 0) goto L_0x00ec
            r0 = 257(0x101, float:3.6E-43)
            return r0
        L_0x00ec:
            boolean r0 = r6 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x0110
            r2 = r6
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r2 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r2
            X.1MZ r1 = r2.A07
            if (r1 == 0) goto L_0x0109
            X.0vl r0 = r2.A0Q
            X.1EC r0 = X.AnonymousClass3MX.A0p(r0)
            int r1 = r1.A02(r0)
            java.util.Set r0 = r2.A0L
            int r0 = r0.size()
            int r1 = r1 - r0
            return r1
        L_0x0109:
            java.lang.String r0 = "groupParticipantsManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0110:
            boolean r0 = r6 instanceof X.C77073pJ
            if (r0 != 0) goto L_0x015a
            boolean r0 = r6 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x0126
            android.content.Intent r2 = r6.getIntent()
            java.lang.String r1 = "max_groups_allowed_to_link"
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r2.getIntExtra(r1, r0)
            return r0
        L_0x0126:
            boolean r0 = r6 instanceof X.C77053p5
            if (r0 != 0) goto L_0x015a
            boolean r0 = r6 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 == 0) goto L_0x013a
            r0 = r6
            com.whatsapp.calling.favorite.FavoritePicker r0 = (com.whatsapp.calling.favorite.FavoritePicker) r0
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = X.AnonymousClass3MZ.A0Y(r0)
            int r0 = r0.A00
            int r0 = 100 - r0
            return r0
        L_0x013a:
            r1 = r6
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r1 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r1
            X.00H r0 = r1.A0G
            java.lang.Object r0 = r0.get()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            X.1VC r0 = r0.A00
            boolean r0 = r0.A03()
            r3 = 1
            if (r0 != 0) goto L_0x015a
            X.0ve r2 = r1.A0E
            r1 = 862(0x35e, float:1.208E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            int r0 = r0 - r3
            return r0
        L_0x015a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3gf.A4f():int");
    }

    public int A4g() {
        if ((this instanceof LinkExistingGroupActivity) || (this instanceof GroupMembersSelectorActivity)) {
            return 1;
        }
        if (this instanceof NotifyContactsSelector) {
            return 0;
        }
        if (this instanceof InviteNewsletterAdminSelector) {
            return 1;
        }
        if (this instanceof ListsContactPickerActivity) {
            return 0;
        }
        if (this instanceof GroupMembersSelector) {
            return 1;
        }
        if (this instanceof EditGroupAdminsSelector) {
            return 0;
        }
        if (this instanceof FavoritesPickerActivity) {
            return 1;
        }
        if ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof AnonymousClass3qm)) {
            return 2;
        }
        if ((this instanceof ContactsAttachmentSelector) || (this instanceof AddGroupParticipantsSelector)) {
            return 1;
        }
        if ((this instanceof C77073pJ) || (this instanceof LinkExistingGroups) || (this instanceof C77053p5)) {
            return 0;
        }
        return 1;
    }

    public int A4h() {
        if ((this instanceof C77073pJ) || (this instanceof C77053p5)) {
            return AnonymousClass1YL.A00(this, 2130970064, 2131101205);
        }
        return 0;
    }

    public int A4i() {
        if ((this instanceof LinkExistingGroupActivity) || (this instanceof GroupMembersSelectorActivity)) {
            return 2131899268;
        }
        if ((this instanceof NotifyContactsSelector) || (this instanceof InviteNewsletterAdminSelector) || (this instanceof ListsContactPickerActivity)) {
            return 2131898925;
        }
        if (this instanceof GroupMembersSelector) {
            return 2131899268;
        }
        if (this instanceof EditGroupAdminsSelector) {
            return 2131898925;
        }
        if (this instanceof FavoritesPickerActivity) {
            return 2131899268;
        }
        if (this instanceof EditBroadcastRecipientsSelector) {
            return 2131898925;
        }
        if (this instanceof AnonymousClass3qm) {
            return 2131889072;
        }
        if (this instanceof ContactsAttachmentSelector) {
            return 2131899268;
        }
        if (this instanceof AddGroupParticipantsSelector) {
            return 2131898925;
        }
        if ((this instanceof C77073pJ) || (this instanceof LinkExistingGroups) || (this instanceof C77053p5) || (this instanceof FavoritePicker)) {
            return 2131899268;
        }
        return 0;
    }

    public Drawable A4j() {
        if (this instanceof LinkExistingGroupActivity) {
            return AnonymousClass3NL.A00(this, this.A0F, 2131231900);
        }
        if (this instanceof GroupMembersSelectorActivity) {
            return AnonymousClass3NL.A00(this, this.A0F, 2131231900);
        }
        if (this instanceof NotifyContactsSelector) {
            return AnonymousClass3MY.A08(this);
        }
        if (this instanceof InviteNewsletterAdminSelector) {
            Drawable A082 = AnonymousClass3MY.A08(this);
            C18070vi.A0b(A082);
            return A082;
        } else if (this instanceof ListsContactPickerActivity) {
            return AnonymousClass3MY.A08(this);
        } else {
            if (this instanceof GroupMembersSelector) {
                return AnonymousClass3NL.A00(this, this.A0F, 2131231900);
            }
            if (this instanceof EditGroupAdminsSelector) {
                return AnonymousClass3MY.A08(this);
            }
            if (this instanceof FavoritesPickerActivity) {
                return AnonymousClass3MY.A08(this);
            }
            if (this instanceof EditBroadcastRecipientsSelector) {
                return AnonymousClass3MY.A08(this);
            }
            if (this instanceof AnonymousClass3qm) {
                return AnonymousClass3MY.A08(this);
            }
            if (this instanceof ContactsAttachmentSelector) {
                return AnonymousClass3NL.A00(this, this.A0F, 2131231900);
            }
            if (this instanceof AddGroupParticipantsSelector) {
                return AnonymousClass3MY.A08(this);
            }
            if (this instanceof C77073pJ) {
                return AnonymousClass3NL.A00(this, this.A0F, 2131231900);
            }
            if (this instanceof LinkExistingGroups) {
                return AnonymousClass3NL.A00(this, this.A0F, 2131231900);
            }
            if (this instanceof C77053p5) {
                return AnonymousClass3NL.A00(this, this.A0F, 2131231900);
            }
            if (this instanceof FavoritePicker) {
                return AnonymousClass3MY.A08(this);
            }
            return null;
        }
    }

    public View A4k() {
        if (this instanceof LinkExistingGroupActivity) {
            View A092 = AnonymousClass3MX.A09(getLayoutInflater(), this.A02, 2131625812);
            C18070vi.A0X(A092);
            TextView A0E2 = AnonymousClass3Ma.A0E(A092, 2131432014);
            C43421zm.A04(A0E2);
            A0E2.setText(2131891180);
            View A052 = C18070vi.A05(A092, 2131427603);
            AnonymousClass3MZ.A1M(A052, this, 26);
            C43421zm.A04(AnonymousClass3Ma.A0E(A052, 2131429715));
            return A092;
        } else if (!(this instanceof GroupCallParticipantPicker)) {
            return null;
        } else {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            if ((groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet) || !GroupCallParticipantPicker.A19(groupCallParticipantPicker) || groupCallParticipantPicker.A0N) {
                return null;
            }
            LinearLayout linearLayout = new LinearLayout(groupCallParticipantPicker);
            linearLayout.setOrientation(1);
            linearLayout.addView(GroupCallParticipantPicker.A12(groupCallParticipantPicker));
            C18030ve r0 = groupCallParticipantPicker.A0E;
            C18040vf r3 = C18040vf.A02;
            if (C18020vd.A00(r3, r0, 11714) >= 1) {
                linearLayout.addView(GroupCallParticipantPicker.A13(groupCallParticipantPicker));
            }
            if ((!AnonymousClass3MX.A1V(groupCallParticipantPicker)) && C18020vd.A00(r3, groupCallParticipantPicker.A0E, 11714) < 2) {
                ListView listView = groupCallParticipantPicker.A02;
                C18030ve r13 = groupCallParticipantPicker.A0E;
                AnonymousClass1KB r8 = groupCallParticipantPicker.A05;
                C37721q1 A0m = AnonymousClass3MW.A0m(groupCallParticipantPicker.A0I);
                C37311pJ r10 = groupCallParticipantPicker.A03;
                C219217x r11 = groupCallParticipantPicker.A04;
                C30191dX r9 = (C30191dX) groupCallParticipantPicker.A0B.get();
                C19830z4 r12 = groupCallParticipantPicker.A0A;
                C72473Md.A1M(listView, r13, r8, 1);
                C18070vi.A0l(A0m, r10);
                C72473Md.A1K(r11, r9);
                C18070vi.A0d(r12, 11);
                View A022 = C88394Zn.A02(groupCallParticipantPicker, listView, r8, r9, r10, r11, r12, r13, A0m, (C18090vk) null, 2, 17, 3, false);
                C18000vb r4 = groupCallParticipantPicker.A0F;
                C19880zA r02 = (C19880zA) groupCallParticipantPicker.A0I.get();
                C18070vi.A0d(r4, 2);
                C18070vi.A0d(r02, 3);
                C88394Zn.A03(groupCallParticipantPicker, A022, r02, r4, (C18090vk) null);
                FrameLayout frameLayout = new FrameLayout(groupCallParticipantPicker);
                frameLayout.addView(A022);
                frameLayout.setImportantForAccessibility(2);
                groupCallParticipantPicker.A0Q.add(A022);
                linearLayout.addView(frameLayout);
            }
            if (((AnonymousClass1XN) groupCallParticipantPicker.A08.get()).A02()) {
                View A002 = C88394Zn.A00(groupCallParticipantPicker, groupCallParticipantPicker.A02, (C133326oZ) groupCallParticipantPicker.A06.get(), groupCallParticipantPicker.A01, new C99144sL(groupCallParticipantPicker, 24));
                FrameLayout frameLayout2 = new FrameLayout(groupCallParticipantPicker);
                frameLayout2.addView(A002);
                frameLayout2.setImportantForAccessibility(2);
                groupCallParticipantPicker.A0Q.add(A002);
                linearLayout.addView(frameLayout2);
            }
            if (linearLayout.getChildCount() == 0) {
                return null;
            }
            return linearLayout;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (X.C18070vi.A19(r0, true) == false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A4l() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x0045
            r7 = r8
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r7 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r7
            android.view.LayoutInflater r3 = r7.getLayoutInflater()
            r1 = 2131627547(0x7f0e0e1b, float:1.8882362E38)
            r0 = 0
            r2 = 0
            android.view.View r6 = r3.inflate(r1, r0, r2)
            r0 = 2131430029(0x7f0b0a8d, float:1.8481747E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r6, r0)
            X.1np r4 = r7.A01
            if (r4 == 0) goto L_0x0040
            r1 = 2131891461(0x7f121505, float:1.9417643E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r3 = "learn-more"
            java.lang.String r2 = X.C17880vN.A0q(r7, r3, r0, r2, r1)
            r1 = 32
            X.Ail r0 = new X.Ail
            r0.<init>(r7, r1)
            android.text.SpannableStringBuilder r0 = r4.A05(r7, r0, r2, r3)
            r5.setText(r0)
            X.0ve r0 = r7.A0E
            X.AnonymousClass3Ma.A1I(r5, r0)
            return r6
        L_0x0040:
            X.AnonymousClass3MW.A1E()
            goto L_0x0114
        L_0x0045:
            boolean r0 = r8 instanceof com.whatsapp.lists.picker.ListsContactPickerActivity
            if (r0 == 0) goto L_0x0055
            android.view.LayoutInflater r1 = r8.getLayoutInflater()
            r0 = 2131625836(0x7f0e076c, float:1.8878891E38)
            android.view.View r0 = X.AnonymousClass3MY.A0D(r1, r0)
            return r0
        L_0x0055:
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.BroadcastListMembersSelector
            if (r0 == 0) goto L_0x0070
            r0 = r8
            com.whatsapp.contact.picker.BroadcastListMembersSelector r0 = (com.whatsapp.contact.picker.BroadcastListMembersSelector) r0
            X.0zA r1 = r0.A00
            if (r1 == 0) goto L_0x010f
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0183
            X.C19880zA.A02(r1)
            java.lang.String r0 = "isMarketingMessageHighIntentV2Enabled"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0070:
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x0116
            r4 = r8
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r4 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r4
            X.0vl r2 = r4.A0V
            boolean r0 = X.C72453Mb.A1a(r2)
            if (r0 != 0) goto L_0x00da
            X.126 r1 = r4.A09
            if (r1 == 0) goto L_0x010c
            X.0vl r5 = r4.A0Q
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r1 = r1.A0K(r0)
            r0 = 4
            if (r1 == r0) goto L_0x00da
            X.0vl r0 = r4.A0X
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x010a
            boolean r0 = X.C72453Mb.A1a(r2)
            if (r0 != 0) goto L_0x010a
            X.0vl r3 = r4.A0M
            java.lang.Object r0 = r3.getValue()
            X.4RP r0 = (X.AnonymousClass4RP) r0
            if (r0 == 0) goto L_0x010a
            X.0ve r0 = r0.A05
            boolean r0 = X.AnonymousClass3MX.A1Y(r0)
            r2 = 1
            if (r0 != r2) goto L_0x010a
            X.126 r1 = r4.A09
            if (r1 == 0) goto L_0x010c
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r0 = r1.A0K(r0)
            if (r0 != r2) goto L_0x00da
            java.lang.Object r1 = r3.getValue()
            X.4RP r1 = (X.AnonymousClass4RP) r1
            if (r1 == 0) goto L_0x00da
            X.0ve r0 = r1.A05
            boolean r0 = X.AnonymousClass3MX.A1Y(r0)
            if (r0 != 0) goto L_0x0101
            r0 = 0
        L_0x00d4:
            boolean r0 = X.C18070vi.A19(r0, r2)
            if (r0 != 0) goto L_0x010a
        L_0x00da:
            r1 = 1
        L_0x00db:
            X.0vl r0 = r4.A0Q
            X.1EC r3 = X.AnonymousClass3MX.A0p(r0)
            r2 = 0
            if (r3 == 0) goto L_0x0100
            if (r1 == 0) goto L_0x0100
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131627547(0x7f0e0e1b, float:1.8882362E38)
            android.view.View r2 = r1.inflate(r0, r2)
            r0 = 2131430029(0x7f0b0a8d, float:1.8481747E38)
            com.whatsapp.TextEmojiLabel r1 = X.C72453Mb.A0c(r2, r0)
            com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0y(r1, r4, r3)
            X.0ve r0 = r4.A0E
            X.AnonymousClass3Ma.A1I(r1, r0)
        L_0x0100:
            return r2
        L_0x0101:
            boolean r0 = r1.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x00d4
        L_0x010a:
            r1 = 0
            goto L_0x00db
        L_0x010c:
            java.lang.String r0 = "groupChatManager"
            goto L_0x0111
        L_0x010f:
            java.lang.String r0 = "premiumMessageHighIntentBroadcastManager"
        L_0x0111:
            X.C18070vi.A11(r0)
        L_0x0114:
            r0 = 0
            throw r0
        L_0x0116:
            boolean r0 = r8 instanceof X.C77073pJ
            if (r0 == 0) goto L_0x0124
            r0 = r8
            X.3pJ r0 = (X.C77073pJ) r0
            X.0vl r0 = r0.A05
            android.view.View r0 = X.C72453Mb.A0T(r0)
            return r0
        L_0x0124:
            boolean r0 = r8 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x0150
            r4 = r8
            com.whatsapp.community.LinkExistingGroups r4 = (com.whatsapp.community.LinkExistingGroups) r4
            android.view.View r3 = r4.A00
            java.lang.String r2 = "null cannot be cast to non-null type android.view.View"
            if (r3 != 0) goto L_0x014c
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131627547(0x7f0e0e1b, float:1.8882362E38)
            android.view.View r3 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131430029(0x7f0b0a8d, float:1.8481747E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r3, r0)
            java.lang.String r0 = r4.A4o()
            r1.setText(r0)
            r4.A00 = r3
        L_0x014c:
            X.C18070vi.A0z(r3, r2)
            return r3
        L_0x0150:
            boolean r0 = r8 instanceof X.C77053p5
            if (r0 == 0) goto L_0x015e
            r0 = r8
            X.3p5 r0 = (X.C77053p5) r0
            X.0vl r0 = r0.A04
            android.view.View r0 = X.C72453Mb.A0T(r0)
            return r0
        L_0x015e:
            boolean r0 = r8 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x0183
            r2 = r8
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r2
            boolean r0 = r2 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet
            if (r0 == 0) goto L_0x016b
            r1 = 0
            return r1
        L_0x016b:
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131627547(0x7f0e0e1b, float:1.8882362E38)
            android.view.View r1 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131430029(0x7f0b0a8d, float:1.8481747E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0W(r1, r0)
            r2.A00 = r0
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker.A16(r2)
            return r1
        L_0x0183:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3gf.A4l():android.view.View");
    }

    public AnonymousClass4EO A4m() {
        int i;
        if (!(this instanceof GroupCallParticipantPicker)) {
            return null;
        }
        GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
        if (AnonymousClass3MX.A0g(groupCallParticipantPicker.A0C).A02()) {
            ((C37301pI) groupCallParticipantPicker.A0D.get()).A01(1);
            i = 2131893330;
        } else if (!AnonymousClass3MX.A0g(groupCallParticipantPicker.A0C).A01()) {
            return null;
        } else {
            i = 2131893331;
        }
        return new AnonymousClass3rB(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (X.AnonymousClass1YF.A0T(r0) != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (X.AnonymousClass1YF.A0T(r0) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A4n() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.whatsapp.favorites.picker.FavoritesPickerActivity
            if (r0 != 0) goto L_0x0034
            boolean r0 = r2 instanceof com.whatsapp.conversation.EditBroadcastRecipientsSelector
            if (r0 != 0) goto L_0x0025
            boolean r0 = r2 instanceof com.whatsapp.contact.picker.BroadcastListMembersSelector
            if (r0 != 0) goto L_0x0025
            boolean r0 = r2 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 != 0) goto L_0x0034
            boolean r0 = r2 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r2.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 27
            if (r0 == 0) goto L_0x0020
            r1 = 26
        L_0x0020:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0025:
            java.lang.String r0 = r2.A0R
            if (r0 == 0) goto L_0x0031
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            r1 = 38
            if (r0 == 0) goto L_0x0020
        L_0x0031:
            r1 = 35
            goto L_0x0020
        L_0x0034:
            java.lang.String r0 = r2.A0R
            if (r0 == 0) goto L_0x0040
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            r1 = 39
            if (r0 == 0) goto L_0x0020
        L_0x0040:
            r1 = 36
            goto L_0x0020
        L_0x0043:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3gf.A4n():java.lang.Integer");
    }

    public String A4o() {
        int i;
        String A0j2;
        if (this instanceof AnonymousClass3qm) {
            AnonymousClass11S r0 = this.A02;
            r0.A0I();
            Me me = r0.A00;
            C17960vV.A07(me);
            C18070vi.A0X(me);
            C18000vb r3 = this.A0F;
            C17960vV.A07(me);
            String str = me.cc;
            String str2 = me.jabber_id;
            C17960vV.A07(str2);
            C18070vi.A0X(str2);
            String substring = str2.substring(me.cc.length());
            C18070vi.A0X(substring);
            String A0G2 = r3.A0G(A9B.A0H(str, substring));
            C18070vi.A0b(A0G2);
            C18070vi.A0d(A0G2, 0);
            String replace = A0G2.replace(' ', 160);
            C18070vi.A0X(replace);
            String A0R2 = C17890vO.A0R(this, replace, 1, 0, 2131887443);
            C18070vi.A0X(A0R2);
            return A0R2;
        } else if (this instanceof C77073pJ) {
            C77073pJ r2 = (C77073pJ) this;
            Object value = r2.A04.getValue();
            if (value == null || (A0j2 = C72473Md.A0j(r2, value, 2131886483)) == null) {
                return C18070vi.A0F(r2, 2131886484);
            }
            return A0j2;
        } else if (this instanceof LinkExistingGroups) {
            LinkExistingGroups linkExistingGroups = (LinkExistingGroups) this;
            AnonymousClass1EC r1 = linkExistingGroups.A07;
            boolean z = false;
            if (r1 != null) {
                AnonymousClass1CJ r02 = linkExistingGroups.A02;
                if (r02 != null) {
                    C29691ci A002 = AnonymousClass1CJ.A00(r02, r1);
                    if (A002 != null && !A002.A0r) {
                        z = true;
                    }
                } else {
                    AnonymousClass3MW.A1I();
                    throw null;
                }
            }
            boolean A1a = C72453Mb.A1a(linkExistingGroups.A0J);
            if (z) {
                i = 2131891621;
                if (A1a) {
                    i = 2131891624;
                }
            } else {
                i = 2131891622;
                if (A1a) {
                    i = 2131891623;
                }
            }
            return C18070vi.A0F(linkExistingGroups, i);
        } else if (this instanceof C77053p5) {
            return C18070vi.A0F(this, 2131886753);
        } else {
            if (!(this instanceof FavoritePicker)) {
                return "";
            }
            if (C18020vd.A05(C18040vf.A01, this.A0E, 5172)) {
                return "";
            }
            String string = getResources().getString(2131887634);
            C18070vi.A0b(string);
            return string;
        }
    }

    public final ArrayList A4p() {
        List list = this.A0i;
        ArrayList A14 = AnonymousClass000.A14(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A14.add(C72473Md.A0X(it));
        }
        return A14;
    }

    public void A4q() {
        String str;
        if (this instanceof LinkExistingGroupActivity) {
            LinkExistingGroupActivity linkExistingGroupActivity = (LinkExistingGroupActivity) this;
            C30101dO r1 = linkExistingGroupActivity.A03;
            if (r1 == null) {
                str = "xFamilyUserFlowLogger";
            } else {
                r1.A02("EXIT_GROUP_SELECTION");
                linkExistingGroupActivity.finish();
                return;
            }
        } else if (this instanceof SelectCommunityForGroupActivity) {
            SelectCommunityForGroupActivity selectCommunityForGroupActivity = (SelectCommunityForGroupActivity) this;
            C40371ub r0 = selectCommunityForGroupActivity.A02;
            if (r0 != null) {
                r0.A04();
                selectCommunityForGroupActivity.setResult(0);
                selectCommunityForGroupActivity.finish();
                return;
            }
            str = "communityWamEventHelper";
        } else {
            if (this instanceof CommunityAdminPickerActivity) {
                setResult(0);
            } else if (this instanceof FavoritePicker) {
                FavoritePicker favoritePicker = (FavoritePicker) this;
                AnonymousClass3MZ.A0Y(favoritePicker).A08.A01(9, 40, 15);
                favoritePicker.finish();
                return;
            } else if (this instanceof GroupCallParticipantPicker) {
                GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
                groupCallParticipantPicker.finish();
                if (groupCallParticipantPicker.A5D()) {
                    C1408673j A0c2 = C74803cp.A0c(groupCallParticipantPicker);
                    A0c2.A02.execute(new C70563Bp(A0c2, 18));
                }
                ((C192539oZ) groupCallParticipantPicker.A0E.get()).A01(C17880vN.A0m(), (Integer) null, 8);
                return;
            }
            finish();
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A4s() {
        String str;
        C82884Cn r0;
        int i;
        Object value;
        Object value2;
        AnonymousClass4TN r02;
        String string;
        String rawString;
        String str2;
        if (this instanceof LinkExistingGroupActivity) {
            LinkExistingGroupActivity linkExistingGroupActivity = (LinkExistingGroupActivity) this;
            C30101dO r1 = linkExistingGroupActivity.A03;
            if (r1 != null) {
                r1.A04("TAP_GROUP_CONFIRM_NEXT");
                Iterator it = Collections.unmodifiableList(linkExistingGroupActivity.A0i).iterator();
                while (it.hasNext()) {
                    AnonymousClass1E7 A0O2 = C17880vN.A0O(it);
                    if (A0O2.A0J != null) {
                        String A0K2 = A0O2.A0K();
                        if (A0K2 == null) {
                            A0K2 = "";
                        }
                        linkExistingGroupActivity.A0F = A0K2;
                        AnonymousClass1BI r12 = A0O2.A0J;
                        C18070vi.A0z(r12, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                        AnonymousClass1EC r13 = (AnonymousClass1EC) r12;
                        linkExistingGroupActivity.A01 = r13;
                        if (r13 != null) {
                            AnonymousClass00H r03 = linkExistingGroupActivity.A06;
                            if (r03 != null) {
                                linkExistingGroupActivity.A0D = C17880vN.A0s(r13, ((AnonymousClass126) r03.get()).A1E);
                            } else {
                                str = "groupChatManager";
                                C18070vi.A11(str);
                                throw null;
                            }
                        }
                        String str3 = linkExistingGroupActivity.A0D;
                        if (str3 == null || str3.length() == 0) {
                            str2 = null;
                        } else {
                            str2 = AnonymousClass001.A1H("https://chat.whatsapp.com/", str3, AnonymousClass000.A10());
                        }
                        linkExistingGroupActivity.A0E = str2;
                        if (str3 == null || str3.length() == 0) {
                            LinkExistingGroupActivity.A11(linkExistingGroupActivity, false);
                        } else {
                            LinkExistingGroupActivity.A0z(linkExistingGroupActivity);
                        }
                    }
                }
                return;
            }
        } else {
            if (this instanceof GroupMembersSelectorActivity) {
                GroupMembersSelectorActivity groupMembersSelectorActivity = (GroupMembersSelectorActivity) this;
                ArrayList A4p = groupMembersSelectorActivity.A4p();
                groupMembersSelectorActivity.A05 = A4p;
                if (A4p.isEmpty()) {
                    groupMembersSelectorActivity.A05.A08(2131892952, 0);
                    return;
                }
                AnonymousClass00H r04 = groupMembersSelectorActivity.A03;
                if (r04 != null) {
                    r04.get();
                    int i2 = groupMembersSelectorActivity.A00;
                    ArrayList A4p2 = groupMembersSelectorActivity.A4p();
                    String str4 = groupMembersSelectorActivity.A04;
                    Intent A0A2 = C17880vN.A0A();
                    A0A2.setClassName(groupMembersSelectorActivity.getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
                    A0A2.putExtra("entry_point", i2);
                    A0A2.putExtra("create_group_for_xfamily", true);
                    if (!A4p2.isEmpty()) {
                        A0A2.putStringArrayListExtra("selected", C22971Dz.A0B(A4p2));
                    }
                    A0A2.putExtra("prefill_group_name", str4);
                    groupMembersSelectorActivity.CNh(A0A2, 11);
                    C30101dO r14 = groupMembersSelectorActivity.A02;
                    if (r14 != null) {
                        r14.A04("TAP_ADD_PARTICIPANTS_NEXT");
                        return;
                    }
                } else {
                    str = "waIntents";
                }
            } else if (this instanceof NotifyContactsSelector) {
                Intent A0A3 = C17880vN.A0A();
                A0A3.putStringArrayListExtra("jids", C22971Dz.A0B(A4p()));
                C72453Mb.A16(this, A0A3);
                return;
            } else if (this instanceof InviteNewsletterAdminSelector) {
                InviteNewsletterAdminSelector inviteNewsletterAdminSelector = (InviteNewsletterAdminSelector) this;
                C29681ch A0o = AnonymousClass3MX.A0o(inviteNewsletterAdminSelector.A09);
                if (A0o != null) {
                    C20098A7b.A02(AnonymousClass4H8.A00(A0o, inviteNewsletterAdminSelector.A4p(), true), inviteNewsletterAdminSelector.getSupportFragmentManager());
                    return;
                }
                return;
            } else if (this instanceof ListsContactPickerActivity) {
                List list = this.A0i;
                if (list.isEmpty()) {
                    this.A05.A08(2131894558, 0);
                    return;
                }
                Intent A0A4 = C17880vN.A0A();
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1BI A0l = C72453Mb.A0l(it2);
                    if (!(A0l == null || (rawString = A0l.getRawString()) == null)) {
                        A13.add(rawString);
                    }
                }
                A0A4.putStringArrayListExtra("EXTRA_SELECTED_RAW_JID_LIST", C17880vN.A10(A13));
                C72453Mb.A16(this, A0A4);
                return;
            } else if (this instanceof GroupMembersSelector) {
                GroupMembersSelector groupMembersSelector = (GroupMembersSelector) this;
                ArrayList A4p3 = groupMembersSelector.A4p();
                groupMembersSelector.A0E = A4p3;
                if (A4p3.isEmpty()) {
                    groupMembersSelector.A05.A08(2131892971, 0);
                    return;
                }
                AnonymousClass1EC r2 = groupMembersSelector.A07;
                if (r2 == null) {
                    boolean z = groupMembersSelector.A0F;
                    C825448t r05 = groupMembersSelector.A05;
                    if (z) {
                        if (r05 != null) {
                            r05.A0B(true);
                        }
                        C825448t r22 = new C825448t(groupMembersSelector);
                        groupMembersSelector.A05 = r22;
                        groupMembersSelector.A05.CGM(r22, new Void[0]);
                        groupMembersSelector.A0F = false;
                    } else if (r05 == null || r05.A09() == 2) {
                        C825448t r23 = new C825448t(groupMembersSelector);
                        groupMembersSelector.A05 = r23;
                        groupMembersSelector.A05.CGM(r23, new Void[0]);
                    }
                } else {
                    String A0p = AnonymousClass3MY.A0p(groupMembersSelector.A06, groupMembersSelector.A08, r2);
                    boolean A1W = AnonymousClass000.A1W(A0p);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("GroupMembersSelector/ CommunityName is null for");
                    C17960vV.A0F(A1W, C17890vO.A0V(groupMembersSelector.A07, A10));
                    C73203Rj A002 = AnonymousClass4a6.A00(groupMembersSelector);
                    A002.A0g(groupMembersSelector, new C91604fx(groupMembersSelector, 35), 2131887451);
                    if (A0p != null) {
                        string = C17890vO.A0R(groupMembersSelector, A0p, 1, 0, 2131896569);
                    } else {
                        string = groupMembersSelector.getString(2131896569);
                    }
                    A002.A0S(string);
                    A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
                    A002.A0C();
                }
                C72463Mc.A1E(new C81673zc(), (C88474Zv) groupMembersSelector.A08.get(), 89, 6, false);
                return;
            } else if (this instanceof EditGroupAdminsSelector) {
                Intent A0A5 = C17880vN.A0A();
                A0A5.putExtra("jids", C22971Dz.A0B(A4p()));
                C72453Mb.A16(this, A0A5);
                return;
            } else if (this instanceof FavoritesPickerActivity) {
                FavoritesPickerActivity favoritesPickerActivity = (FavoritesPickerActivity) this;
                FavoritesPickerViewModel favoritesPickerViewModel = (FavoritesPickerViewModel) favoritesPickerActivity.A02.getValue();
                List unmodifiableList = Collections.unmodifiableList(favoritesPickerActivity.A0i);
                C18070vi.A0X(unmodifiableList);
                C102585Ha r4 = new C102585Ha(favoritesPickerActivity);
                AnonymousClass3MW.A1X(favoritesPickerViewModel.A0G, new FavoritesPickerViewModel$addFavorites$1(favoritesPickerViewModel, unmodifiableList, (C30391dr) null, r4), C41561wd.A00(favoritesPickerViewModel));
                return;
            } else if (this instanceof EditBroadcastRecipientsSelector) {
                Intent A0A6 = C17880vN.A0A();
                A0A6.putExtra("contacts", C22971Dz.A0B(A4p()));
                C72453Mb.A16(this, A0A6);
                return;
            } else if (this instanceof ContactsAttachmentSelector) {
                ContactsAttachmentSelector contactsAttachmentSelector = (ContactsAttachmentSelector) this;
                AnonymousClass3T3 r5 = contactsAttachmentSelector.A01;
                ArrayList A4p4 = contactsAttachmentSelector.A4p();
                AnonymousClass1DT r42 = r5.A02;
                r42.A0F(A4p4);
                AnonymousClass3MY.A1L(r5.A03, true);
                CW0 cw0 = r5.A07;
                C22801Dg r3 = r5.A01;
                cw0.A00(new C91204fJ(r5, 0), r42, r3);
                r5.A00.A0H(r3, new C91624fz(r5, 27));
                return;
            } else if (this instanceof BroadcastListMembersSelector) {
                AnonymousClass3qm r52 = (AnonymousClass3qm) this;
                C25161Nd r43 = r52.A02;
                if (r43 != null) {
                    AnonymousClass1CJ.A01(r43.A02);
                    long A042 = C17880vN.A04(System.currentTimeMillis());
                    C25171Ne r44 = r43.A01;
                    synchronized (r44) {
                        while (true) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append(A042);
                            if (C25171Ne.A00(r44, C47712Jo.A00(AnonymousClass000.A0y("@broadcast", A102))) >= 0) {
                                A042++;
                            }
                        }
                        while (true) {
                        }
                    }
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append(A042);
                    C47712Jo A003 = C47712Jo.A00(AnonymousClass000.A0y("@broadcast", A103));
                    C17960vV.A07(A003);
                    C18070vi.A0X(A003);
                    r52.A05.CGF(new C70773Cl(r52, A003, r52.A4p(), 10));
                    return;
                }
                str = "conversationsManager";
            } else if (this instanceof AddGroupParticipantsSelector) {
                AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
                AnonymousClass3U0 r6 = (AnonymousClass3U0) addGroupParticipantsSelector.A0b.getValue();
                ArrayList A4p5 = addGroupParticipantsSelector.A4p();
                boolean z2 = false;
                if (AnonymousClass3MX.A1Y(addGroupParticipantsSelector.A0E) && (r02 = addGroupParticipantsSelector.A03) != null) {
                    Iterable iterable = (Iterable) r02.A00.get("com.whatsapp.community.DirectoryContactsLoader");
                    if (iterable == null) {
                        iterable = C25511Om.A00;
                    }
                    List A0t = C29431cG.A0t(iterable);
                    List list2 = addGroupParticipantsSelector.A0i;
                    C18070vi.A0W(list2);
                    if (A0t.containsAll(list2)) {
                        z2 = true;
                    }
                }
                AnonymousClass3MW.A1X(r6.A09, new AddGroupParticipantsSelectorViewModel$onSubmitRequested$1(r6, A4p5, (C30391dr) null, z2), C41561wd.A00(r6));
                return;
            } else if (this instanceof SelectCommunityForGroupActivity) {
                SelectCommunityForGroupViewModel selectCommunityForGroupViewModel = (SelectCommunityForGroupViewModel) ((SelectCommunityForGroupActivity) this).A07.getValue();
                AnonymousClass1G4 r32 = selectCommunityForGroupViewModel.A05;
                boolean z3 = ((AnonymousClass4FI) r32.getValue()).A00().A01;
                C40371ub r62 = selectCommunityForGroupViewModel.A01;
                AnonymousClass00H r06 = r62.A05;
                String A0o2 = C72463Mc.A0o(r06);
                Integer A0j2 = AnonymousClass3MY.A0j(r06);
                if (z3) {
                    i = 19;
                } else {
                    i = 17;
                }
                r62.A0D(A0j2, (Long) null, A0o2, (String) null, i, 11);
                if (((AnonymousClass4FI) r32.getValue()).A00().A00 == null) {
                    do {
                        value2 = r32.getValue();
                    } while (!r32.BFK(value2, ((AnonymousClass4FI) value2).A01(new C86604Sh(C72453Mb.A0q(2131886154)), 2131898766, C106395Vr.A00, new AnonymousClass5RM(selectCommunityForGroupViewModel))));
                    return;
                }
                do {
                    value = r32.getValue();
                } while (!r32.BFK(value, new C77143pS(((AnonymousClass4FI) value).A00())));
                return;
            } else if (this instanceof LinkExistingGroups) {
                LinkExistingGroups linkExistingGroups = (LinkExistingGroups) this;
                List unmodifiableList2 = Collections.unmodifiableList(linkExistingGroups.A0i);
                C18070vi.A0X(unmodifiableList2);
                if (unmodifiableList2.size() == 0 && linkExistingGroups.A0F) {
                    C73203Rj A004 = AnonymousClass4a6.A00(linkExistingGroups);
                    A004.A0S(linkExistingGroups.getString(2131892964));
                    A004.A0e(linkExistingGroups, new C91584fv(linkExistingGroups, 36), 2131898766);
                    C73203Rj.A04(linkExistingGroups, A004);
                    return;
                } else if (!linkExistingGroups.A0F) {
                    linkExistingGroups.setResult(-10);
                    linkExistingGroups.finish();
                    return;
                } else {
                    if (!C18020vd.A05(C18040vf.A02, linkExistingGroups.A0E, 7889)) {
                        List A0y = LinkExistingGroups.A0y(linkExistingGroups);
                        if (C72453Mb.A1a(linkExistingGroups.A0J)) {
                            r0 = C82884Cn.SUGGEST;
                        } else {
                            r0 = C82884Cn.DIRECT_LINK;
                        }
                        AnonymousClass4G8.A00(r0, A0y).A2F(linkExistingGroups.getSupportFragmentManager(), "LinkExistingGroups");
                        return;
                    }
                    linkExistingGroups.A0D.get();
                    boolean A1a = C72453Mb.A1a(linkExistingGroups.A0J);
                    AnonymousClass1EC r45 = linkExistingGroups.A07;
                    List A0y2 = LinkExistingGroups.A0y(linkExistingGroups);
                    Intent A0A7 = C17880vN.A0A();
                    A0A7.setClassName(linkExistingGroups.getPackageName(), "com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity");
                    A0A7.putExtra("is_suggest_mode", A1a);
                    A0A7.putExtra("extra_parent_group_jid", C72463Mc.A0n(r45));
                    A0A7.putExtra("extra_groups_to_be_linked", C22971Dz.A0B(A0y2));
                    linkExistingGroups.CNh(A0A7, 1007);
                    return;
                }
            } else if (!(this instanceof CommunityAdminPickerActivity) && (this instanceof FavoritePicker)) {
                FavoritePicker favoritePicker = (FavoritePicker) this;
                FavoritePickerViewModel A0Y2 = AnonymousClass3MZ.A0Y(favoritePicker);
                List unmodifiableList3 = Collections.unmodifiableList(favoritePicker.A0i);
                C18070vi.A0X(unmodifiableList3);
                AnonymousClass5DX r46 = new AnonymousClass5DX(favoritePicker);
                AnonymousClass3MW.A1X(A0Y2.A0G, new FavoritePickerViewModel$addFavorites$1(A0Y2, unmodifiableList3, (C30391dr) null, r46), C41561wd.A00(A0Y2));
                return;
            } else {
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
        str = "xFamilyUserFlowLogger";
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 == 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r1.isEmpty() != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r2 == 0) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4t() {
        /*
            r3 = this;
            java.util.List r1 = r3.A0i
            int r2 = r1.size()
            boolean r0 = r3 instanceof com.whatsapp.lists.picker.ListsContactPickerActivity
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3 instanceof com.whatsapp.favorites.picker.FavoritesPickerActivity
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 != 0) goto L_0x0015
            r3.A4u(r2)
        L_0x0015:
            boolean r0 = r3 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x0022
            if (r2 != 0) goto L_0x0072
        L_0x001b:
            X.1YQ r1 = r3.A03
        L_0x001d:
            r0 = 1
            r1.A04(r0)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r3 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x002b
            X.1YQ r1 = r3.A03
            if (r2 != 0) goto L_0x007c
            goto L_0x001d
        L_0x002b:
            boolean r0 = r3 instanceof X.C77073pJ
            if (r0 == 0) goto L_0x0047
            if (r2 == 0) goto L_0x001b
            java.util.ArrayList r1 = r3.A0h
            X.C18070vi.A0W(r1)
            boolean r0 = X.C17880vN.A1X(r1)
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0056
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0056
            goto L_0x001b
        L_0x0047:
            java.util.List r0 = r3.A0T
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0072
            goto L_0x001b
        L_0x0056:
            java.util.Iterator r2 = r1.iterator()
        L_0x005a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            X.4EO r1 = (X.AnonymousClass4EO) r1
            boolean r0 = r1 instanceof X.C77663r9
            if (r0 == 0) goto L_0x005a
            X.3rD r1 = (X.AnonymousClass3rD) r1
            X.1E7 r0 = r1.A00
            boolean r0 = r0.A0y
            if (r0 == 0) goto L_0x005a
        L_0x0072:
            boolean r0 = r3 instanceof X.C77053p5
            if (r0 != 0) goto L_0x0021
            boolean r0 = r3 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 != 0) goto L_0x0021
            X.1YQ r1 = r3.A03
        L_0x007c:
            r0 = 1
            r1.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3gf.A4t():void");
    }

    public void A4v(View view, View view2, View view3, View view4) {
        view4.setVisibility(8);
        view.setVisibility(8);
        view2.setVisibility(8);
        view3.setVisibility(0);
        int A4d = A4d();
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = this.A0R;
        AnonymousClass3MY.A0y(this, (TextView) view3, A1a, A4d);
    }

    public void A4x(SelectionCheckView selectionCheckView, AnonymousClass1E7 r4, boolean z) {
        AnonymousClass4SL r1;
        int i;
        selectionCheckView.A04(r4.A0y, z);
        if (A4h() != 0 && (r1 = (AnonymousClass4SL) this.A02.findViewWithTag(r4).getTag(2131432845)) != null) {
            boolean z2 = r4.A0y;
            View view = r1.A01;
            if (z2) {
                i = A4h();
            } else {
                i = 0;
            }
            view.setBackgroundResource(i);
        }
    }

    public void A4y(AnonymousClass4SL r4, AnonymousClass1E7 r5) {
        float f;
        C37451pZ r1 = this.A0e;
        if (r1 != null) {
            r1.A07(r4.A02, r5);
        }
        r4.A00 = r5;
        r4.A04.A0A(r5, this.A0S);
        View view = r4.A01;
        C90084dV.A00(view, this, r5, r4, 39);
        if (A4f() != this.A0i.size() || r5.A0y || (this instanceof C77073pJ) || (this instanceof C77053p5)) {
            f = 1.0f;
        } else {
            f = 0.38f;
        }
        view.setAlpha(f);
        SelectionCheckView selectionCheckView = r4.A05;
        selectionCheckView.setTag(r5);
        selectionCheckView.setTag(2131432845, r4);
        A4z(r4, r5);
    }

    public void A50(C133356oc r3) {
        if (AnonymousClass1E7.A03(r3, this.A0T)) {
            this.A01.notifyDataSetChanged();
            SelectedContactsList selectedContactsList = this.A0A;
            if (selectedContactsList == null) {
                return;
            }
            if (((r3 instanceof C46202Do) || (r3 instanceof C116835yh)) && AnonymousClass1E7.A03(r3, selectedContactsList.A09)) {
                selectedContactsList.A07.notifyDataSetChanged();
            }
        }
    }

    public void A51(AnonymousClass1E7 r7) {
        if (this instanceof ListsContactPickerActivity) {
            C18070vi.A0d(r7, 0);
            C22941Dw r0 = UserJid.Companion;
            UserJid A012 = C22941Dw.A01(AnonymousClass3MW.A0g(r7));
            if (A012 == null) {
                Log.e("ListsContactPickerActivity/onBlockedItemPressed: jid is null");
                return;
            }
            CMl(C87374Vi.A01(C87374Vi.A00(this, (C37551pj) C18070vi.A0E(this.A0J), A012), C17880vN.A0q(this, r7.A0K(), AnonymousClass3MW.A1a(), 0, 2131897281), 2131887211, false));
        } else if (this instanceof GroupMembersSelector) {
            CMl(C87374Vi.A01(C87374Vi.A00(this, AnonymousClass3MW.A0V(this.A0J), (UserJid) C72453Mb.A0m(r7)), C17880vN.A0q(this, this.A08.A0I(r7), AnonymousClass3MW.A1a(), 0, 2131897278), 2131887212, false));
        } else if (this instanceof EditBroadcastRecipientsSelector) {
            C18070vi.A0d(r7, 0);
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass3MX.A1N(this.A08, r7, A1a, 0);
            String string = getString(2131897274, A1a);
            Jid A0m = C72453Mb.A0m(r7);
            C18070vi.A0X(A0m);
            CMl(C87374Vi.A01(C87374Vi.A00(this, (C37551pj) C18070vi.A0E(this.A0J), (UserJid) A0m), string, 2131887212, false));
        } else if (this instanceof AnonymousClass3qm) {
            C18070vi.A0d(r7, 0);
            Object[] A1a2 = AnonymousClass3MW.A1a();
            AnonymousClass3MX.A1N(this.A08, r7, A1a2, 0);
            String string2 = getString(2131897274, A1a2);
            Jid A0m2 = C72453Mb.A0m(r7);
            C18070vi.A0X(A0m2);
            CMl(C87374Vi.A01(C87374Vi.A00(this, (C37551pj) C18070vi.A0E(this.A0J), (UserJid) A0m2), string2, 2131887212, false));
        } else if (this instanceof AddGroupParticipantsSelector) {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            C18070vi.A0d(r7, 0);
            int i = 2131897278;
            if (C72453Mb.A1a(addGroupParticipantsSelector.A0T)) {
                i = 2131897275;
            }
            String A0q = C17880vN.A0q(addGroupParticipantsSelector, C74803cp.A0V(addGroupParticipantsSelector, r7).A00.A01, new Object[1], 0, i);
            C18070vi.A0b(A0q);
            Jid A0m3 = C72453Mb.A0m(r7);
            C18070vi.A0X(A0m3);
            C72453Mb.A1I(C87374Vi.A01(C87374Vi.A00(addGroupParticipantsSelector, (C37551pj) C18070vi.A0E(addGroupParticipantsSelector.A0J), (UserJid) A0m3), A0q, 2131887212, false), addGroupParticipantsSelector);
        } else if (this instanceof FavoritePicker) {
            FavoritePicker favoritePicker = (FavoritePicker) this;
            C18070vi.A0d(r7, 0);
            AnonymousClass3MZ.A0H(favoritePicker).A01(new FavoritePicker$onBlockedItemPressed$1(favoritePicker, r7, (C30391dr) null));
        } else if (this instanceof GroupCallParticipantPicker) {
            C72453Mb.A1I(C87374Vi.A01(C87374Vi.A00(this, AnonymousClass3MW.A0V(this.A0J), (UserJid) C72453Mb.A0m(r7)), C17880vN.A0q(this, this.A08.A0I(r7), AnonymousClass3MW.A1a(), 0, 2131897279), 2131887212, false), this);
        }
    }

    public void A54(String str) {
        if (str == null) {
            str = "";
        }
        this.A0R = str;
        ArrayList A032 = C20103A7h.A03(this.A0F, str);
        this.A0S = A032;
        if (A032.isEmpty()) {
            this.A0S = null;
        }
        A0y();
    }

    public void A55(ArrayList arrayList) {
        this.A06.A0m(arrayList);
    }

    public void A56(List list) {
        this.A0U.clear();
        findViewById(2131430533).setVisibility(8);
        AnonymousClass3MX.A1H(this, 2131430534, 8);
        AnonymousClass3MX.A1H(this, 2131434675, 8);
        A0z();
        View findViewById = findViewById(2131434940);
        ((C133146oF) this.A0M.get()).A00(new C94244kJ(findViewById, this, list), this.A0R);
    }

    public boolean A5B() {
        return AnonymousClass000.A1W(this.A0c);
    }

    public boolean A5C(AnonymousClass1E7 r4) {
        Class<UserJid> cls = UserJid.class;
        if (r4.A06(cls) == null || !AnonymousClass3MW.A0V(this.A0J).A0P((UserJid) r4.A06(cls))) {
            return false;
        }
        return true;
    }

    public void BEb(AnonymousClass1E7 r2) {
        ((C108375bb) this.A0g.get()).BEa(this, r2);
    }

    public void C4v() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            C72453Mb.A1P(groupCallParticipantPicker.A0K);
            ArrayList A13 = AnonymousClass000.A13();
            GroupCallParticipantPicker.A18(groupCallParticipantPicker, A13, groupCallParticipantPicker.A4p());
            if (groupCallParticipantPicker.A02.CNx(groupCallParticipantPicker, A13, AnonymousClass000.A0M(groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")), false) == 0) {
                C192539oZ r4 = (C192539oZ) groupCallParticipantPicker.A0E.get();
                Integer A0m = C17880vN.A0m();
                int i = 1;
                if (A13.size() != 1) {
                    i = 2;
                }
                r4.A01(A0m, Integer.valueOf(i), 2);
                GroupCallParticipantPicker.A15(groupCallParticipantPicker);
                C72453Mb.A14(groupCallParticipantPicker);
            }
        }
    }

    public void C4w() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            C72453Mb.A1P(groupCallParticipantPicker.A0K);
            ArrayList A13 = AnonymousClass000.A13();
            GroupCallParticipantPicker.A18(groupCallParticipantPicker, A13, groupCallParticipantPicker.A4p());
            if (groupCallParticipantPicker.A0N) {
                C17880vN.A1F(AnonymousClass3MZ.A08((AnonymousClass1VE) groupCallParticipantPicker.A0J.get()), "vr_start_call_with_ss", true);
            }
            int i = 1;
            if (groupCallParticipantPicker.A02.CNx(groupCallParticipantPicker, A13, AnonymousClass000.A0M(groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")), true) == 0) {
                C192539oZ r3 = (C192539oZ) groupCallParticipantPicker.A0E.get();
                Integer A0m = C17880vN.A0m();
                if (A13.size() != 1) {
                    i = 2;
                }
                r3.A01(A0m, Integer.valueOf(i), 3);
                GroupCallParticipantPicker.A15(groupCallParticipantPicker);
                groupCallParticipantPicker.setResult(-1);
                if (!groupCallParticipantPicker.A0N) {
                    groupCallParticipantPicker.finish();
                }
            }
        }
    }

    public void CRZ() {
        ViewGroup viewGroup;
        int i;
        ViewGroup viewGroup2;
        String str;
        if (this instanceof AddGroupParticipantsSelector) {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            if (addGroupParticipantsSelector.A0Z && addGroupParticipantsSelector.A0i.isEmpty() && ((str = addGroupParticipantsSelector.A0R) == null || str.length() == 0)) {
                AnonymousClass1CJ r1 = addGroupParticipantsSelector.A05;
                if (r1 == null) {
                    AnonymousClass3MW.A1I();
                    throw null;
                } else if (!r1.A0R(AnonymousClass3MX.A0m(addGroupParticipantsSelector.A0Q))) {
                    viewGroup = addGroupParticipantsSelector.A00;
                }
            }
            viewGroup2 = addGroupParticipantsSelector.A00;
            i = 8;
            viewGroup.setVisibility(i);
        } else if (!this.A0Z || (!this.A0i.isEmpty() && !(this instanceof C77073pJ) && !(this instanceof C77053p5))) {
            viewGroup2 = this.A00;
            i = 8;
            viewGroup.setVisibility(i);
        } else {
            viewGroup = this.A00;
        }
        i = 0;
        viewGroup.setVisibility(i);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (adapterContextMenuInfo != null) {
            getListView().getItemAtPosition(adapterContextMenuInfo.position);
        }
    }

    public boolean onSearchRequested() {
        WDSSearchBar wDSSearchBar = this.A0H;
        if (wDSSearchBar == null) {
            return false;
        }
        WDSSearchBar.A01(wDSSearchBar, true, true);
        return false;
    }

    private void A0z() {
        View findViewById = findViewById(2131429490);
        View findViewById2 = findViewById(2131429489);
        View findViewById3 = findViewById(2131434939);
        View findViewById4 = findViewById(2131431631);
        View findViewById5 = findViewById(2131430533);
        if (!C72463Mc.A1W(this.A0L) && !AnonymousClass3MX.A0g(this.A0P).A07()) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (A5B()) {
            A4w(findViewById, findViewById2, findViewById3, findViewById4);
        } else {
            if (!TextUtils.isEmpty(this.A0R)) {
                if (!(this instanceof AddGroupParticipantsSelector) || (!C72453Mb.A1a(((AddGroupParticipantsSelector) this).A0a))) {
                    if (this.A0X) {
                        findViewById4.setVisibility(0);
                    } else if (findViewById5.getVisibility() != 0) {
                        findViewById3.setVisibility(0);
                        Object[] A1a = AnonymousClass3MW.A1a();
                        A1a[0] = this.A0R;
                        AnonymousClass3MY.A0y(this, (TextView) findViewById3, A1a, 2131895497);
                        findViewById4.setVisibility(8);
                    }
                    findViewById.setVisibility(8);
                    findViewById2.setVisibility(8);
                }
            }
            if (A4d() != 0) {
                A4v(findViewById, findViewById2, findViewById3, findViewById4);
            } else {
                findViewById4.setVisibility(8);
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                findViewById3.setVisibility(8);
                if (this instanceof InviteNewsletterAdminSelector) {
                    C72453Mb.A1D(findViewById(2131429489));
                    TextView A0L2 = AnonymousClass3MX.A0L(this, 2131434939);
                    if (A0L2 != null) {
                        A0L2.setVisibility(0);
                        A0L2.setText(2131891456);
                    }
                }
            }
        }
        A4t();
    }

    public void A4u(int i) {
        int i2;
        Object[] A1b;
        C003401n A0J2 = AnonymousClass3MY.A0J(this);
        int A4f = A4f();
        C17960vV.A0F(AnonymousClass000.A1R(A4f), "Max contacts must be positive");
        Resources resources = getResources();
        if (A4f == Integer.MAX_VALUE) {
            i2 = 2131755253;
            A1b = new Object[1];
            C17880vN.A1T(A1b, i, 0);
        } else {
            i2 = 2131755259;
            A1b = AnonymousClass3MW.A1b();
            C17880vN.A1T(A1b, i, 0);
            C17880vN.A1T(A1b, A4f, 1);
        }
        A0J2.A0R(resources.getQuantityString(i2, i, A1b));
    }

    public void A4z(AnonymousClass4SL r5, AnonymousClass1E7 r6) {
        boolean z;
        if (!A5C(r6) || r6.A0y) {
            if ((this instanceof ListsContactPickerActivity) || (this instanceof FavoritesPickerActivity) || (this instanceof FavoritePicker)) {
                z = false;
            } else if (this instanceof GroupCallParticipantPicker) {
                z = C18020vd.A05(C18040vf.A02, this.A0E, 5839);
            } else {
                z = true;
            }
            if (z) {
                if (C18020vd.A05(C18040vf.A02, this.A0E, 5839)) {
                    String A012 = AnonymousClass72Y.A01(this, this.A05, r6);
                    if (!AnonymousClass1EG.A0H(A012)) {
                        TextEmojiLabel textEmojiLabel = r5.A03;
                        textEmojiLabel.A0R(A012);
                        textEmojiLabel.setVisibility(0);
                        r5.A01(r6.A0y);
                        return;
                    }
                } else if (r6.A0Z != null) {
                    TextEmojiLabel textEmojiLabel2 = r5.A03;
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel2.A0R(r6.A0Z);
                    String str = r6.A0Z;
                    if (str == null) {
                        str = "";
                    }
                    textEmojiLabel2.A0R(str);
                    r5.A01(r6.A0y);
                    return;
                }
            }
            r5.A03.setVisibility(8);
            r5.A01(r6.A0y);
            return;
        }
        r5.A00(getString(2131896778), true, 1);
    }

    public void A52(AnonymousClass1E7 r4, boolean z) {
        if (A4f() == this.A0i.size()) {
            this.A01.notifyDataSetChanged();
        }
        SelectedContactsList selectedContactsList = this.A0A;
        if (selectedContactsList != null && !(this instanceof C77073pJ) && !(this instanceof C77053p5)) {
            selectedContactsList.A07.A0H(AnonymousClass3MX.A01(selectedContactsList.A09));
        }
    }

    public void A53(AnonymousClass1E7 r6, boolean z) {
        int A4f = A4f();
        List list = this.A0i;
        boolean A1T = AnonymousClass000.A1T(A4f, list.size());
        int indexOf = list.indexOf(r6);
        if (indexOf < 0) {
            indexOf = 0;
            while (indexOf < list.size()) {
                if (!C42171xk.A00(r6.A0J, ((AnonymousClass1E7) list.get(indexOf)).A0J)) {
                    indexOf++;
                } else if (indexOf < 0) {
                    return;
                }
            }
            return;
        }
        list.remove(indexOf);
        if (A1T) {
            this.A01.notifyDataSetChanged();
        }
        SelectedContactsList selectedContactsList = this.A0A;
        if (selectedContactsList != null) {
            selectedContactsList.A07.A0I(indexOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (X.C72453Mb.A1a(r1.A0a) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if ((!X.AnonymousClass3MX.A1V(r8)) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if ((!X.AnonymousClass3MX.A1V(r8)) != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (X.C72453Mb.A1a(r1.A0a) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5A(java.util.List r9) {
        /*
            r8 = this;
            r0 = 2131434940(0x7f0b1dbc, float:1.8491708E38)
            android.view.ViewGroup r5 = X.AnonymousClass3MX.A0F(r8, r0)
            r0 = 2131432785(0x7f0b1551, float:1.8487337E38)
            android.view.View r4 = r8.findViewById(r0)
            java.lang.String r0 = r8.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r2 = 8
            if (r0 != 0) goto L_0x0036
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0036
            r1 = r8
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x009c
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r1 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r1
            boolean r0 = X.AnonymousClass3MX.A1V(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0036
            X.0vl r0 = r1.A0a
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00a4
        L_0x0036:
            r4.setVisibility(r2)
        L_0x0039:
            android.view.ViewGroup r0 = r8.A0b
            if (r0 != 0) goto L_0x0063
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r8)
            r8.A0b = r7
            r6 = 2131232176(0x7f0805b0, float:1.8080454E38)
            r4 = 2131892002(0x7f121722, float:1.941874E38)
            android.view.LayoutInflater r1 = r8.getLayoutInflater()
            r0 = 0
            android.view.View r1 = X.C88554a7.A02(r1, r0, r6, r4)
            r0 = 24
            X.AnonymousClass48m.A00(r1, r8, r0)
            X.AnonymousClass3MW.A1Q(r1)
            r7.addView(r1)
            android.view.ViewGroup r0 = r8.A0b
            r5.addView(r0)
        L_0x0063:
            java.lang.String r0 = r8.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0088
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0088
            r1 = r8
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x008e
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r1 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r1
            boolean r0 = X.AnonymousClass3MX.A1V(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0088
            X.0vl r0 = r1.A0a
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0096
        L_0x0088:
            android.view.ViewGroup r0 = r8.A0b
            r0.setVisibility(r2)
            return
        L_0x008e:
            boolean r0 = X.AnonymousClass3MX.A1V(r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0088
        L_0x0096:
            android.view.ViewGroup r0 = r8.A0b
            r0.setVisibility(r3)
            return
        L_0x009c:
            boolean r0 = X.AnonymousClass3MX.A1V(r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0036
        L_0x00a4:
            boolean r0 = r4 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00ba
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            boolean r1 = X.AnonymousClass3MX.A1U(r8)
            r0 = 2131626111(0x7f0e087f, float:1.8879449E38)
            if (r1 == 0) goto L_0x00b6
            r0 = 2131626112(0x7f0e0880, float:1.887945E38)
        L_0x00b6:
            android.view.View r4 = X.AnonymousClass3MY.A0G(r4, r0)
        L_0x00ba:
            r4.setVisibility(r3)
            boolean r0 = X.AnonymousClass3MX.A1U(r8)
            if (r0 != 0) goto L_0x0039
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.C43421zm.A04(r4)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3gf.A5A(java.util.List):void");
    }

    public void BzM(String str) {
        Integer A4n = A4n();
        if (A4n != null && !TextUtils.isEmpty(str)) {
            this.A0B.A04(this, A4n, str, "sms:");
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            C72453Mb.A1O(this.A0I);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (adapterContextMenuInfo != null) {
            getListView().getItemAtPosition(adapterContextMenuInfo.position);
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        ListView listView;
        int dimensionPixelSize;
        Resources resources;
        int i2;
        int i3;
        super.onCreate(bundle);
        if (this instanceof ContactsAttachmentSelector) {
            i = 2131626118;
            if (C87544Vz.A00(this.A0E)) {
                i = 2131626109;
            }
        } else if (this instanceof GroupCallParticipantPickerSheet) {
            i = 2131625478;
        } else {
            i = 2131626118;
        }
        setContentView(i);
        C003401n A0S2 = C72463Mc.A0S(this, AnonymousClass3Ma.A0G(this));
        A0S2.A0W(true);
        A0S2.A0G();
        A0S2.A0M(A4c());
        if ((this instanceof ListsContactPickerActivity) || (this instanceof FavoritesPickerActivity) || (this instanceof FavoritePicker)) {
            A0S2.A0R((CharSequence) null);
        }
        this.A0e = this.A09.A06(this, "multiple-contact-picker");
        WDSSearchBar wDSSearchBar = (WDSSearchBar) findViewById(2131436274);
        this.A0H = wDSSearchBar;
        if (wDSSearchBar != null) {
            wDSSearchBar.A08.setOnQueryTextChangeListener(new C98454rB(this, 0));
            this.A0H.A08.setTrailingButtonIcon(AnonymousClass4CB.A00);
        }
        ListView listView2 = getListView();
        this.A02 = listView2;
        boolean z2 = this instanceof GroupCallParticipantPicker;
        if (z2) {
            z = false;
        } else {
            z = true;
        }
        listView2.setFastScrollAlwaysVisible(z);
        this.A02.setScrollBarStyle(33554432);
        if (z2) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            groupCallParticipantPicker.A05 = C72453Mb.A0s(groupCallParticipantPicker.A00, 2131434326);
            GroupCallParticipantPicker.A17(groupCallParticipantPicker);
        }
        if (!(this instanceof LinkExistingGroupActivity)) {
            C108375bb r3 = (C108375bb) this.A0g.get();
            if (z2) {
                i3 = 2131625483;
            } else {
                i3 = 2131626871;
            }
            this.A0A = r3.CLH(this, this, this.A0i, i3);
        }
        if (A4k() != null) {
            this.A02.addHeaderView(A4k(), (Object) null, false);
        }
        if (z2) {
            GroupCallParticipantPicker groupCallParticipantPicker2 = (GroupCallParticipantPicker) this;
            ArrayList A13 = AnonymousClass000.A13();
            A13.add(GroupCallParticipantPicker.A12(groupCallParticipantPicker2));
            if (C18020vd.A00(C18040vf.A02, groupCallParticipantPicker2.A0E, 11714) >= 1) {
                A13.add(GroupCallParticipantPicker.A13(groupCallParticipantPicker2));
            }
            if (A13.size() != 0) {
                ((EmptyTellAFriendView) findViewById(2131429489)).setHeaderView(A13);
            }
        }
        List list = this.A0i;
        list.clear();
        if (bundle != null) {
            ArrayList A1A = AnonymousClass3MZ.A1A(bundle, AnonymousClass1BI.class, "selected_jids");
            if (!A1A.isEmpty()) {
                Iterator it = A1A.iterator();
                while (it.hasNext()) {
                    AnonymousClass1E7 A0E2 = this.A06.A0E(C17880vN.A0Q(it));
                    if (A0E2 != null) {
                        A0E2.A0y = true;
                        list.add(A0E2);
                    }
                }
            }
        } else {
            this.A0W = C22971Dz.A0A(AnonymousClass1BI.class, getIntent().getStringArrayListExtra("selected"));
        }
        A4r();
        this.A02.setOnScrollListener(new C90774ec(this));
        this.A02.setFastScrollEnabled(true);
        this.A02.setScrollbarFadingEnabled(true);
        boolean A1Z = AnonymousClass3MW.A1Z(this.A0F);
        ListView listView3 = this.A02;
        if (A1Z) {
            listView3.setVerticalScrollbarPosition(1);
            listView = this.A02;
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166071);
            resources = getResources();
            i2 = 2131166070;
        } else {
            listView3.setVerticalScrollbarPosition(2);
            listView = this.A02;
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166070);
            resources = getResources();
            i2 = 2131166071;
        }
        listView.setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i2), 0);
        C90814eg.A00(this.A02, this, 2);
        this.A00 = AnonymousClass3MX.A0F(this, 2131437007);
        View A4l = A4l();
        if (A4l != null) {
            this.A0Z = true;
            this.A00.removeAllViews();
            this.A00.addView(A4l);
        } else {
            String A4o = A4o();
            this.A0Z = !TextUtils.isEmpty(A4o);
            AnonymousClass3MX.A0L(this, 2131437014).setText(A4o);
        }
        CRZ();
        AnonymousClass3Oi r0 = new AnonymousClass3Oi(this, this, this.A0h);
        this.A01 = r0;
        A4b(r0);
        AnonymousClass1YQ r1 = (AnonymousClass1YQ) C110885hR.A0A(this, 2131433119);
        this.A03 = r1;
        if (!(this instanceof C77053p5) && !z2) {
            r1.setImageDrawable(A4j());
            AnonymousClass3MY.A0w(this, this.A03, A4i());
            AnonymousClass48m.A00(this.A03, this, 22);
        }
        ((EmptyTellAFriendView) findViewById(2131429489)).setInviteButtonClickListener(new AnonymousClass783(this, 38));
        AnonymousClass48m.A00(findViewById(2131428611), this, 23);
        registerForContextMenu(this.A02);
        A0z();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = AnonymousClass3MX.A07(menu, 2131432620, 2131899369).setIcon(2131232271);
        this.A0a = icon;
        icon.setShowAsAction(2);
        this.A0a.setVisible(AnonymousClass000.A1a(this.A0T));
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0T.clear();
        this.A0h.clear();
        C37451pZ r0 = this.A0e;
        if (r0 != null) {
            r0.A02();
            this.A0e = null;
        }
        C826949j r02 = this.A0c;
        if (r02 != null) {
            r02.A0B(true);
            this.A0c = null;
        }
        AnonymousClass499 r03 = this.A0d;
        if (r03 != null) {
            r03.A0B(true);
            this.A0d = null;
        }
        C825548v r04 = this.A0D;
        if (r04 != null) {
            r04.A0B(true);
            this.A0D = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131432620) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            A4q();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        this.A07.unregisterObserver(this.A0j);
        C17880vN.A0V(this.A0K).unregisterObserver(this.A0k);
        C17880vN.A0V(this.A0N).unregisterObserver(this.A0f.get());
    }

    public void onResume() {
        super.onResume();
        this.A07.registerObserver(this.A0j);
        C17880vN.A0V(this.A0K).registerObserver(this.A0k);
        C17880vN.A0V(this.A0N).registerObserver(this.A0f.get());
        this.A01.notifyDataSetChanged();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        List list = this.A0i;
        if (!list.isEmpty()) {
            ArrayList A14 = AnonymousClass000.A14(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C72473Md.A1N(A14, it);
            }
            AnonymousClass3MY.A17(bundle, "selected_jids", A14);
        }
    }
}
