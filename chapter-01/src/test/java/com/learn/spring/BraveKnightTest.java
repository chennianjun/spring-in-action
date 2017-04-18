package com.learn.spring;

import static org.mockito.Mockito.*;

import com.learn.spring.di.BraveKnight;
import com.learn.spring.di.Quest;
import org.junit.Test;

/**
 * Created by Subtimental on 2017/4/18.
 */
public class BraveKnightTest {
    @Test
    public void embarkOnQuest() throws Exception {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}