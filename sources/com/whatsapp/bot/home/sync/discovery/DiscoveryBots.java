package com.whatsapp.bot.home.sync.discovery;

import X.AnonymousClass20Q;
import X.C18070vi;
import java.util.List;

public final class DiscoveryBots {
    public final long A00;
    public final AnonymousClass20Q A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoveryBots) {
                DiscoveryBots discoveryBots = (DiscoveryBots) obj;
                if (!C18070vi.A18(this.A01, discoveryBots.A01) || !C18070vi.A18(this.A02, discoveryBots.A02) || this.A00 != discoveryBots.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoveryBots(defaultBot=");
        sb.append(this.A01);
        sb.append(", sections=");
        sb.append(this.A02);
        sb.append(", timestampMs=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public int hashCode() {
        long j = this.A00;
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public DiscoveryBots(AnonymousClass20Q r1, List list, long j) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = j;
    }
}
