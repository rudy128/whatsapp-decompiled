package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass6D8;
import X.AnonymousClass6D9;
import X.AnonymousClass6EC;
import X.AnonymousClass6XG;
import X.AnonymousClass71T;
import X.AnonymousClass77O;
import X.AnonymousClass77Q;
import X.AnonymousClass7I9;
import X.AnonymousClass7L3;
import X.C108945cZ;
import X.C108955ca;
import X.C108995ce;
import X.C123076Ta;
import X.C123086Tb;
import X.C127626ef;
import X.C136936ue;
import X.C138506xC;
import X.C138886xr;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackAwait$2", f = "AvatarStickersRepository.kt", i = {0}, l = {154}, m = "invokeSuspend", n = {"currentRevision"}, s = {"L$3"})
public final class AvatarStickersRepository$fetchAvatarStickerPackAwait$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Integer $qplInstanceKey;
    public final /* synthetic */ List $socialStickerUserIds;
    public final /* synthetic */ Set $stableIds;
    public final /* synthetic */ Integer $stickerPackDownloadOrigin;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ AvatarStickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarStickerPackAwait$2(AvatarStickersRepository avatarStickersRepository, Integer num, Integer num2, List list, Set set, C30391dr r7, boolean z) {
        super(2, r7);
        this.$qplInstanceKey = num;
        this.this$0 = avatarStickersRepository;
        this.$stickerPackDownloadOrigin = num2;
        this.$stableIds = set;
        this.$defaultPack = z;
        this.$socialStickerUserIds = list;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        Integer num = this.$qplInstanceKey;
        AvatarStickersRepository$fetchAvatarStickerPackAwait$2 avatarStickersRepository$fetchAvatarStickerPackAwait$2 = new AvatarStickersRepository$fetchAvatarStickerPackAwait$2(this.this$0, num, this.$stickerPackDownloadOrigin, this.$socialStickerUserIds, this.$stableIds, r10, this.$defaultPack);
        avatarStickersRepository$fetchAvatarStickerPackAwait$2.L$0 = obj;
        return avatarStickersRepository$fetchAvatarStickerPackAwait$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Number number;
        Number number2;
        AvatarStickersRepository avatarStickersRepository;
        Object obj3;
        String str;
        C123076Ta r1;
        Integer num;
        Object obj4 = obj;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj4);
            number = this.$qplInstanceKey;
            avatarStickersRepository = this.this$0;
            number2 = this.$stickerPackDownloadOrigin;
            Set set = this.$stableIds;
            boolean z = this.$defaultPack;
            List list = this.$socialStickerUserIds;
            if (number != null) {
                try {
                    C108945cZ.A0q(avatarStickersRepository.A05).A05(AnonymousClass6EC.A00, number.intValue(), z);
                } catch (Throwable th) {
                    AnonymousClass1IU A1J = C108945cZ.A1J(th);
                    AvatarStickersRepository avatarStickersRepository2 = this.this$0;
                    Throwable th2 = A1J.exception;
                    if (th2 == null) {
                        return A1J;
                    }
                    Log.e("AvatarStickersRepository/fetchAvatarStickerPackAwait/unable to fetch sticker pack", th2);
                    C136936ue A0p = C108945cZ.A0p(avatarStickersRepository2.A04);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A0p.A02(1, "fetch_avatar_sticker_pack_failed", C17900vP.A0B(C108955ca.A10("unhandled error (", A10, th2), A10));
                    return new C30671eK(C108945cZ.A1J(th2));
                }
            }
            C127626ef r12 = (C127626ef) avatarStickersRepository.A08.get();
            String A00 = C138886xr.A00(avatarStickersRepository.A01);
            if (number2 == null || number2.intValue() != 7) {
                num = AnonymousClass00R.A00;
            } else {
                num = AnonymousClass00R.A01;
            }
            C18070vi.A0f(set, 0, list);
            List list2 = list;
            AnonymousClass7I9 BGe = r12.A01.BGe(new AnonymousClass7L3(r12, num, A00, list2, set, z));
            this.L$0 = number;
            this.L$1 = avatarStickersRepository;
            this.L$2 = number2;
            this.L$3 = A00;
            this.label = 1;
            obj4 = BGe.CBx(this, C23761Hn.A01);
            obj2 = A00;
            if (obj4 == r6) {
                return r6;
            }
        } else if (i == 1) {
            Object obj5 = this.L$3;
            number2 = (Number) this.L$2;
            avatarStickersRepository = (AvatarStickersRepository) this.L$1;
            number = (Number) this.L$0;
            C30691eM.A01(obj4);
            obj2 = obj5;
        } else {
            throw AnonymousClass000.A0l();
        }
        C138506xC r7 = (C138506xC) obj4;
        C123086Tb A002 = AnonymousClass6XG.A00(r7);
        if (A002 instanceof AnonymousClass6D8) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("AvatarStickersRepository/fetchAvatarStickerPackAwait/");
            Object obj6 = ((AnonymousClass6D8) A002).A00;
            A102.append(obj6);
            C17890vO.A0w(A102);
            C136936ue A0p2 = C108945cZ.A0p(avatarStickersRepository.A04);
            if (!(obj6 instanceof C123076Ta) || (r1 = (C123076Ta) obj6) == null || (str = AvatarStickersRepository.A01(r1)) == null) {
                str = "no data";
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("Unable to identify error for GraphQL result, code: ");
                A103.append(r7.A00);
                A103.append(", raw: ");
                A103.append(r7.A05);
                C17890vO.A0w(A103);
            }
            A0p2.A02(1, "fetch_avatar_sticker_pack_failed", str);
            return new C30671eK(C30691eM.A00(new Exception("Fetching Avatar sticker pack failed")));
        } else if (A002 instanceof AnonymousClass6D9) {
            AnonymousClass77O r13 = (AnonymousClass77O) ((AnonymousClass6D9) A002).A00;
            if (r13 != null) {
                List list3 = r13.A09;
                if (obj2 == null) {
                    C17880vN.A1E(C17890vO.A0A(((C138886xr) avatarStickersRepository.A01.get()).A00.A01), "pref_avatar_art_pending_revision", r13.A01);
                }
                if (!list3.isEmpty()) {
                    if (number != null) {
                        C108945cZ.A0q(avatarStickersRepository.A05).A03(number.intValue(), "avatar_stickerpack_generated");
                    }
                    String str2 = r13.A04;
                    String str3 = r13.A05;
                    String str4 = r13.A02;
                    String str5 = r13.A06;
                    String str6 = r13.A08;
                    String str7 = r13.A07;
                    String str8 = str7;
                    String str9 = str6;
                    String str10 = str5;
                    String str11 = str4;
                    String str12 = str3;
                    String str13 = str2;
                    AnonymousClass77Q r16 = r13.A00;
                    obj3 = ((AnonymousClass71T) avatarStickersRepository.A09.get()).A02(r16, str13, str12, str11, str10, str9, str8, r13.A03, list3);
                    if (number != null) {
                        C108945cZ.A0q(avatarStickersRepository.A05).A03(number.intValue(), "avatar_stickerpack_mapped");
                    }
                    Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str14 = ((AnonymousClass77Q) it.next()).A09;
                        if (str14 != null) {
                            AvatarSquidConfiguration avatarSquidConfiguration = (AvatarSquidConfiguration) avatarStickersRepository.A06.get();
                            if (avatarSquidConfiguration.A03()) {
                                C17880vN.A1E(C108995ce.A0F(avatarSquidConfiguration.A02).edit(), "pref_squid_version", str14);
                            } else {
                                AnonymousClass00H r9 = avatarSquidConfiguration.A02;
                                C17880vN.A1E(C108995ce.A0F(r9).edit(), "pref_squid_version", str14);
                                if (str14.equals("Style2") && number2 != null && number2.intValue() == 7) {
                                    C17880vN.A1F(C108995ce.A0F(r9).edit(), "pref_automatic_squid", true);
                                }
                            }
                        }
                    }
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str15 = ((AnonymousClass77Q) it2.next()).A07;
                            if (str15 != null) {
                                C17880vN.A1E(C17890vO.A0A(((C138886xr) avatarStickersRepository.A01.get()).A00.A01), "pref_avatar_art_revision", str15);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    Log.e("AvatarStickersRepository/fetchAvatarStickerPackAwait/received empty stickers list");
                    C108945cZ.A0p(avatarStickersRepository.A04).A02(1, "fetch_avatar_sticker_pack_failed", "received empty stickers");
                    return new C30671eK(C30691eM.A00(new Exception("Received empty stickers list")));
                }
            } else {
                obj3 = C30691eM.A00(new Exception("Unwrapped data was null"));
            }
            return new C30671eK(obj3);
        } else {
            throw AnonymousClass3MW.A14();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchAvatarStickerPackAwait$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
