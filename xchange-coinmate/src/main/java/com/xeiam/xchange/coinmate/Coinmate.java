package com.xeiam.xchange.coinmate;

import com.xeiam.xchange.coinmate.dto.marketdata.CoinmateTicker;
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Martin Stachon
 */
@Path("api")
@Produces(MediaType.APPLICATION_JSON)
public interface Coinmate {

    @GET
    @Path("ticker")
    public CoinmateTicker getTicker(@QueryParam("currencyPair") String currencyPair) throws IOException;

}
