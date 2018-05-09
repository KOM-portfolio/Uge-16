package dk.sdu.mmmi.cbse.enemy;

import dk.sdu.mmmi.cbse.commonlaser.IShootLaser;
import org.openide.util.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author chris
 */
@Configuration
public class EnemyConfig {
    private final Lookup lookup = Lookup.getDefault();
    
    @Bean
    public IShootLaser laserService(){
        return this.lookup.lookup(IShootLaser.class);
    }
}


