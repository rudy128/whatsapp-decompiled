package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment;
import com.whatsapp.avatar.privacy.AvatarStickerAllowListPickerActivity;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.whatsapp.profile.AboutStatusBlockListPickerActivity;
import com.whatsapp.profile.PixBlockListPickerActivity;
import com.whatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.whatsapp.status.audienceselector.StatusRecipientsActivity;
import com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.5rQ  reason: invalid class name and case insensitive filesystem */
public abstract class C114635rQ extends C114975t4 {
    public MenuItem A00;
    public C19880zA A01;
    public AnonymousClass6LZ A02;
    public AnonymousClass6LT A03;
    public C72043Kk A04;
    public AnonymousClass1M9 A05;
    public C24671Lf A06;
    public C24921Me A07;
    public C37451pZ A08;
    public C27201Vd A09;
    public AnonymousClass4VZ A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public String A0G;
    public ArrayList A0H;
    public List A0I = AnonymousClass000.A13();
    public Set A0J = C17880vN.A12();
    public boolean A0K = true;
    public MenuItem A0L;
    public View A0M;
    public final Handler A0N;
    public final C110265fC A0O = new C110265fC(this);
    public final Runnable A0P;
    public final Set A0Q = C17880vN.A12();
    public final Set A0R;
    public final Set A0S = C17880vN.A12();
    public final C23581Gv A0T;
    public final C28741ap A0U;
    public final C25221Nj A0V;

