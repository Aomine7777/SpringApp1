package org.music;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
@Scope("prototype")
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "99 problems";
    }
}
