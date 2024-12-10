package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.48v  reason: invalid class name and case insensitive filesystem */
public final class C825548v extends A34 {
    public final WeakReference A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C825548v(AnonymousClass3gf r2, List list) {
        super(r2, true);
        C18070vi.A0d(list, 2);
        this.A01 = list;
        this.A00 = AnonymousClass3MW.A0z(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: com.whatsapp.contact.picker.BroadcastListMembersSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: com.whatsapp.conversation.EditBroadcastRecipientsSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: com.whatsapp.favorites.picker.FavoritesPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: com.whatsapp.lists.picker.ListsContactPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: com.whatsapp.contact.picker.BroadcastListMembersSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: com.whatsapp.contact.picker.BroadcastListMembersSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker} */
    /* JADX WARNING: type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r0v185, types: [X.4XO, X.3rJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v248, types: [X.4XO, X.3rJ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02cf, code lost:
        if (r0 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x047b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0E, 4575) != false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r0 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0591, code lost:
        if (r1 == null) goto L_0x0593;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0618, code lost:
        if (r6 == null) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0864, code lost:
        if (X.AnonymousClass3MX.A0g(((com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r4).A0C).A00() == false) goto L_0x0866;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0653  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06d7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.ref.WeakReference r0 = r13.A00
            java.lang.Object r4 = r0.get()
            X.3gf r4 = (X.AnonymousClass3gf) r4
            if (r4 == 0) goto L_0x08a3
            boolean r0 = r4 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x0051
            r7 = r4
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r7 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r7
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.List r0 = r7.A06
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r6 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r1.next()
            X.4NS r0 = (X.AnonymousClass4NS) r0
            X.1E7 r0 = r0.A00
            r6.add(r0)
            goto L_0x0021
        L_0x0033:
            r5 = 2131891457(0x7f121501, float:1.9417635E38)
            r2 = 0
            r1 = 1
            X.3rF r0 = new X.3rF
            r0.<init>(r6, r5, r1, r2)
            r3.add(r0)
        L_0x0040:
            java.util.List r5 = r7.A0T
            X.C18070vi.A0W(r5)
            r2 = 2131888810(0x7f120aaa, float:1.9412266E38)
            r1 = 0
            r0 = 1
            X.4XO r6 = new X.4XO
            r6.<init>(r5, r2, r0, r1)
            goto L_0x06ba
        L_0x0051:
            boolean r0 = r4 instanceof com.whatsapp.lists.picker.ListsContactPickerActivity
            if (r0 == 0) goto L_0x0159
            r2 = r4
            com.whatsapp.lists.picker.ListsContactPickerActivity r2 = (com.whatsapp.lists.picker.ListsContactPickerActivity) r2
            X.0vl r0 = r2.A01
            java.lang.Object r7 = r0.getValue()
            com.whatsapp.lists.picker.ListsContactPickerViewModel r7 = (com.whatsapp.lists.picker.ListsContactPickerViewModel) r7
            java.lang.String r0 = r2.A0R
            java.util.List r6 = r2.A0T
            X.C18070vi.A0W(r6)
            if (r0 == 0) goto L_0x0110
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x0110
            X.0wS r1 = X.C18460wS.A00
        L_0x0071:
            java.util.ArrayList r3 = X.C29431cG.A0m(r1)
            boolean r0 = X.C17880vN.A1X(r3)
            if (r0 == 0) goto L_0x06bf
        L_0x007b:
            if (r3 == 0) goto L_0x08a3
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x08a3
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.HashSet r8 = X.C17880vN.A12()
            java.util.Iterator r9 = r3.iterator()
        L_0x008f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x06cd
            java.lang.Object r7 = r9.next()
            X.4XO r7 = (X.AnonymousClass4XO) r7
            java.util.List r6 = r13.A01
            boolean r0 = r7 instanceof X.C77713rI
            if (r0 == 0) goto L_0x00be
            java.util.List r0 = r7.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x00a7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008f
            X.1E7 r1 = X.C17880vN.A0O(r2)
            java.util.ArrayList r0 = r7.A01
            r0.add(r1)
            X.1BI r0 = r1.A0J
            if (r0 == 0) goto L_0x00a7
            r8.add(r0)
            goto L_0x00a7
        L_0x00be:
            boolean r0 = r7 instanceof X.C77743rN
            if (r0 == 0) goto L_0x00de
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.util.List r0 = r7.A02
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00d0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008f
            X.1E7 r0 = X.C17880vN.A0O(r1)
            X.AnonymousClass4XO.A00(r7, r0, r6, r8)
            goto L_0x00d0
        L_0x00de:
            boolean r1 = r7 instanceof X.C77683rF
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.util.List r0 = r7.A02
            if (r1 == 0) goto L_0x00fa
            java.util.Iterator r1 = r0.iterator()
        L_0x00ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008f
            X.1E7 r0 = X.C17880vN.A0O(r1)
            X.AnonymousClass4XO.A00(r7, r0, r6, r8)
            goto L_0x00ec
        L_0x00fa:
            java.util.Iterator r2 = r0.iterator()
        L_0x00fe:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008f
            X.1E7 r1 = X.C17880vN.A0O(r2)
            boolean r0 = r1.A10
            if (r0 == 0) goto L_0x00fe
            X.AnonymousClass4XO.A00(r7, r1, r6, r8)
            goto L_0x00fe
        L_0x0110:
            r0 = 0
            com.whatsapp.lists.picker.ListsContactPickerViewModel$getSuggestionContacts$1 r1 = new com.whatsapp.lists.picker.ListsContactPickerViewModel$getSuggestionContacts$1
            r1.<init>(r7, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.AnonymousClass4GT.A00(r0, r1)
            java.util.List r5 = r7.A06
            java.util.Iterator r3 = r5.iterator()
        L_0x0121:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013c
            X.1E7 r1 = X.C17880vN.A0O(r3)
            X.0vl r0 = r7.A08
            java.util.Map r0 = X.AnonymousClass3MW.A12(r0)
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.contains(r1)
            r1.A0y = r0
            goto L_0x0121
        L_0x013c:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            boolean r0 = X.AnonymousClass000.A1a(r5)
            if (r0 == 0) goto L_0x014e
            X.3rK r0 = new X.3rK
            r0.<init>(r5)
            r1.add(r0)
        L_0x014e:
            boolean r0 = X.AnonymousClass000.A1a(r6)
            if (r0 == 0) goto L_0x0071
            X.AnonymousClass3gf.A10(r1, r6)
            goto L_0x0071
        L_0x0159:
            boolean r0 = r4 instanceof com.whatsapp.group.GroupMembersSelector
            if (r0 == 0) goto L_0x027b
            r5 = r4
            com.whatsapp.group.GroupMembersSelector r5 = (com.whatsapp.group.GroupMembersSelector) r5
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.List r0 = r5.A0D
            if (r0 != 0) goto L_0x0198
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r5.A0D = r0
            X.00H r0 = r5.A0B
            java.lang.Object r0 = r0.get()
            X.2kd r0 = (X.C58402kd) r0
            java.util.ArrayList r0 = r0.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x017e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0198
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1M9 r0 = r5.A06
            X.1E7 r1 = r0.A0E(r1)
            boolean r0 = r1.A10
            if (r0 == 0) goto L_0x017e
            java.util.List r0 = r5.A0D
            r0.add(r1)
            goto L_0x017e
        L_0x0198:
            java.util.List r7 = r5.A0D
            r6 = 1
            X.C18070vi.A0d(r7, r6)
            r2 = 2131888818(0x7f120ab2, float:1.9412282E38)
            r1 = 0
            X.3rG r0 = new X.3rG
            r0.<init>(r7, r2, r6, r1)
            r3.add(r0)
            java.lang.String r0 = r5.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0278
            X.1CJ r1 = r5.A02
            X.1EC r0 = r5.A07
            int r0 = r1.A06(r0)
            if (r0 == r6) goto L_0x0278
            X.00H r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.4Ln r0 = (X.C84964Ln) r0
            X.0ve r2 = r0.A00
            r1 = 7809(0x1e81, float:1.0943E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0278
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel r1 = r5.A06
            if (r1 == 0) goto L_0x0272
            java.util.List r0 = r5.A0i
            java.util.List r1 = r1.A0T(r0)
        L_0x01da:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0278
            int r9 = r1.size()
            X.3rK r0 = new X.3rK
            r0.<init>(r1)
            r3.add(r0)
        L_0x01ec:
            X.1CJ r1 = r5.A02
            X.1EC r0 = r5.A07
            int r0 = r1.A06(r0)
            r7 = 1
            if (r0 != r6) goto L_0x0215
            X.1CJ r1 = r5.A02
            X.1EC r0 = r5.A07
            java.lang.String r8 = r1.A0F(r0)
            java.util.List r6 = com.whatsapp.group.GroupMembersSelector.A0y(r5)
            r0 = 2
            X.C18070vi.A0d(r6, r0)
            r2 = 2131894267(0x7f121ffb, float:1.9423334E38)
            r1 = 0
            X.3rJ r0 = new X.3rJ
            r0.<init>(r6, r2, r7, r1)
            r0.A00 = r8
            r3.add(r0)
        L_0x0215:
            java.util.List r0 = r5.A0T
            X.AnonymousClass3gf.A10(r3, r0)
            java.lang.String r0 = r5.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x026f
            java.util.List r6 = r5.A0V
        L_0x0224:
            X.C18070vi.A0d(r6, r7)
            r2 = 2131893093(0x7f121b65, float:1.9420953E38)
            r1 = 0
            X.3rI r0 = new X.3rI
            r0.<init>(r6, r2, r7, r1)
            r3.add(r0)
            X.1Me r7 = r5.A08
            java.util.List r0 = r5.A0C
            if (r0 != 0) goto L_0x0252
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r5.A0C = r1
            X.1M9 r0 = r5.A06
            r0.A0v(r1)
            java.util.List r6 = r5.A0C
            X.1Me r2 = r5.A08
            X.0vb r1 = r5.A0F
            X.7Rj r0 = new X.7Rj
            r0.<init>(r2, r1)
            java.util.Collections.sort(r6, r0)
        L_0x0252:
            java.util.List r1 = r5.A0C
            X.3rN r0 = new X.3rN
            r0.<init>(r7, r1)
            r3.add(r0)
            X.00H r0 = r5.A08
            java.lang.Object r2 = r0.get()
            X.4Zv r2 = (X.C88474Zv) r2
            r1 = 89
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r2.A02(r1, r0)
            goto L_0x007b
        L_0x026f:
            java.util.List r6 = r5.A0U
            goto L_0x0224
        L_0x0272:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x01da
        L_0x0278:
            r9 = 0
            goto L_0x01ec
        L_0x027b:
            boolean r0 = r4 instanceof com.whatsapp.favorites.picker.FavoritesPickerActivity
            if (r0 == 0) goto L_0x0328
            r2 = r4
            com.whatsapp.favorites.picker.FavoritesPickerActivity r2 = (com.whatsapp.favorites.picker.FavoritesPickerActivity) r2
            X.0vl r0 = r2.A02
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.favorites.picker.FavoritesPickerViewModel r1 = (com.whatsapp.favorites.picker.FavoritesPickerViewModel) r1
            java.lang.String r0 = r2.A0R
            java.util.List r8 = r2.A0T
            X.C18070vi.A0W(r8)
            if (r0 == 0) goto L_0x02d3
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x02d3
            X.0wS r7 = X.C18460wS.A00
        L_0x029b:
            java.util.ArrayList r3 = X.C29431cG.A0m(r7)
            X.0ve r5 = r2.A0E
            r1 = 10137(0x2799, float:1.4205E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r5, r1)
            r1 = 1
            if (r0 != r1) goto L_0x02cb
            X.1IX r0 = com.whatsapp.favorites.picker.FavoritesPickerActivity.A0y(r2)
            if (r0 == 0) goto L_0x02cb
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != r1) goto L_0x02cb
            X.1IX r5 = com.whatsapp.favorites.picker.FavoritesPickerActivity.A0y(r2)
            if (r5 == 0) goto L_0x02cb
            X.1Me r1 = r2.A08
            X.C18070vi.A0W(r1)
            X.3rM r0 = new X.3rM
            r0.<init>(r1, r5)
            r3.add(r0)
        L_0x02cb:
            boolean r0 = X.C17880vN.A1X(r3)
            if (r0 == 0) goto L_0x06bf
            goto L_0x007b
        L_0x02d3:
            r0 = 0
            com.whatsapp.favorites.picker.FavoritesPickerViewModel$getSuggestionContacts$1 r3 = new com.whatsapp.favorites.picker.FavoritesPickerViewModel$getSuggestionContacts$1
            r3.<init>(r1, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.AnonymousClass4GT.A00(r0, r3)
            java.util.List r5 = r1.A0D
            java.util.Iterator r6 = r5.iterator()
        L_0x02e4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02ff
            X.1E7 r3 = X.C17880vN.A0O(r6)
            X.0vl r0 = r1.A0F
            java.util.Map r0 = X.AnonymousClass3MW.A12(r0)
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.contains(r3)
            r3.A0y = r0
            goto L_0x02e4
        L_0x02ff:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            boolean r0 = X.AnonymousClass000.A1a(r5)
            if (r0 == 0) goto L_0x031d
            X.3rK r0 = new X.3rK
            r0.<init>(r5)
            r7.add(r0)
            X.1xH r3 = r1.A08
            int r0 = r5.size()
            long r5 = (long) r0
            long r0 = r1.A01
            r3.A01(r5, r0)
        L_0x031d:
            boolean r0 = X.AnonymousClass000.A1a(r8)
            if (r0 == 0) goto L_0x029b
            X.AnonymousClass3gf.A10(r7, r8)
            goto L_0x029b
        L_0x0328:
            boolean r0 = r4 instanceof com.whatsapp.conversation.EditBroadcastRecipientsSelector
            if (r0 == 0) goto L_0x0374
            r7 = r4
            com.whatsapp.conversation.EditBroadcastRecipientsSelector r7 = (com.whatsapp.conversation.EditBroadcastRecipientsSelector) r7
            X.4tM r3 = new X.4tM
            r3.<init>(r7)
            X.0ve r2 = r7.A0E
            r1 = 10136(0x2798, float:1.4204E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            r1 = 1
            if (r0 != r1) goto L_0x007b
            X.1IX r0 = com.whatsapp.conversation.EditBroadcastRecipientsSelector.A0y(r7)
            if (r0 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != r1) goto L_0x007b
            java.util.List r6 = r7.A0T
            X.C18070vi.A0W(r6)
            r5 = 1
            r2 = 2131888810(0x7f120aaa, float:1.9412266E38)
            r1 = 0
            X.3rH r0 = new X.3rH
            r0.<init>(r6, r2, r1, r5)
            r3.add(r0)
            X.1IX r2 = com.whatsapp.conversation.EditBroadcastRecipientsSelector.A0y(r7)
        L_0x0363:
            if (r2 == 0) goto L_0x007b
            X.1Me r0 = r7.A08
            X.C18070vi.A0W(r0)
            X.3rM r1 = new X.3rM
            r1.<init>(r0, r2)
        L_0x036f:
            r3.add(r1)
            goto L_0x007b
        L_0x0374:
            boolean r0 = r4 instanceof com.whatsapp.contact.picker.BroadcastListMembersSelector
            if (r0 == 0) goto L_0x03b0
            r7 = r4
            com.whatsapp.contact.picker.BroadcastListMembersSelector r7 = (com.whatsapp.contact.picker.BroadcastListMembersSelector) r7
            X.4tM r3 = new X.4tM
            r3.<init>(r7)
            X.0ve r2 = r7.A0E
            r1 = 10136(0x2798, float:1.4204E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            r1 = 1
            if (r0 != r1) goto L_0x007b
            X.1IX r0 = com.whatsapp.contact.picker.BroadcastListMembersSelector.A0y(r7)
            if (r0 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != r1) goto L_0x007b
            java.util.List r6 = r7.A0T
            X.C18070vi.A0W(r6)
            r5 = 1
            r2 = 2131888810(0x7f120aaa, float:1.9412266E38)
            r1 = 0
            X.3rH r0 = new X.3rH
            r0.<init>(r6, r2, r1, r5)
            r3.add(r0)
            X.1IX r2 = com.whatsapp.contact.picker.BroadcastListMembersSelector.A0y(r7)
            goto L_0x0363
        L_0x03b0:
            boolean r0 = r4 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x04bf
            r5 = r4
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r5 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r5
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.4TN r6 = r5.A03
            java.lang.String r0 = r5.A0R
            if (r0 == 0) goto L_0x03c7
            int r0 = r0.length()
            if (r0 != 0) goto L_0x04bc
        L_0x03c7:
            boolean r0 = com.whatsapp.contact.picker.AddGroupParticipantsSelector.A14(r5)
            if (r0 == 0) goto L_0x04bc
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel r1 = r5.A0A
            if (r1 == 0) goto L_0x04b8
            java.util.List r0 = r5.A0i
            X.C18070vi.A0W(r0)
            java.util.List r1 = r1.A0T(r0)
        L_0x03da:
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x04bc
            int r7 = r1.size()
            X.3rK r0 = new X.3rK
            r0.<init>(r1)
            r3.add(r0)
        L_0x03ec:
            if (r6 == 0) goto L_0x0438
            X.1CJ r1 = r5.A05
            if (r1 == 0) goto L_0x089d
            X.0vl r0 = r5.A0Z
            X.1BI r0 = X.AnonymousClass3MX.A0m(r0)
            java.lang.String r11 = r1.A0F(r0)
            java.lang.String r0 = "com.whatsapp.community.DirectoryContactsLoader"
            java.util.Map r10 = r6.A00
            java.lang.Object r0 = r10.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x040a
            X.1Om r0 = X.C25511Om.A00
        L_0x040a:
            java.util.ArrayList r2 = X.C17880vN.A10(r0)
            r1 = 2131894267(0x7f121ffb, float:1.9423334E38)
            r9 = 0
            r8 = 1
            X.3rJ r0 = new X.3rJ
            r0.<init>(r2, r1, r8, r9)
            r0.A00 = r11
            r3.add(r0)
            java.lang.String r0 = "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader"
            java.lang.Object r0 = r10.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x0429
            X.1Om r0 = X.C25511Om.A00
        L_0x0429:
            java.util.ArrayList r2 = X.C17880vN.A10(r0)
            r1 = 2131888818(0x7f120ab2, float:1.9412282E38)
            X.3rG r0 = new X.3rG
            r0.<init>(r2, r1, r8, r9)
            r3.add(r0)
        L_0x0438:
            java.util.List r0 = r5.A0T
            X.C18070vi.A0W(r0)
            X.AnonymousClass3gf.A10(r3, r0)
            X.0vl r0 = r5.A0a
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0467
            java.lang.String r0 = r5.A0R
            if (r0 == 0) goto L_0x04b5
            int r0 = r0.length()
            if (r0 == 0) goto L_0x04b5
            java.util.List r9 = r5.A0U
        L_0x0454:
            X.C18070vi.A0b(r9)
            r8 = 1
            X.C18070vi.A0d(r9, r8)
            r2 = 2131893093(0x7f121b65, float:1.9420953E38)
            r1 = 0
            X.3rI r0 = new X.3rI
            r0.<init>(r9, r2, r8, r1)
            r3.add(r0)
        L_0x0467:
            if (r6 == 0) goto L_0x049c
            X.0vl r0 = r5.A0V
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x047d
            X.0ve r2 = r5.A0E
            r1 = 4575(0x11df, float:6.411E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x049c
        L_0x047d:
            X.1Me r2 = r5.A08
            X.C18070vi.A0W(r2)
            java.lang.String r1 = "com.whatsapp.contact.picker.NonWaContactsLoader"
            java.util.Map r0 = r6.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x0490
            X.1Om r0 = X.C25511Om.A00
        L_0x0490:
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            X.3rN r0 = new X.3rN
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x049c:
            X.0vl r0 = r5.A0b
            java.lang.Object r6 = r0.getValue()
            X.3U0 r6 = (X.AnonymousClass3U0) r6
            X.1OX r5 = X.C41561wd.A00(r6)
            X.0wl r2 = r6.A09
            r1 = 0
            com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$maybeLogContactsLoaded$1 r0 = new com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$maybeLogContactsLoaded$1
            r0.<init>(r6, r1, r7)
            X.AnonymousClass3MW.A1X(r2, r0, r5)
            goto L_0x007b
        L_0x04b5:
            java.util.List r9 = r5.A0V
            goto L_0x0454
        L_0x04b8:
            X.0wS r1 = X.C18460wS.A00
            goto L_0x03da
        L_0x04bc:
            r7 = 0
            goto L_0x03ec
        L_0x04bf:
            boolean r0 = r4 instanceof X.C77073pJ
            if (r0 == 0) goto L_0x04d6
            r2 = r4
            X.3pJ r2 = (X.C77073pJ) r2
            r0 = 0
            com.whatsapp.community.SelectCommunityForGroupActivitySettings$getSections$1 r1 = new com.whatsapp.community.SelectCommunityForGroupActivitySettings$getSections$1
            r1.<init>(r2, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r3 = X.AnonymousClass4GT.A00(r0, r1)
            java.util.List r3 = (java.util.List) r3
            goto L_0x007b
        L_0x04d6:
            boolean r0 = r4 instanceof X.C77053p5
            if (r0 == 0) goto L_0x04fc
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.List r0 = r4.A0T
            X.C18070vi.A0W(r0)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x06c6
            java.util.List r5 = r4.A0T
            X.C18070vi.A0W(r5)
            r2 = 2131888809(0x7f120aa9, float:1.9412264E38)
            r0 = 0
            X.3rE r1 = new X.3rE
            r1.<init>(r5, r2, r0, r0)
        L_0x04f7:
            r3.add(r1)
            goto L_0x007b
        L_0x04fc:
            boolean r0 = r4 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 == 0) goto L_0x05f0
            r9 = r4
            com.whatsapp.calling.favorite.FavoritePicker r9 = (com.whatsapp.calling.favorite.FavoritePicker) r9
            X.0ve r0 = r9.A0E
            r10 = 10137(0x2799, float:1.4205E-41)
            X.0vf r2 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r2, r0, r10)
            r0 = 1
            if (r1 != r0) goto L_0x0518
            X.1IX r0 = r9.A00
            X.1IX r0 = X.C74803cp.A0Q(r0, r9)
            r9.A00 = r0
        L_0x0518:
            X.1IX r8 = r9.A00
            java.lang.String r0 = r9.A0R
            r7 = 1
            if (r0 == 0) goto L_0x055b
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x055b
            X.4tM r3 = new X.4tM
            r3.<init>(r9)
            X.0ve r0 = r9.A0E
            int r1 = X.C18020vd.A00(r2, r0, r10)
            r0 = 1
            if (r1 == r7) goto L_0x0534
            r0 = 0
        L_0x0534:
            if (r0 == 0) goto L_0x007b
            if (r8 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass000.A1a(r8)
            if (r0 != r7) goto L_0x007b
            java.util.List r5 = r9.A0T
            X.C18070vi.A0W(r5)
            r2 = 2131888810(0x7f120aaa, float:1.9412266E38)
            r1 = 0
            X.3rH r0 = new X.3rH
            r0.<init>(r5, r2, r1, r7)
            r3.add(r0)
            X.1Me r0 = r9.A08
            X.C18070vi.A0W(r0)
            X.3rM r1 = new X.3rM
            r1.<init>(r0, r8)
            goto L_0x036f
        L_0x055b:
            X.0vl r6 = r9.A04
            java.lang.Object r5 = r6.getValue()
            com.whatsapp.calling.favorite.FavoritePickerViewModel r5 = (com.whatsapp.calling.favorite.FavoritePickerViewModel) r5
            java.lang.String r3 = "FavoritePickerViewModel"
            java.util.List r0 = r5.A04
            if (r0 != 0) goto L_0x058f
            r0 = 0
            com.whatsapp.calling.favorite.FavoritePickerViewModel$getContacts$1 r1 = new com.whatsapp.calling.favorite.FavoritePickerViewModel$getContacts$1     // Catch:{ Exception -> 0x0575 }
            r1.<init>(r5, r0)     // Catch:{ Exception -> 0x0575 }
            X.1OR r0 = X.AnonymousClass1OR.A00     // Catch:{ Exception -> 0x0575 }
            X.AnonymousClass4GT.A00(r0, r1)     // Catch:{ Exception -> 0x0575 }
            goto L_0x058f
        L_0x0575:
            r5 = move-exception
            boolean r0 = r5 instanceof java.lang.InterruptedException
            if (r0 == 0) goto L_0x0584
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)
            java.lang.String r0 = "/getContacts/was interrupted: "
        L_0x0580:
            X.C17900vP.A0X(r5, r0, r1)
            goto L_0x0593
        L_0x0584:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x08a2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)
            java.lang.String r0 = "/getContacts/was cancelled: "
            goto L_0x0580
        L_0x058f:
            java.util.List r1 = r5.A04
            if (r1 != 0) goto L_0x0595
        L_0x0593:
            X.0wS r1 = X.C18460wS.A00
        L_0x0595:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x05bd
            X.3rK r0 = new X.3rK
            r0.<init>(r1)
            r3.add(r0)
            java.lang.Object r1 = r6.getValue()
            com.whatsapp.calling.favorite.FavoritePickerViewModel r1 = (com.whatsapp.calling.favorite.FavoritePickerViewModel) r1
            X.00H r0 = r1.A0C
            java.lang.Object r11 = r0.get()
            X.1xH r11 = (X.C41901xH) r11
            int r0 = r1.A01
            long r5 = (long) r0
            long r0 = r1.A02
            r11.A01(r5, r0)
        L_0x05bd:
            java.util.List r0 = r9.A0T
            X.C18070vi.A0W(r0)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x05d0
            java.util.List r0 = r9.A0T
            X.C18070vi.A0W(r0)
            X.AnonymousClass3gf.A10(r3, r0)
        L_0x05d0:
            X.0ve r0 = r9.A0E
            int r1 = X.C18020vd.A00(r2, r0, r10)
            r0 = 1
            if (r1 == r7) goto L_0x05da
            r0 = 0
        L_0x05da:
            if (r0 == 0) goto L_0x007b
            if (r8 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass000.A1a(r8)
            if (r0 != r7) goto L_0x007b
            X.1Me r0 = r9.A08
            X.C18070vi.A0W(r0)
            X.3rM r1 = new X.3rM
            r1.<init>(r0, r8)
            goto L_0x04f7
        L_0x05f0:
            boolean r0 = r4 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x06c6
            r2 = r4
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r2
            r0 = 1
            r2.A0M = r0
            java.lang.String r0 = r2.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r0 == 0) goto L_0x069a
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel r5 = r2.A01
            if (r5 == 0) goto L_0x061b
            java.util.List r0 = r5.A02
            if (r0 != 0) goto L_0x0616
            r0 = 0
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$getContacts$1 r1 = new com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$getContacts$1     // Catch:{ Exception -> 0x061d }
            r1.<init>(r5, r0)     // Catch:{ Exception -> 0x061d }
            X.1OR r0 = X.AnonymousClass1OR.A00     // Catch:{ Exception -> 0x061d }
            X.AnonymousClass4GT.A00(r0, r1)     // Catch:{ Exception -> 0x061d }
        L_0x0616:
            java.util.List r6 = r5.A02
            if (r6 != 0) goto L_0x0632
            goto L_0x0630
        L_0x061b:
            r6 = 0
            goto L_0x0632
        L_0x061d:
            r5 = move-exception
            boolean r0 = r5 instanceof java.lang.InterruptedException
            if (r0 == 0) goto L_0x068a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupCallParticipantSuggestionsViewModel"
            r1.append(r0)
            java.lang.String r0 = "/getContacts/was interrupted: "
        L_0x062d:
            X.C17900vP.A0X(r5, r0, r1)
        L_0x0630:
            X.0wS r6 = X.C18460wS.A00
        L_0x0632:
            if (r6 == 0) goto L_0x069a
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x069a
            r2.A0M = r3
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.3rK r0 = new X.3rK
            r0.<init>(r6)
            r3.add(r0)
            java.util.List r0 = r2.A0T
            X.AnonymousClass3gf.A10(r3, r0)
            boolean r0 = com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker.A1B(r2)
            if (r0 == 0) goto L_0x0665
            X.1Me r5 = r2.A08
            java.util.ArrayList r1 = r2.A0L
            X.C17960vV.A07(r1)
            X.C18070vi.A0j(r5, r1)
            X.3rM r0 = new X.3rM
            r0.<init>(r5, r1)
            r3.add(r0)
        L_0x0665:
            X.73j r7 = X.C74803cp.A0c(r2)
            int r0 = r6.size()
            java.lang.Long r6 = X.C17880vN.A0n(r0)
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel r0 = r2.A01
            X.C17960vV.A07(r0)
            long r0 = r0.A00
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            X.10s r2 = r7.A02
            r1 = 12
            X.3Cl r0 = new X.3Cl
            r0.<init>(r7, r6, r5, r1)
            r2.execute(r0)
            goto L_0x007b
        L_0x068a:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x08a2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupCallParticipantSuggestionsViewModel"
            r1.append(r0)
            java.lang.String r0 = "/getContacts/was cancelled: "
            goto L_0x062d
        L_0x069a:
            boolean r0 = com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker.A1B(r2)
            if (r0 == 0) goto L_0x06bf
            r2.A0M = r3
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.List r0 = r2.A0T
            X.AnonymousClass3gf.A10(r3, r0)
            X.1Me r1 = r2.A08
            java.util.ArrayList r0 = r2.A0L
            X.C17960vV.A07(r0)
            X.C18070vi.A0j(r1, r0)
            X.3rM r6 = new X.3rM
            r6.<init>(r1, r0)
        L_0x06ba:
            r3.add(r6)
            goto L_0x007b
        L_0x06bf:
            X.4tM r3 = new X.4tM
            r3.<init>(r2)
            goto L_0x007b
        L_0x06c6:
            X.4tM r3 = new X.4tM
            r3.<init>(r4)
            goto L_0x007b
        L_0x06cd:
            java.util.Iterator r12 = r3.iterator()
        L_0x06d1:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x08c8
            java.lang.Object r7 = r12.next()
            X.4XO r7 = (X.AnonymousClass4XO) r7
            boolean r0 = r7.A03
            r8 = 1
            if (r0 != 0) goto L_0x06ff
            java.util.Iterator r2 = r3.iterator()
            r1 = 0
        L_0x06e7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x089a
            java.lang.Object r0 = r2.next()
            X.4XO r0 = (X.AnonymousClass4XO) r0
            java.util.ArrayList r0 = r0.A01
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 == 0) goto L_0x06e7
            int r1 = r1 + 1
            if (r1 <= r8) goto L_0x06e7
        L_0x06ff:
            r1 = 1
        L_0x0700:
            boolean r0 = r7 instanceof X.C77743rN
            if (r0 == 0) goto L_0x0827
            X.3rN r7 = (X.C77743rN) r7
            boolean r0 = r7 instanceof X.AnonymousClass3rM
            if (r0 == 0) goto L_0x0797
            java.util.LinkedHashMap r9 = X.C17880vN.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r8 = r7.A01
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x083b
            if (r1 == 0) goto L_0x0729
            java.lang.String r2 = r7.A01(r4)
            r1 = 0
            X.3rC r0 = new X.3rC
            r0.<init>(r2, r1)
            r6.add(r0)
        L_0x0729:
            java.util.Iterator r10 = r8.iterator()
        L_0x072d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0761
            X.1E7 r2 = X.C17880vN.A0O(r10)
            X.1Me r0 = r7.A00
            java.lang.String r1 = r0.A0I(r2)
            if (r1 == 0) goto L_0x072d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x072d
            boolean r0 = r9.containsKey(r1)
            if (r0 != 0) goto L_0x0752
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r9.put(r1, r0)
        L_0x0752:
            java.lang.Object r0 = r9.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x072d
            X.C18070vi.A0b(r2)
            r0.add(r2)
            goto L_0x072d
        L_0x0761:
            java.util.Iterator r8 = r8.iterator()
        L_0x0765:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x083b
            X.1E7 r1 = X.C17880vN.A0O(r8)
            X.1Me r0 = r7.A00
            java.lang.String r2 = r0.A0I(r1)
            if (r2 == 0) goto L_0x0765
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0765
            java.lang.Object r1 = r9.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0765
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0765
            X.3rA r0 = new X.3rA
            r0.<init>(r1)
            r6.add(r0)
            r9.remove(r2)
            goto L_0x0765
        L_0x0797:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r9 = r7.A01
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x083b
            if (r1 == 0) goto L_0x07b2
            java.lang.String r2 = r7.A01(r4)
            r1 = 0
            X.3rC r0 = new X.3rC
            r0.<init>(r2, r1)
            r6.add(r0)
        L_0x07b2:
            java.util.HashMap r10 = X.C17880vN.A11()
            java.util.Iterator r11 = r9.iterator()
        L_0x07ba:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x07ec
            X.1E7 r2 = X.C17880vN.A0O(r11)
            X.1Me r1 = r7.A00
            r0 = -1
            X.1yg r0 = r1.A0D(r2, r0)
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x07ba
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x07ba
            boolean r1 = r10.containsKey(r2)
            r0 = 1
            if (r1 == 0) goto L_0x07e8
            java.lang.Object r0 = r10.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = X.C72463Mc.A0B(r0)
            int r0 = r0 + 1
        L_0x07e8:
            X.C17890vO.A0z(r2, r10, r0)
            goto L_0x07ba
        L_0x07ec:
            java.util.Iterator r11 = r9.iterator()
        L_0x07f0:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x083b
            X.1E7 r9 = X.C17880vN.A0O(r11)
            X.C18070vi.A0b(r9)
            X.1Me r1 = r7.A00
            r0 = -1
            X.1yg r0 = r1.A0D(r9, r0)
            java.lang.String r2 = r0.A01
            r1 = 1
            if (r2 == 0) goto L_0x081e
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x081e
            java.lang.Object r0 = r10.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x081e
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x081e
            r1 = 0
        L_0x081e:
            X.3r8 r0 = new X.3r8
            r0.<init>(r9, r1)
            r6.add(r0)
            goto L_0x07f0
        L_0x0827:
            boolean r0 = r7 instanceof X.AnonymousClass3rL
            if (r0 == 0) goto L_0x0840
            X.3rL r7 = (X.AnonymousClass3rL) r7
            r0 = 0
            com.whatsapp.contact.picker.section.Sections$EligibleCommunitiesForLinkingGroupSection$getSectionContacts$1 r1 = new com.whatsapp.contact.picker.section.Sections$EligibleCommunitiesForLinkingGroupSection$getSectionContacts$1
            r1.<init>(r7, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r6 = X.AnonymousClass4GT.A00(r0, r1)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
        L_0x083b:
            r5.addAll(r6)
            goto L_0x06d1
        L_0x0840:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r8 = r7.A01
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x083b
            if (r1 == 0) goto L_0x0873
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0866
            boolean r0 = r4 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x0866
            r0 = r4
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r0 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r0
            X.00H r0 = r0.A0C
            X.1UN r0 = X.AnonymousClass3MX.A0g(r0)
            boolean r0 = r0.A00()
            r2 = 1
            if (r0 != 0) goto L_0x0867
        L_0x0866:
            r2 = 0
        L_0x0867:
            java.lang.String r1 = r7.A01(r4)
            X.3rC r0 = new X.3rC
            r0.<init>(r1, r2)
            r6.add(r0)
        L_0x0873:
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0880
            X.4EO r0 = r4.A4m()
            if (r0 == 0) goto L_0x0880
            r6.add(r0)
        L_0x0880:
            java.util.Iterator r2 = r8.iterator()
        L_0x0884:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x083b
            X.1E7 r1 = X.C17880vN.A0O(r2)
            X.C72453Mb.A1S(r1)
            X.3r7 r0 = new X.3r7
            r0.<init>(r1)
            r6.add(r0)
            goto L_0x0884
        L_0x089a:
            r1 = 0
            goto L_0x0700
        L_0x089d:
            X.AnonymousClass3MW.A1I()
            r0 = 0
            throw r0
        L_0x08a2:
            throw r5
        L_0x08a3:
            java.util.List r0 = r13.A01
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x08ad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08c4
            X.1E7 r1 = X.C17880vN.A0O(r2)
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.3r7 r0 = new X.3r7
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x08ad
        L_0x08c4:
            java.util.ArrayList r5 = X.C29431cG.A0m(r3)
        L_0x08c8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C825548v.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        AnonymousClass3gf r0 = (AnonymousClass3gf) this.A00.get();
        if (r0 != null) {
            r0.A59(list);
        }
    }
}