    public void onCreate(Bundle bundle) {
        int i;
        String str;
        getWindow().addFlags(Integer.MIN_VALUE);
        super.onCreate(bundle);
        setContentView(2131626995);
        Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
        setSupportActionBar(A0G2);
        this.A08 = this.A09.A06(this, "content-distribution-recipients-picker");
        this.A0A = new AnonymousClass4VZ(this, findViewById(2131434898), new C1424779p(this, 0), A0G2, this.A00);
        this.A0K = getIntent().getBooleanExtra("is_black_list", true);
        C003401n A0J2 = AnonymousClass3MY.A0J(this);
        A0J2.A0W(true);
        boolean z = this instanceof StatusRecipientsActivity;
        if (this.A0K) {
            if (z) {
                i = 2131896379;
            } else if (this instanceof ProfilePhotoBlockListPickerActivity) {
                i = 2131895621;
            } else if ((this instanceof PixBlockListPickerActivity) || (this instanceof AboutStatusBlockListPickerActivity)) {
                i = 2131895594;
            } else if (this instanceof LastSeenBlockListPickerActivity) {
                i = 2131895606;
            } else {
                if (this instanceof GroupAddBlacklistPickerActivity) {
                    i = 2131890879;
                }
                i = 0;
            }
        } else if (z) {
            i = 2131896380;
        } else {
            if (!(this instanceof ProfilePhotoBlockListPickerActivity) && !(this instanceof PixBlockListPickerActivity) && !(this instanceof AboutStatusBlockListPickerActivity) && !(this instanceof LastSeenBlockListPickerActivity) && !(this instanceof GroupAddBlacklistPickerActivity)) {
                i = 2131886848;
            }
            i = 0;
        }
        A0J2.A0M(i);
        if (bundle != null) {
            ArrayList A0A2 = C22971Dz.A0A(UserJid.class, bundle.getStringArrayList("selected_jids"));
            if (!A0A2.isEmpty()) {
                this.A0S.addAll(A0A2);
            }
        } else if (!AnonymousClass3MX.A1W(this.A0E) && !C72463Mc.A1W(this.A0D)) {
            AnonymousClass74O.A0A(this, 2131894313, 2131894312, 150, false);
        }
        View findViewById = findViewById(2131430123);
        this.A0M = findViewById;
        findViewById.setOnClickListener(new C177649Aa(this, 0));
        if (this instanceof ProfilePhotoBlockListPickerActivity) {
            ProfilePhotoBlockListPickerActivity profilePhotoBlockListPickerActivity = (ProfilePhotoBlockListPickerActivity) this;
            AnonymousClass00H r0 = profilePhotoBlockListPickerActivity.A00;
            if (r0 != null) {
                AnonymousClass7AQ.A00(profilePhotoBlockListPickerActivity, ((C60112nP) r0.get()).A00(), 25);
            } else {
                str = "profilePhotoBlockListManager";
                C18070vi.A11(str);
                throw null;
            }
        } else if (this instanceof PixBlockListPickerActivity) {
            PixBlockListPickerActivity pixBlockListPickerActivity = (PixBlockListPickerActivity) this;
            C48212Lp r02 = pixBlockListPickerActivity.A00;
            if (r02 != null) {
                AnonymousClass7AQ.A00(pixBlockListPickerActivity, r02.A00(), 23);
            } else {
                str = "pixBlockListManager";
                C18070vi.A11(str);
                throw null;
            }
        } else if (this instanceof AboutStatusBlockListPickerActivity) {
            AboutStatusBlockListPickerActivity aboutStatusBlockListPickerActivity = (AboutStatusBlockListPickerActivity) this;
            AnonymousClass7AQ.A00(aboutStatusBlockListPickerActivity, ((C60112nP) aboutStatusBlockListPickerActivity.A00.get()).A00(), 22);
        } else if (this instanceof LastSeenBlockListPickerActivity) {
            LastSeenBlockListPickerActivity lastSeenBlockListPickerActivity = (LastSeenBlockListPickerActivity) this;
            AnonymousClass00H r03 = lastSeenBlockListPickerActivity.A00;
            if (r03 != null) {
                AnonymousClass7AT.A01(lastSeenBlockListPickerActivity, ((C60112nP) r03.get()).A00(), AnonymousClass7SB.A00(lastSeenBlockListPickerActivity, 18), 38);
            } else {
                str = "lastSeenBlockListManager";
                C18070vi.A11(str);
                throw null;
            }
        } else if (this instanceof GroupAddBlacklistPickerActivity) {
            GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = (GroupAddBlacklistPickerActivity) this;
            AnonymousClass7AO.A00(groupAddBlacklistPickerActivity, ((C60112nP) groupAddBlacklistPickerActivity.A00.get()).A00(), 27);
        } else if (this instanceof AvatarStickerAllowListPickerActivity) {
            AvatarStickerAllowListPickerActivity avatarStickerAllowListPickerActivity = (AvatarStickerAllowListPickerActivity) this;
            AnonymousClass00H r04 = avatarStickerAllowListPickerActivity.A00;
            if (r04 != null) {
                AnonymousClass7AT.A01(avatarStickerAllowListPickerActivity, ((C60112nP) r04.get()).A00(), new C157507xc(avatarStickerAllowListPickerActivity), 1);
            } else {
                str = "stickerAllowListManager";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            A4e();
        }
        AnonymousClass3MX.A1H(this, 16908292, 0);
        AnonymousClass3MX.A1H(this, 2131431631, 0);
        this.A06.registerObserver(this.A0T);
        C17880vN.A0V(this.A0C).registerObserver(this.A0U);
        C17880vN.A0V(this.A0E).registerObserver(this.A0V);
    }

    public static void A0y(C114635rQ r3) {
        AnonymousClass6LZ r1 = r3.A02;
        if (r1 != null) {
            r1.A0B(true);
            r3.A02 = null;
        }
        AnonymousClass6LZ r12 = new AnonymousClass6LZ(r3, r3.A0H, r3.A0I);
        r3.A02 = r12;
        C17890vO.A0u(r12, r3.A05);
    }

    public static void A0z(C114635rQ r2) {
        boolean A1G = C108975cc.A1G(r2.A03);
        AnonymousClass6LZ r0 = r2.A02;
        if (r0 != null) {
            r0.A0B(A1G);
            r2.A02 = null;
        }
        AnonymousClass6LT r1 = new AnonymousClass6LT(r2, r2.A0S);
        r2.A03 = r1;
        C17890vO.A0u(r1, r2.A05);
    }

    public static void A10(C114635rQ r1, AnonymousClass1K1 r2, AnonymousClass10E r3, AnonymousClass10G r4) {
        r1.A00 = C000200d.A00(r2.A63);
        r1.A01 = C19890zB.A00;
        r1.A09 = (C27201Vd) r3.A2j.get();
        r1.A05 = (AnonymousClass1M9) r3.A2f.get();
        r1.A07 = (C24921Me) r3.ABX.get();
        r1.A0B = C000200d.A00(r3.A0x);
        r1.A0C = C000200d.A00(r3.A2A);
        r1.A0D = C000200d.A00(r3.A2b);
        r1.A0F = C000200d.A00(r2.A4W);
        r1.A0E = C000200d.A00(r3.A4u);
        r1.A04 = (C72043Kk) r4.A1j.get();
        r1.A06 = (C24671Lf) r3.A2g.get();
    }

    public static void A11(AnonymousClass1FU r2) {
        r2.A05.A07(0, 2131891349);
    }

    public List A4c() {
        String str;
        if (this instanceof StatusRecipientsActivity) {
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) this;
            if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
                return StatusTemporalRecipientsActivity.A12((StatusTemporalRecipientsActivity) statusRecipientsActivity).A01;
            }
            C24661Le r0 = statusRecipientsActivity.A03;
            if (r0 != null) {
                return r0.A0A();
            }
            str = "statusStore";
        } else if (this instanceof ProfilePhotoBlockListPickerActivity) {
            return AnonymousClass000.A13();
        } else {
            if (this instanceof PixBlockListPickerActivity) {
                return AnonymousClass000.A13();
            }
            if (!(this instanceof AvatarStickerAllowListPickerActivity)) {
                return new LinkedList();
            }
            AnonymousClass00H r02 = ((AvatarStickerAllowListPickerActivity) this).A00;
            if (r02 != null) {
                return new LinkedList(((C60112nP) r02.get()).A03());
            }
            str = "stickerAllowListManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A4d() {
        String str;
        List A10;
        List A13;
        boolean z;
        boolean z2;
        int i;
        if (this instanceof StatusRecipientsActivity) {
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) this;
            if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
                StatusTemporalRecipientsActivity statusTemporalRecipientsActivity = (StatusTemporalRecipientsActivity) statusRecipientsActivity;
                Log.i("StatusTemporalRecipientsActivity/onDoneButtonClicked");
                AnonymousClass00H r0 = statusTemporalRecipientsActivity.A03;
                if (r0 != null) {
                    if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(r0), 8104)) {
                        AnonymousClass00H r02 = statusTemporalRecipientsActivity.A04;
                        if (r02 != null) {
                            ((C126426ci) r02.get()).A00.A04("tap_save");
                        } else {
                            str = "statusQplLoggerLazy";
                        }
                    }
                    if (!statusTemporalRecipientsActivity.A4g()) {
                        Intent A0A2 = C17880vN.A0A();
                        AnonymousClass00H r03 = statusTemporalRecipientsActivity.A02;
                        if (r03 != null) {
                            AnonymousClass727 A0u = C108945cZ.A0u(r03);
                            if (statusTemporalRecipientsActivity.A0K) {
                                AnonymousClass77K r04 = statusTemporalRecipientsActivity.A00;
                                if (r04 != null) {
                                    A10 = r04.A01;
                                } else {
                                    A10 = AnonymousClass000.A13();
                                }
                                Set set = statusTemporalRecipientsActivity.A0S;
                                C18070vi.A0W(set);
                                A13 = C17880vN.A10(set);
                                AnonymousClass77K r05 = statusTemporalRecipientsActivity.A00;
                                if (r05 != null) {
                                    z2 = r05.A05;
                                } else {
                                    z2 = false;
                                }
                                i = 2;
                            } else {
                                Set set2 = statusTemporalRecipientsActivity.A0S;
                                C18070vi.A0W(set2);
                                A10 = C17880vN.A10(set2);
                                AnonymousClass77K r06 = statusTemporalRecipientsActivity.A00;
                                if (r06 != null) {
                                    A13 = r06.A02;
                                    z = r06.A05;
                                } else {
                                    A13 = AnonymousClass000.A13();
                                    z = false;
                                }
                                i = 1;
                            }
                            AnonymousClass77K r4 = new AnonymousClass77K(A10, A13, i, z2, false, false, false);
                            statusTemporalRecipientsActivity.A00 = r4;
                            A0u.A03(A0A2, r4);
                            statusTemporalRecipientsActivity.setResult(-1, A0A2);
                            C108965cb.A17(statusTemporalRecipientsActivity);
                            statusTemporalRecipientsActivity.finish();
                            return;
                        }
                        str = "statusAudienceRepository";
                    } else {
                        return;
                    }
                } else {
                    str = "statusConfig";
                }
            } else if (!statusRecipientsActivity.A4g()) {
                statusRecipientsActivity.setResult(-1, C17880vN.A0A());
                C108965cb.A17(statusRecipientsActivity);
                int A032 = C72453Mb.A03(statusRecipientsActivity.A0K ? 1 : 0);
                int i2 = -1;
                if (C18020vd.A05(C18040vf.A01, statusRecipientsActivity.A0E, 2531)) {
                    i2 = 0;
                }
                AnonymousClass10I r1 = statusRecipientsActivity.A05;
                C56422hR r2 = statusRecipientsActivity.A00;
                if (r2 != null) {
                    AnonymousClass3MW.A1T(r2.A00(statusRecipientsActivity, statusRecipientsActivity.A0S, A032, i2, 2131896392, 0, true, false, true, true, true), r1, 0);
                    return;
                }
                str = "factory";
            } else {
                return;
            }
        } else if (this instanceof ProfilePhotoBlockListPickerActivity) {
            ProfilePhotoBlockListPickerActivity profilePhotoBlockListPickerActivity = (ProfilePhotoBlockListPickerActivity) this;
            A11(profilePhotoBlockListPickerActivity);
            AnonymousClass00H r07 = profilePhotoBlockListPickerActivity.A00;
            if (r07 != null) {
                Set set3 = profilePhotoBlockListPickerActivity.A0S;
                C18070vi.A0W(set3);
                AnonymousClass7AQ.A00(profilePhotoBlockListPickerActivity, ((C60112nP) r07.get()).A01(set3), 26);
                return;
            }
            str = "profilePhotoBlockListManager";
        } else if (this instanceof PixBlockListPickerActivity) {
            PixBlockListPickerActivity pixBlockListPickerActivity = (PixBlockListPickerActivity) this;
            A11(pixBlockListPickerActivity);
            C48212Lp r12 = pixBlockListPickerActivity.A00;
            if (r12 != null) {
                Set set4 = pixBlockListPickerActivity.A0S;
                C18070vi.A0W(set4);
                AnonymousClass7AQ.A00(pixBlockListPickerActivity, r12.A01(set4), 24);
                return;
            }
            str = "pixBlockListManager";
        } else if (this instanceof AboutStatusBlockListPickerActivity) {
            AboutStatusBlockListPickerActivity aboutStatusBlockListPickerActivity = (AboutStatusBlockListPickerActivity) this;
            A11(aboutStatusBlockListPickerActivity);
            AnonymousClass7AQ.A00(aboutStatusBlockListPickerActivity, ((C60112nP) aboutStatusBlockListPickerActivity.A00.get()).A01(aboutStatusBlockListPickerActivity.A0S), 21);
            return;
        } else if (this instanceof LastSeenBlockListPickerActivity) {
            LastSeenBlockListPickerActivity lastSeenBlockListPickerActivity = (LastSeenBlockListPickerActivity) this;
            A11(lastSeenBlockListPickerActivity);
            AnonymousClass00H r08 = lastSeenBlockListPickerActivity.A00;
            if (r08 != null) {
                Set set5 = lastSeenBlockListPickerActivity.A0S;
                C18070vi.A0W(set5);
                AnonymousClass7AT.A01(lastSeenBlockListPickerActivity, ((C60112nP) r08.get()).A01(set5), AnonymousClass7SB.A00(lastSeenBlockListPickerActivity, 19), 38);
                return;
            }
            str = "lastSeenBlockListManager";
        } else if (this instanceof GroupAddBlacklistPickerActivity) {
            GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = (GroupAddBlacklistPickerActivity) this;
            if (groupAddBlacklistPickerActivity.A01) {
                groupAddBlacklistPickerActivity.CMl(new NobodyDeprecatedDialogFragment());
                return;
            }
            A11(groupAddBlacklistPickerActivity);
            AnonymousClass7AO.A00(groupAddBlacklistPickerActivity, ((C60112nP) groupAddBlacklistPickerActivity.A00.get()).A01(groupAddBlacklistPickerActivity.A0S), 28);
            return;
        } else {
            AvatarStickerAllowListPickerActivity avatarStickerAllowListPickerActivity = (AvatarStickerAllowListPickerActivity) this;
            A11(avatarStickerAllowListPickerActivity);
            AnonymousClass00H r09 = avatarStickerAllowListPickerActivity.A00;
            if (r09 != null) {
                Set set6 = avatarStickerAllowListPickerActivity.A0S;
                C18070vi.A0W(set6);
                AnonymousClass7AT.A01(avatarStickerAllowListPickerActivity, ((C60112nP) r09.get()).A01(set6), new C157517xd(avatarStickerAllowListPickerActivity), 1);
                return;
            }
            str = "stickerAllowListManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4f() {
        /*
            r8 = this;
            boolean r2 = r8.A0K
            r7 = 0
            r1 = 1
            java.util.Set r6 = r8.A0S
            boolean r0 = r6.isEmpty()
            if (r2 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0042
            r0 = 2131892915(0x7f121ab3, float:1.9420592E38)
        L_0x0011:
            java.lang.String r4 = r8.getString(r0)
        L_0x0015:
            android.view.MenuItem r3 = r8.A0L
            if (r3 == 0) goto L_0x002e
            int r2 = r6.size()
            java.util.Set r0 = r8.A0J
            int r1 = r0.size()
            r0 = 2131895595(0x7f12252b, float:1.9426027E38)
            if (r2 != r1) goto L_0x002b
            r0 = 2131897352(0x7f122c08, float:1.9429591E38)
        L_0x002b:
            r3.setTitle(r0)
        L_0x002e:
            X.01n r0 = X.AnonymousClass3MY.A0J(r8)
            r0.A0R(r4)
            return
        L_0x0036:
            if (r0 == 0) goto L_0x003c
            r0 = 2131892916(0x7f121ab4, float:1.9420594E38)
            goto L_0x0011
        L_0x003c:
            X.0vb r5 = r8.A00
            r4 = 2131755403(0x7f10018b, float:1.9141684E38)
            goto L_0x0047
        L_0x0042:
            X.0vb r5 = r8.A00
            r4 = 2131755402(0x7f10018a, float:1.9141682E38)
        L_0x0047:
            int r0 = r6.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r0 = r6.size()
            X.C17880vN.A1T(r1, r0, r7)
            java.lang.String r4 = r5.A0K(r1, r4, r2)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114635rQ.A4f():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("statusrecipients/permissions denied");
            finish();
        }
    }

    public void onBackPressed() {
        if (this.A0A.A0C()) {
            this.A0A.A05(true);
            return;
        }
        Set set = this.A0Q;
        Set set2 = this.A0S;
        if (!set.containsAll(set2) || !set2.containsAll(set)) {
            CMl(new Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment());
        } else {
            finish();
        }
    }

    public boolean onSearchRequested() {
        this.A0A.A06(false);
        return false;
    }

    public C114635rQ() {
        HashSet A12 = C17880vN.A12();
        this.A0R = A12;
        this.A0P = new C27080DTf((Object) A12, 45);
        this.A0N = C17890vO.A0D();
        this.A0T = new AnonymousClass7E0(this, 0);
        this.A0U = new AnonymousClass7FF(this, 0);
        this.A0V = new AnonymousClass7ID(this, 0);
    }

    public void A4e() {
        A0z(this);
        ListView listView = (ListView) findViewById(16908298);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(1, getResources().getDimensionPixelSize(2131165285)));
        listView.addFooterView(view, (Object) null, false);
        invalidateOptionsMenu();
        listView.setAdapter(this.A0O);
        listView.setOnItemClickListener(new AnonymousClass79J(this, 1));
        A4f();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, 2131432620, 0, 2131899369).setIcon(2131232271);
        this.A00 = icon;
        icon.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new C1419977t(this, 0));
        this.A00.setVisible(AnonymousClass000.A1a(this.A0I));
        MenuItem icon2 = menu.add(0, 2131432621, 0, 2131895595).setIcon(2131232223);
        this.A0L = icon2;
        icon2.setShowAsAction(2);
        MenuItem menuItem = this.A0L;
        int i = 2131895595;
        if (this.A0S.size() == this.A0J.size()) {
            i = 2131897352;
        }
        menuItem.setTitle(i);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.unregisterObserver(this.A0T);
        C17880vN.A0V(this.A0C).unregisterObserver(this.A0U);
        C17880vN.A0V(this.A0E).unregisterObserver(this.A0V);
        this.A08.A02();
        AnonymousClass6LT r0 = this.A03;
        if (r0 != null) {
            r0.A0B(true);
            this.A03 = null;
        }
        AnonymousClass6LZ r02 = this.A02;
        if (r02 != null) {
            r02.A0B(true);
            this.A02 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131432620) {
            onSearchRequested();
            return true;
        } else if (itemId == 2131432621) {
            Set set = this.A0S;
            if (set.size() != this.A0J.size()) {
                int i = 0;
                while (true) {
                    C110265fC r1 = this.A0O;
                    if (i >= r1.getCount()) {
                        break;
                    }
                    set.add(AnonymousClass1E7.A01((AnonymousClass1E7) r1.A00.get(i)));
                    i++;
                }
            } else {
                set.clear();
            }
            this.A0O.notifyDataSetChanged();
            A4f();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            Set set2 = this.A0Q;
            Set set3 = this.A0S;
            if (!set2.containsAll(set3) || !set3.containsAll(set2)) {
                CMl(new Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment());
                return true;
            }
            finish();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0A.A03(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Set set = this.A0S;
        if (!set.isEmpty()) {
            bundle.putStringArrayList("selected_jids", C22971Dz.A0B(set));
        }
        this.A0A.A04(bundle);
    }
}
