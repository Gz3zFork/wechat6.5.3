package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class cn extends a {
    public String mcK;
    public String mcL;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.mcK != null) {
                aVar.e(1, this.mcK);
            }
            if (this.mcL == null) {
                return 0;
            }
            aVar.e(2, this.mcL);
            return 0;
        } else if (i == 1) {
            if (this.mcK != null) {
                r0 = a.a.a.b.b.a.f(1, this.mcK) + 0;
            } else {
                r0 = 0;
            }
            if (this.mcL != null) {
                r0 += a.a.a.b.b.a.f(2, this.mcL);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            cn cnVar = (cn) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cnVar.mcK = aVar3.pMj.readString();
                    return 0;
                case 2:
                    cnVar.mcL = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
